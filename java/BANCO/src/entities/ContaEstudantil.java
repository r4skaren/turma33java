package entities;

public class ContaEstudantil extends Conta {
				
	//super liga com a m�e
	
				//atributos
				private double limiteEstudantil = 5000;

							
				//construtores
				public ContaEstudantil(int numero, String cpf, double limiteEstudantil) {
					//super cria rela��o com a classe principal
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
						super.credito(valorEmprestimo);
					}
				}
}
