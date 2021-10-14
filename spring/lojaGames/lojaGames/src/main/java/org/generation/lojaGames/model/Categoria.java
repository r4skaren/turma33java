package org.generation.lojaGames.model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity 
@Table(name = "tb_categoria") 

public class Categoria {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id; 
		
		@NotBlank
		@Size(min = 5, max = 100, message = "O atributo título deve conter no mínimo 05 e no máximo 100 caracteres") //determina a quantidade caracter q o cliente consegue enviar como título
		private String titulo;
		
		@NotBlank(message = "O atributo texto é Obrigatório!")
		@Size(min = 10, max = 500)
		private String text;
		
		@Temporal(TemporalType.TIMESTAMP) 
		private Date date = new java.sql.Date(System.currentTimeMillis());
		
		@OneToMany
		@JsonIgnoreProperties("categoria")
		private List<Produto> produto;
		
		public List<Produto> getProduto() {
			return produto;
		}
		public void setProduto(List<Produto> produto) {
			this.produto = produto;
		}
		@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("tema")
		private Usuario usuario;
		
		//encapsulamento
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
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
}
