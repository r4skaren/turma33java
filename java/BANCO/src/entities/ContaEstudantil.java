package entities;

import java.util.Scanner;

public class ContaEstudantil extends Conta {
				
	//super liga com a mãe
	
				//atributos
				private double limiteEstudantil;
				private String resposta;
				
							
				//construtores
				public ContaEstudantil(int numero, String cpf, double limiteEstudantil) {
					//super cria relação com a classe principal
					super(numero, cpf);
					this.limiteEstudantil = limiteEstudantil;
				}
	
				//encapsulamento
				public double getLimiteEstudantil() {
					return limiteEstudantil;
				}


				public void setLimiteEstudantil(double limiteEstudantil) {
					this.limiteEstudantil = limiteEstudantil;
				}
				
				//metodos
				public void usarEstudantil(double valorEmprestimo) {
					if(valorEmprestimo <= limiteEstudantil) {
						this.limiteEstudantil = limiteEstudantil - valorEmprestimo;
						super.credito(saldo+valorEmprestimo);
					}
					else if(valorEmprestimo > limiteEstudantil) {
						System.out.print("O valor desejado é maior que o limite disponível!");
					}
				}
}
