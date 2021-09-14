package classes;

import java.util.Scanner;

public class Leitores {
	// Scanner
	
	Scanner leiaQuantidade = new Scanner(System.in);
	Scanner leiaCodigo = new Scanner(System.in);
	Scanner leiaResposta = new Scanner(System.in);
	
	// Variaveis
	private int quantidade;
	private String codigo;
	private char resposta;
	
	//Getters and Setters	
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public char getResposta() {
		return resposta;
	}

	public void setResposta(char resposta) {
		this.resposta = resposta;
	}

	// Métodos
	public void pegaQuantidade() {
		quantidade = leiaQuantidade.nextInt();
		this.setQuantidade(quantidade);
		
	}
	public void pegaCodigo() {
		codigo = leiaCodigo.nextLine();
		this.setCodigo(codigo);
		
	}
	
	public void pegaResposta() {
		resposta = leiaResposta.next().toUpperCase().charAt(0);
		while (resposta != 'N' && resposta != 'n' && resposta != 'S' && resposta != 's') {
            System.out.print("\n\t\t\t ⛒ Opção Inválida, verifique e digite novamente:  ");
            resposta = leiaResposta.next().charAt(0);
        }
		this.setResposta(resposta);
	}
}