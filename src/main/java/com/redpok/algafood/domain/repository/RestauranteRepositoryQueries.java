package com.redpok.algafood.domain.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.redpok.algafood.domain.model.Restaurante;

@Repository
public interface RestauranteRepositoryQueries {

	public List<Restaurante> find(String nome, 
			BigDecimal taxaFreteInicial, BigDecimal taxaFreteFinal);
	
	List<Restaurante> findComFreteGratis(String nome);
	
}
