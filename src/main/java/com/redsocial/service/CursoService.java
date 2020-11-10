package com.redsocial.service;

import java.util.List;

import com.redsocial.entity.Curso;

public interface CursoService {

	public abstract Curso inserta(Curso obj);
	public abstract List<Curso> listaCurso();
}
