package entities;

public class Conta {

		//atributos
		protected int numero;
		private String cpf;
		protected double saldo;
		private boolean ativo;
	
		
		//construtor
		public Conta(int numero, String cpf) {
			super();
			this.numero = numero;
			this.cpf = cpf;
		}
		
		//encapsulamento - getters and setters
		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public double getSaldo() {
			return saldo;
		}
		/*
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		*/
		public boolean isAtivo() {
			return ativo;
		}

		public void setAtivo(boolean ativo) {
			this.ativo = ativo;
		}
		
		//metodos
		public void credito(double valor) {
			//saldo = saldo + valor;
			saldo += valor;
		}
		
		public void debito(double valor) {
			
			if (valor == 0) {
				System.out.println("\n\t\tDébito vázio, impossível realizar...");
			}
			else if(valor < 0) {
				System.out.println("\n\t\tValor informado negativo, impossível realizar...");
			}
			else if (valor > saldo) {
				System.out.println("\n\t\tSaldo insulficiente, impossível realizar...");
			} 
			else {
				saldo -= valor;
			}
			
			//saldo = saldo - valor;	
		}
		
		//seja o que Deus quiser....
		@Override
		public String toString() {
			return "Conta numero=" + numero + ", cpf=" + cpf + ", saldo=" + saldo ;
		}
}
