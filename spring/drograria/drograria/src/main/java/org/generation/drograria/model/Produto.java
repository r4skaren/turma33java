package org.generation.drograria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
			
			@NotNull(message = "É necessário digitar algo.")
			@Size(min = 5, max = 100, message = "Deve conter no mínimo 05 e no máximo 100 caracteres")
			private String nome;
			
			@NotNull(message = "É necessário digitar algo.")
			private double preco;
			
			@NotNull(message = "É necessário digitar algo.")
			private boolean disponivel;
			
			@ManyToOne
			@JsonIgnoreProperties("produto")
			private Categoria categoria;


			public long getId() {
				return id;
			}

			public void setId(long id) {
				this.id = id;
			}

			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public double getPreco() {
				return preco;
			}

			public void setPreco(double preco) {
				this.preco = preco;
			}

			public boolean isDisponivel() {
				return disponivel;
			}

			public void setDisponivel(boolean disponivel) {
				this.disponivel = disponivel;
			}

			public Categoria getCategoria() {
				return categoria;
			}

			public void setCategoria(Categoria categoria) {
				this.categoria = categoria;
			}
}
