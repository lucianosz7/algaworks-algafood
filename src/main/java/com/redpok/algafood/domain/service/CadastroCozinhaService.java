package com.redpok.algafood.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redpok.algafood.domain.model.Cozinha;
import com.redpok.algafood.domain.repository.CozinhaRepository;

@Service
public class CadastroCozinhaService {

	@Autowired
	private CozinhaRepository cozinhaRespository;
	
	public Cozinha salvar(Cozinha cozinha) {
		return cozinhaRespository.salvar(cozinha);
	}
}
