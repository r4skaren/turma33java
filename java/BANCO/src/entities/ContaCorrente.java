package entities;

public class ContaCorrente extends Conta {
				
				//atributos
				private int contadorTalao;

	
				//construtor
				public ContaCorrente(int numero, String cpf, int contadorTalao) {
						super(numero, cpf);
						this.contadorTalao = contadorTalao;
				}
				//encapsulamento - getters and setters
				public int getContadorTalao() 
				{
						return contadorTalao;
				}
				public void setContadorTalao(int contadorTalao) 
				{
					this.contadorTalao = contadorTalao;
				}
				//metodos
				public void cheque() {
			        if(contadorTalao<3) {
			            if(super.getSaldo()>=30.00) {
			                super.debito(30);
			                contadorTalao++;
			            } else {
			            	System.out.println("Saldo insuficiente.");
			            }
			        } else {
			        	System.out.println("Limite máximo (3) excedido.");
			        }	
				}
}