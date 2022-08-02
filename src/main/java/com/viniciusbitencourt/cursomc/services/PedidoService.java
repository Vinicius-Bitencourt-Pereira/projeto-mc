package com.viniciusbitencourt.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viniciusbitencourt.cursomc.domain.Pedido;
import com.viniciusbitencourt.cursomc.repositories.PedidoRepository;
import com.viniciusbitencourt.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! id: " + id + ", tipo: " + Pedido.class.getName()));
	}
	
}
