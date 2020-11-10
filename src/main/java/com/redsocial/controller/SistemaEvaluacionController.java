package com.redsocial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redsocial.entity.SistemaEvaluacion;
import com.redsocial.service.SistemaEvaluacionService;

@RestController
@RequestMapping("/api/rest/sistemaevaluacion/")
public class SistemaEvaluacionController {

	@Autowired
	private SistemaEvaluacionService	 service;

	@GetMapping
	public ResponseEntity<List<SistemaEvaluacion>> lista() {
		return ResponseEntity.ok(service.listaSistemaEvaluacion());
	}

}
