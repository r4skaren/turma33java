<div style="display: inline_block">
    <h1 align="CENTER"> MODEL </h1>
 

   <p align="center">
       <a href="https://github.com/r4skaren">
        <img src="https://img.shields.io/github/last-commit/r4skaren/Blog-Pessoal?color=black%20&label=Ultimo%20commit&logo=github&style=flat-square"/>
        </a>
<h1></h1>
  

<br>
A camada model de forma resumida é responsável pela abstração de nossos objetos e tabelas em nosso BD, a partir dai:
<br>
<br>

<a name="summary"></a>

## 📖 Para saber mais sobre esta camada acesse:

1. [Controller e explicação detalhada:](https://github.com/RenToGen/Back-End/tree/main/spring/src/main/java/com/generation/rento/model)<br>
    1.1. [Categoria](https://github.com/RenToGen/Back-End/tree/main/spring/src/main/java/com/generation/rento/model#rocket-apresentando-o-c%C3%B3digo--categoria)<br>
    1.2. [Produto](https://github.com/RenToGen/Back-End/tree/main/spring/src/main/java/com/generation/rento/model#rocket-apresentando-o-c%C3%B3digo--categoria)<br>
    1.3. [Usuario](https://github.com/r4skaren/Blog-Pessoal/new/main/spring/blogPessoal/src/main/java/org/generation/blogPessoal/model#-usuario-)<br>
    1.4. [UsuarioLogin](https://github.com/r4skaren/Blog-Pessoal/new/main/spring/blogPessoal/src/main/java/org/generation/blogPessoal/model#-usuariologin-)
<br>
  
 💥 Como este é um documento ativo, alterações podem ocorrer a qualquer momento. O projeto direcionado a cima se trata de uma regra diferente. Porém é perceptivo e didático seu exemplo.
 
<br>
  
<hr size="3">
  
<h1 align="CENTER"> Usuario </h1>
  
### :memo: Descrição
Entidade que vai determinar como vai ser a base de dados. E saberá sobre todos os usuários.

  <br>
  
### :rocket: O projeto
Para rodar o repositório é necessário clonar o mesmo.
  
  <br>
  
~~~Java

@Entity
@Table(name = "usuarios")//Nomear a tabela
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Este espaco nao pode ser nulo e nem conter apenas espacamento!")
	@Size(min = 5, max = 70, message = "Este espaco nao pode ser nulo")
	private String nome;
	
	@NotBlank(message = "Este espaco nao pode ser nulo e nem conter apenas espacamento!")
	@Size(min = 5, max = 100, message = "Este espaco nao pode ser nulo")
	private String usuario;
	
	@NotBlank(message = "Este espaco nao pode ser nulo e nem conter apenas espacamento!")
	@Size(min = 5, message = "Este espaco nao pode ser nulo")
	private String senha;
  
~~~

## 🔺 ANOTAÇÕES:

* **@Entity:** Para fazer mapeamento dos elementos da base de dados para os elementos da aplicação orientada a objetos.
* **@GeneratedValue(strategy = GenerationType.IDENTITY):** Gerar chave primária. E a IDENTITY, o Hibernate utilizará como estratégia para geração AUTO_INCREMENT.
  
<br>
  
<hr size="3">
  
<h1 align="CENTER"> UsuarioLogin </h1>
  
### :memo: Descrição
Gera o token e é responsável pela resposta ao client.

  <br>
  
### :rocket: O projeto
Para rodar o repositório é necessário clonar o mesmo.
  
  <br>
  
~~~Java

public class UsuarioLogin {
	
	private long id;
	
	private String nome;
	
	private String usuario;
	
	private String senha;
	
	private String token;

	public long getId() {
		return id;
	}
  
~~~

## 🔺 ANOTAÇÕES:

* Não se esqueça dos Getters and Setters!
