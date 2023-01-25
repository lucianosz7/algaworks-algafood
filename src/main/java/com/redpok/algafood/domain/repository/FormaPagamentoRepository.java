package com.redpok.algafood.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redpok.algafood.domain.model.FormaPagamento;

public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento, Long>{
	
}
