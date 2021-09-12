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
		for (int x = 3; x <= quantidadeTalao; x++) {
			if (super.getSaldo() == 30.00) {
				contadorTalao++;
				super.debito(30 * contadorTalao);
			} else if (getSaldo() < 30.00) {
				System.out.println("Sem saldo para retirada de tal�o de cheque!");
			} else if (quantidadeTalao > x) {
				System.out.println("S� � poss�vel at� 3 tal�es!!");
			}
		}
	}
}