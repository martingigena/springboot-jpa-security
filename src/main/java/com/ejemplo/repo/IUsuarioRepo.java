package com.ejemplo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplo.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{

	
	Usuario findByNombre(String nombre);
}
