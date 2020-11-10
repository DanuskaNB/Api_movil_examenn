package com.redsocial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redsocial.entity.Curso;
import com.redsocial.service.CursoService;

@RestController
@RequestMapping("/api/rest/curso/")
public class CursoController {
	
	@Autowired
	private CursoService service;
	
	@PostMapping
	public ResponseEntity<Curso> inserta(@RequestBody Curso obj){
		return ResponseEntity.ok(service.inserta(obj));
	}
	
	@GetMapping
	public ResponseEntity<List<Curso>> lista() {
		return ResponseEntity.ok(service.listaCurso());
	}
	
}



