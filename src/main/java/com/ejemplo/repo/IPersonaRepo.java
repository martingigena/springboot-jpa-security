package com.ejemplo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplo.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
