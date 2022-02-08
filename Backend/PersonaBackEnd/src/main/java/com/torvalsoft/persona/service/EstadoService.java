package com.torvalsoft.persona.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.torvalsoft.persona.model.Estado;
import com.torvalsoft.persona.repository.EstadoRepository;

@Service
public class EstadoService   {

	@Autowired
	private EstadoRepository estadoRepository ;

	
	public List<Estado> obtenerListaEstados() {
		// TODO Auto-generated method stub
		return estadoRepository.findAll();
	}

	public List<Estado> obtenerListaEstadoPais(long id){
		List<Estado> listaEstado = new ArrayList<>();
		List<Estado> estado = estadoRepository.findAll();
		for (Estado e : estado) {
			if (e.getPais().getId()==id) {
				listaEstado.add(e);
			}
		}
		return listaEstado;
	}
	
} 
