package entities;

public class ContaCorrente extends Conta {

	// atributos
	private int contadorTalao;

	public ContaCorrente(int numero, String cpf, int contadorTalao) {
		super(numero, cpf);
		this.contadorTalao = contadorTalao;
	}
	// encapsulamento

	public int getContadorTalao() {
		return contadorTalao;
	}

	public void setContadorTalao(int contadorTalao) {
		this.contadorTalao = contadorTalao;
	}

	// metodos
	public void talao(int quantidadeTalao) {
		if (quantidadeTalao <= 3 && getSaldo() > 30.00) {
				super.debito(30.00 * quantidadeTalao);
				contadorTalao = contadorTalao + quantidadeTalao;
				while (contadorTalao < 3);
			} else if (quantidadeTalao > 3) {
				System.out.print("\n\t\tSó é possível até 3 talões!!");
			}
			else if (contadorTalao > 3){
			System.out.println("\n\t\tVocê já atingiu seu limite de talões!!");
		}
	}
}
