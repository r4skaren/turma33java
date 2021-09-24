package com.turma33.Habilidades.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/habilidades")
public class HabilidadesMentalidades{
	@GetMapping
	public String habilidadesMentalidades() {
		return "Habilidade: Atenção aos detalhes; \nMentalidade: Persistência.";
	}
}
