package entities;

public class ContaEstudantil extends Conta {
				
	//super liga com a mãe
	
				//atributos
				private double limiteEstudantil = 5000;
				private double emprestimo;
				
				//atributos
				private int diaAniversarioPoupanca;
				
				//construtores
				public ContaEstudantil(int numero, String cpf, int diaAniversarioPoupanca) {
					super(numero, cpf);
					this.diaAniversarioPoupanca = diaAniversarioPoupanca;
				}
				
				//encapsulamento
				public int getDiaAniversarioPoupanca() {
					return diaAniversarioPoupanca;
				}

				public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
					this.diaAniversarioPoupanca = diaAniversarioPoupanca;
				} 
				
				//metodos
				public void correcao(int diaInformado) {
					double valorCorrecao;
					if (diaInformado == this.diaAniversarioPoupanca) {
						valorCorrecao = (super.getSaldo() * 0.005);
						super.credito(valorCorrecao);
					}
				}
							
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
				public void usarEstudantil(int emprestimo) {
					if (emprestimo <= this.limiteEstudantil) {
						super.saldo = super.getSaldo() + emprestimo;
						
					}
				}
				
}
