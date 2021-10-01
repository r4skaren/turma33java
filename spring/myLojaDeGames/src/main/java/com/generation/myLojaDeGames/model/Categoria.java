package com.generation.myLojaDeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "tb_categoria")

public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "Este campo deve conter a informação correspondente a Título!")
	@Size(min = 5, max = 100, message = "Para um bom título é necessário no mínimo 5 caracteres e no máximo 100.")
	private String titulo; 
	
	@NotNull(message = "Este campo deve conter a informação correspondente a Título!")
	@Size(min = 10, max = 500, message = "Para uma boa descrição é necessário no mínimo 10 caracteres e no máximo 500.")
	private String descricao; 

	@NotBlank(message = "Este campo deve conter a informação correspondente a um valor! Nada de dar espaços, isso não irá funcionar 😁")
	private double valor; 
	
	@ManyToOne
	@JoinColumn(name = "produto")
	private Produto produto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescriao() {
		return descricao;
	}

	public void setDescrição(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}