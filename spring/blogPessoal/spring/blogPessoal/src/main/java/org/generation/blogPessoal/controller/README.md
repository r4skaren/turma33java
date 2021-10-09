<div style="display: inline_block">
    <h1 align="CENTER"> CONTROLLER </h1>
 

   <p align="center">
       <a href="https://github.com/RenToGen">
        <img src="https://img.shields.io/github/last-commit/r4skaren/Blog-Pessoal?color=black%20&label=Ultimo%20commit&logo=github&style=flat-square"/>
        </a>
<h1></h1>
  

<br>
A camada controller de forma resumida tem controle sobre as requisições feitas de fora da API, a partir dai:
<br>
<br>

<a name="summary"></a>

## 📖 Para saber mais sobre esta camada acesse:

1. [Controller e explicação detalhada:](https://github.com/RenToGen/Back-End/tree/main/spring/src/main/java/com/generation/rento/controller)<br>
    1.1. [CategoriaController](https://github.com/RenToGen/Back-End/tree/main/spring/src/main/java/com/generation/rento/controller#rocket-apresentando-o-c%C3%B3digo--categoriacontroller)<br>
    1.2. [ProdutoController](https://github.com/RenToGen/Back-End/tree/main/spring/src/main/java/com/generation/rento/controller#rocket-c%C3%B3digo--produtocontroller)<br>
    1.3. [UsuarioController](https://github.com/r4skaren/Blog-Pessoal/tree/main/spring/blogPessoal/src/main/java/org/generation/blogPessoal/controller#-usuariocontroller-)
<br>
  
 💥 Como este é um documento ativo, alterações podem ocorrer a qualquer momento.
 
<br>
  
<hr size="3">
  
<h1 align="CENTER"> UsuarioController </h1>
  
### :memo: Descrição
Se trata do local que rebeberá o Usuario com seu login e senha, e devolverá o recurso com a Authorization Basic + token.

  <br>
  
### :books: Funcionalidades
* <b>Funcionalidade 1</b>: É a partir daqui que podemos utilizar o Postman e fazer solicitações afim de cadastrar um user e gerar seu token em uma tela de login. 

  <br>
  
### :rocket: O projeto
Para rodar o repositório é necessário clonar o mesmo.
  
  <br>
  
~~~Java

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")

public class UsuarioController {
	
	
	@Autowired
	private UsuarioService usuarioService;

	@PostMapping("/logar")
	public ResponseEntity<UsuarioLogin> Autentication(@RequestBody Optional<UsuarioLogin> user) {
		return usuarioService.Logar(user).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}

	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> Post(@RequestBody Usuario usuario) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(usuarioService.CadastrarUsuario(usuario));
	}
}
  
~~~

  <br>
 
