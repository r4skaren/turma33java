<div style="display: inline_block">
    <h1 align="CENTER"> REPOSITORY </h1>
 

   <p align="center">
       <a href="https://github.com/r4skaren">
        <img src="https://img.shields.io/github/last-commit/r4skaren/Blog-Pessoal?color=black%20&label=Ultimo%20commit&logo=github&style=flat-square"/>
        </a>
<h1></h1>
  

<br>
A camada repository estabelece comunicação com banco de dados, a partir dai:
<br>
<br>

<a name="summary"></a>

## 📖 Para saber mais sobre esta camada acesse:

1. [Controller e explicação detalhada:](https://github.com/RenToGen/Back-End/tree/main/spring/src/main/java/com/generation/rento/model)<br>
    1.1. [CategoriaRepository](https://github.com/RenToGen/Back-End/tree/main/spring/src/main/java/com/generation/rento/repository#rocket-apresentando-o-c%C3%B3digo--categoriarepository)<br>
    1.2. [ProdutoRepository](https://github.com/RenToGen/Back-End/tree/main/spring/src/main/java/com/generation/rento/repository#rocket-c%C3%B3digo--produtocontroller)<br>
    1.3. [UsuarioRepository](https://github.com/r4skaren/Blog-Pessoal/new/main/spring/blogPessoal/src/main/java/org/generation/blogPessoal/repository#-usuariorepository-)

<br>
  
 💥 Como este é um documento ativo, alterações podem ocorrer a qualquer momento. O projeto direcionado a cima se trata de uma regra diferente. Porém é perceptivo e didático seu exemplo.
 
<br>
  
<hr size="3">
  
<h1 align="CENTER"> UsuarioRepository </h1>
  
### :memo: Descrição
Entidade que vai determinar como vai ser a base de dados. E saberá sobre todos os usuários.

  <br>
  
### :rocket: O projeto
Para rodar o repositório é necessário clonar o mesmo.
  
  <br>
  
~~~Java

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Optional<Usuario> findByUsuario(String usuario);
	public List <Usuario> findAllByNomeContainingIgnoreCase (String nome);
	public Usuario findByNome(String nome);
}
  
~~~

## 🔺 ANOTAÇÕES:

* Lembre-se isso é na minha máquina e em cada uma pode haver linhas que não funcione. Eu sei explicar nesse exato momento? Não, mas é a vida, seguimos fazendo :)
* **Optional:** Garante que rode uma lista nula.
  
<br>
  
