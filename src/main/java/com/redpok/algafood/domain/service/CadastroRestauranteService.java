package com.redpok.algafood.domain.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redpok.algafood.domain.exception.EntidadeNaoEncontradaException;
import com.redpok.algafood.domain.model.Cozinha;
import com.redpok.algafood.domain.model.Restaurante;
import com.redpok.algafood.domain.repository.CozinhaRepository;
import com.redpok.algafood.domain.repository.RestauranteRepository;

@Service
public class CadastroRestauranteService {

	@Autowired
	private RestauranteRepository restauranteRepository;

	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	public Restaurante salvar(Restaurante restaurante) {
		Long cozinhaId = restaurante.getCozinha().getId();
		Optional<Cozinha> cozinha = cozinhaRepository.findById(cozinhaId);
		
		if(cozinha.isEmpty()) {
			throw new EntidadeNaoEncontradaException(
					String.format("Não existe cadastro de cozinha com código %d", cozinhaId));
		}
		
		restaurante.setCozinha(cozinha.get());
		
		return restauranteRepository.save(restaurante);
	}
}
