package com.torvalsoft.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.torvalsoft.persona.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
