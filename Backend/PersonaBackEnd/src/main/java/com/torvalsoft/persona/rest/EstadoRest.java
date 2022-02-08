package com.torvalsoft.persona.rest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.torvalsoft.persona.model.Estado;
import com.torvalsoft.persona.service.EstadoService;

@RestController
@RequestMapping("estado")
public class EstadoRest {

	@Autowired
	private EstadoService estadoService;
	
	@GetMapping("{id}")
	private ResponseEntity<List<Estado>> obtenerListaEstado(@PathVariable("id") long id){
		return ResponseEntity.ok(estadoService.obtenerListaEstadoPais(id));
	}
}
