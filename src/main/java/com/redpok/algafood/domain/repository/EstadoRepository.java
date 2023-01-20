package com.redpok.algafood.domain.repository;

import java.util.List;

import com.redpok.algafood.domain.model.Estado;

public interface EstadoRepository {
	
	List<Estado> listar();
	Estado buscar(Long id);
	Estado salvar(Estado estado);
	void remover(Estado estado);
	

}
