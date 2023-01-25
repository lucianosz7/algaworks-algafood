package com.redpok.algafood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.redpok.algafood.domain.exception.EntidadeEmUsoException;
import com.redpok.algafood.domain.exception.EntidadeNaoEncontradaException;
import com.redpok.algafood.domain.model.Cozinha;
import com.redpok.algafood.domain.repository.CozinhaRepository;

@Service
public class CadastroCozinhaService {

	@Autowired
	private CozinhaRepository cozinhaRespository;
	
	public Cozinha salvar(Cozinha cozinha) {
		return cozinhaRespository.save(cozinha);
	}
	
	public void excluir(Long cozinhaId) {
		try {
			cozinhaRespository.deleteById(cozinhaId);
		}catch (EmptyResultDataAccessException e) {
			throw new EntidadeNaoEncontradaException(
					String.format("Não existe um cadastro de cozinha com código %d", cozinhaId));
		}catch (DataIntegrityViolationException e) {
			throw new EntidadeEmUsoException(
					String.format("Cozinha de código %d não pode ser removida, pois está em uso", cozinhaId));
		}
	}
}
