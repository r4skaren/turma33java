package entities;

public class ContaEspecial extends ContaCorrente {
	
			//atributos
			private double limite = 1000;
	
	
			//construtores
			public ContaEspecial(int numero, String cpf, int contadorTalao, double limite) {
				super(numero, cpf, contadorTalao);
				this.limite = limite;
			}

			//encapsulamentos
			public double getLimite() {
				return limite;
			}

			public void setLimite(double limite) {
				this.limite = limite;
			}
	
			//metodos
			public void usarLimite(double valor) {
				this.limite = this.limite - valor;
				super.credito(valor);
			}
}
