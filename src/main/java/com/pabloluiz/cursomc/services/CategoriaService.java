package com.pabloluiz.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pabloluiz.cursomc.domain.Categoria;
import com.pabloluiz.cursomc.repositories.CategoriaRepository;
import com.pabloluiz.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado. Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
}
