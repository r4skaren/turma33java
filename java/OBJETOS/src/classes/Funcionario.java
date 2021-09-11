package classes;

public class Funcionario {

			//atributos
			private String matricula;
			protected int horasTrabalhadas;
			protected double valorHora;
			private String nome;
		
			
			//construtores
			
			public Funcionario(String matricula, int horasTrabalhas, double valorHora, String nome) {
				super();
				this.matricula = matricula;
				this.horasTrabalhadas = horasTrabalhas;
				this.valorHora = valorHora;
				this.nome = nome;
			}
			
			public Funcionario(String matricula, String nome) {
				super();
				this.matricula = matricula;
				this.nome = nome;
			}

			

			//encapsulamento
			public String getMatricula() {
				return matricula;
			}


			public void setMatricula(String matricula) {
				this.matricula = matricula;
			}


			public int getHorasTrabalhas() {
				return horasTrabalhadas;
			}


			public void setHorasTrabalhas(int horasTrabalhas) {
				this.horasTrabalhadas = horasTrabalhas;
			}


			public double getValorHora() {
				return valorHora;
			}


			public void setValorHora(double valorHora) {
				this.valorHora = valorHora;
			}


			public String getNome() {
				return nome;
			}


			public void setNome(String nome) {
				this.nome = nome;
			}
			
			//metodos
			public double salario(int valor) {		
					this.horasTrabalhadas = horasTrabalhadas * valor;
					return (horasTrabalhadas* valor);
			}


			@Override
			public String toString() {
				return "Funcionario [matricula=" + matricula + ", horasTrabalhadas=" + horasTrabalhadas + ", valorHora="
						+ valorHora + ", nome=" + nome + "]";
			} 
}
