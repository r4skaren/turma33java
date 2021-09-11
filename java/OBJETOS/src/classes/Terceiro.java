package classes;

public class Terceiro extends Funcionario implements Lista5Exer1Treinamento{
        	
	private double adicional;

	public Terceiro(String matricula, String nome, double adicional) {
		super(matricula, nome);
		this.adicional = adicional;
	}

	public Terceiro(String matricula, int horasTrabalhas, double valorHora, String nome, double adicional) {
		super(matricula, horasTrabalhas, valorHora, nome);
		this.adicional = adicional;
	}

	
	//encapsulamento
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	//metodos
	public double salario(int valor) {		
			return (horasTrabalhadas* valor)+adicional;
	} 
}
