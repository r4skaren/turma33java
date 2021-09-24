package com.turma33.Objetivos.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/objetivos")
public class Objetivos {
	@GetMapping
	public String objetivosDeAprendizagem() {
		return "Meus objetivos de aprendizagem para semana se dão em torno de:"
				+ "\n💫 Ter o conhecimento alinhado a respeito de BD;"
				+ "\n💫 Práticar e desenvolver Spring Boot.";
	}
}
