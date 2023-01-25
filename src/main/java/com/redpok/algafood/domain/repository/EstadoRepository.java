package com.redpok.algafood.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redpok.algafood.domain.model.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
	
}
