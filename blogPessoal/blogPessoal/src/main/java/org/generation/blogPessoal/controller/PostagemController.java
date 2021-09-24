package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.ConditionalOnRepositoryType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//indicar que se trata de um controller
@RestController
// definir uri que a classe será acessada
@RequestMapping("/postagens")
//quando o front começar a consumir irá vim de uma origem diferente (react) independente da origem vai aceitar
@CrossOrigin("*") // * = todos
public class PostagemController {
	
		//ingetar a classe de repositório, dentro do controller
		//como é interface não da pra instânciar 
		//a responsa da instância cai sobre:
	
		@Autowired
		private PostagemRepository repository;
		
		//sempre quando vim uma requisicação externa através uri "postagens", se for get dispara o metodo
		@GetMapping
		public ResponseEntity<List<Postagem>> GetAll(){
			return ResponseEntity.ok(repository.findAll());
		}
}
