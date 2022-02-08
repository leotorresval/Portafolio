package com.torvalsoft.persona.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torvalsoft.persona.model.Persona;
import com.torvalsoft.persona.repository.PersonaRepository;

@Service
public class PersonaService   {

	@Autowired
	private PersonaRepository personaRepository;
	
	
	public Persona crearPersona(Persona p) {
		return personaRepository.save(p);
	}
	
	public Persona actualizarPersona(Persona p) {
		return personaRepository.save(p);
	}
	
	public List<Persona> obtenerListaPersona() {
		return personaRepository.findAll();
	}
}
