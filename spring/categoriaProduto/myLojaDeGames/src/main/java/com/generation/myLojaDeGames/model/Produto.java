package com.generation.myLojaDeGames.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@Column(name = "Titulo")
	@NotNull(message = "Este campo deve conter a informação correspondente a Título!")
	@Size(min = 5, max = 40, message = "Para um bom título é necessário no mínimo 5 caracteres e no máximo 40.")
	private String titulo;
	
	@Column(name = "Descricao")
	@NotNull(message = "Este campo deve conter a informação correspondente a Título!")
	@Size(min = 10, max = 500, message = "Para uma boa descrição é necessário no mínimo 10 caracteres e no máximo 500.")
	private String descricao;

	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoria_id")
	@JsonIgnoreProperties("tb_produto")
	private Categoria categoria;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return titulo;
	}

	public void setNome(String nome) {
		this.titulo = nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}