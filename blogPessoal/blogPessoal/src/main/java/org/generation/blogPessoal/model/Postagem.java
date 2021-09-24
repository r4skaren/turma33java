package org.generation.blogPessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity //indica essa classe vai ser uma entidade do jpa //vai virar uma tabela
@Table(name = "postagem") //como vai ser nomeada

//anotações = parametros colocados a cima das classes e definem um comportamento
public class Postagem {
		
		@Id
		//como o Id vai comportar
		@GeneratedValue(strategy = GenerationType.IDENTITY) //vai se tornar uma chave primária
		private long id; //da postagem
		
		@NotNull
		@Size(min = 5, max = 100) //determina a quantidade caracter q o cliente consegue enviar como título
		private String titulo;
		
		@NotNull
		@Size(min = 10, max = 500)
		private String text;
		
		@Temporal(TemporalType.TIMESTAMP) //indicar que estamos trabalhando com tempo
		private Date date = new java.sql.Date(System.currentTimeMillis()); //assim que passar dados pela classe captura data, hora, seg e milesimos
		
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
