<h1 align="center">🍃 SPRING 🍃</h1>

## :memo: Descrição
O Spring Boot é um framework (*significa estrutura. De maneira geral, essa estrutura é feita para resolver um problema específico.*) que torna fácil a criação de aplicações Spring autossuficientes e robustas, possibilitando a 
execução imediata. O que permite a utilização do tempo de uma melhor forma, se dedicando a apenas a codificar as regras do negócio.

## :books: Funcionalidade
O spring possui uma série de configurações para as bibliotecas ou de terceitos, nada impede que isso seja modificado. Basicamente fornece uma série de ferramentas já configuradas
para pronto uso no projeto.

<h1></h1>

[Site para baixar seu Spring Initializr](https://start.spring.io/)

<p>
  
  * ‼ Não se esqueça, é necessário atenção a alguns detalhes, bem como as configurações que estão na imagem (As principais utilizadas nos projetos da Generation), ex: Project
Maven ou Gradle, Linguagem, Versão e outros. <p>
![2021-10-02_23h18_09](https://user-images.githubusercontent.com/86742652/135737170-9d83db4d-a827-4874-8796-c110b661a5aa.png)
  
  <br>
  
## :wrench: Dependências 
* **Spring Boot DevTools DEVELOPER TOOLS** -
Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
* **Spring Web WEB** -
Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
* **Spring Data JPA SQL** -
Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
* **Validation I/O** -
Bean Validation with Hibernate validator.
* **MySQL Driver SQL** -
MySQL JDBC and R2DBC driver.

    <br>
    
## :rocket: Onde fica tudo isso? ➡ pom.xml

~~~Java
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.5.5</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.turma33</groupId>
	<artifactId>Habilidades</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>Habilidades</name>
	<description>Demo project for Spring Boot</description>
	<properties>
		<java.version>11</java.version>
	</properties>
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>
~~~
  
  <br>
  
## :dart: Status do projeto
Em andamento ♻ Registro de (02/10/2021)
