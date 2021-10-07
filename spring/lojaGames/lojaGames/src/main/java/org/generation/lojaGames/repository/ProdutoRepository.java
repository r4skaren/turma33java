package org.generation.lojaGames.repository;

import java.util.List;

import org.generation.lojaGames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
			public List<Produto> findAllByDescricaoContainingIgnoreCase (String descricao);  
}