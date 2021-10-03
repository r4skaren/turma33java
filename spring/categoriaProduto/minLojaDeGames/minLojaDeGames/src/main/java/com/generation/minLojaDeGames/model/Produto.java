package com.generation.minLojaDeGames.model;

import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id; 
import javax.persistence.JoinColumn; 
import javax.persistence.OneToMany; 
import javax.persistence.Table; 
import javax.validation.constraints.NotNull; 
import javax.validation.constraints.Size; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
			public class Produto {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@NotNull
		private double preco;
		
		@NotNull
		@Size(min = 5, max = 200)
		private String titulo;


		@OneToMany
		@JoinColumn(name = "categoria_id")
		@JsonIgnoreProperties("tb_produto")
		private Categoria categoria;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public Categoria getCategoria() {
			return categoria;
		}

		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
	}