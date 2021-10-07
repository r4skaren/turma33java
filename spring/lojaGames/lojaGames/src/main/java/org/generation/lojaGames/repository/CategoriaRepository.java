package org.generation.lojaGames.repository;

import java.util.List;
import org.generation.lojaGames.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	public List<Categoria> findAllByTituloContainingIgnoreCase( String titulo);
}