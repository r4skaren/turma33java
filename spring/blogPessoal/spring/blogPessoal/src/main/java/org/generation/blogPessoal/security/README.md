<div style="display: inline_block">
    <h1 align="CENTER"> SECURITY </h1>
 

   <p align="center">
       <a href="https://github.com/r4skaren">
        <img src="https://img.shields.io/github/last-commit/r4skaren/Blog-Pessoal?color=black%20&label=Ultimo%20commit&logo=github&style=flat-square"/>
        </a>
<h1></h1>
  

<br>
Pensando que o projeto não está completamente seguro, passasse a utilizar a nova depedência Spring Security.
<br>
<br>

<a name="summary"></a>

## 📖 Para saber mais sobre esta camada acesse:

1.  [BasicSecurityConfig](https://github.com/r4skaren/Blog-Pessoal/new/main/spring/blogPessoal/src/main/java/org/generation/blogPessoal/security#-basicsecurityconfig-)<br>
    1.1. [UserDetailsImpl]()<br>
    1.2. [UserDetailsServiceImpl]()<br>
   

<br>
  
 💥 Como este é um documento ativo, alterações podem ocorrer a qualquer momento. 
 
<br>
  
<hr size="3">
  
<h1 align="CENTER"> BasicSecurityConfig </h1>
  
### :memo: Descrição
Uma classe de configuração, configura o tipo de criptografia que será utilizada na senha, qual o tipo de segurança que utilizaremos, e também quais End Point’s que serão liberados para que usuário possa acessar

<br>
  
### :rocket: O projeto
Para rodar o repositório é necessário clonar o mesmo.
  
  <br>
  
~~~Java

@EnableWebSecurity
public class BasicSecurityConfig extends WebSecurityConfigurerAdapter {
	
	private @Autowired UserDetailsServiceImpl service;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(service);
		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/usuarios/cadastrar").permitAll()
		.antMatchers("/usuarios/logar").permitAll()
 		.anyRequest().authenticated()
 		.and().httpBasic()
 		.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
 		.and().cors()
 		.and().csrf().disable();
	}
} 
~~~
  <br>

## 🔺 ANOTAÇÕES:

* **@Override:** Para que haja sobrecarga no método.
* **@Bean:** Encapsula as informações de modo que possam ser utilizadas em qualquer camada.
- ♻
  
<br>
  
