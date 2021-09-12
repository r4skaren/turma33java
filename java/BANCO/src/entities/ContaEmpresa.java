package entities;

public class ContaEmpresa extends Conta{
	
		//atributos
		private	double	emprestimoEmpresa;
	
		//construtores
		public ContaEmpresa(int numero, String cpf, double emprestimoEmpresa) {
			super(numero, cpf);
			this.emprestimoEmpresa = emprestimoEmpresa;
		}
		
		//encapsulamento
		public double getEmprestimoEmpresa() {
			return emprestimoEmpresa;
		}

		public void setEmprestimoEmpresa(double emprestimoEmpresa) {
			this.emprestimoEmpresa = emprestimoEmpresa;
		}
		
		//metodos
		/*public void pedirEmprestimo(double emprestimo)
		{
			if(emprestimo <= emprestimoEmpresa) {
			this.emprestimoEmpresa -= emprestimo;
			super.credito(emprestimo);
			System.out.println("Saldo atual emprestimo R$ "+this.emprestimoEmpresa);
			}
		}*/
		public void pedirEmprestimo(double emprestimo)
		{
			if(emprestimo <= emprestimoEmpresa) {
			this.emprestimoEmpresa -= emprestimo;
			super.credito(emprestimo);
			}
			else if(emprestimo > emprestimoEmpresa) {
				System.out.print("O valor desejado é maior que o limite disponível!");
			}
		}
}