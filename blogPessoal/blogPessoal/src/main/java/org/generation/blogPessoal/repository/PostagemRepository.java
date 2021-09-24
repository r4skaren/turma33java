package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//indicar para o spring que essa classe ela se trata de uma classe de repositório
	@Repository

//Tipo de entidade = Postagem; Qual a tipagem do ID? Long (tipo primitivo)
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
			//primeira consulta - pelo título da postagem
			public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo); //buscar pelo titulo contém (tipo o like do sql) 
			//pra não levar em consideração maiusculo e minusculo
}
