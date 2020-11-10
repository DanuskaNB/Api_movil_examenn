package com.redsocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entity.SistemaEvaluacion;
import com.redsocial.repository.SistemaEvaluacionRepository;

@Service
public class SistemaEvaluacionServiceImpl implements SistemaEvaluacionService{

	@Autowired
	private SistemaEvaluacionRepository repository;
	
	@Override
	public List<SistemaEvaluacion> listaSistemaEvaluacion() {
		return repository.findAll();
	}

	

}
