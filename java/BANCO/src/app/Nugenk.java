package app;

import java.util.Scanner;
import entities.ContaCorrente;
import entities.ContaEmpresa;
import entities.ContaEspecial;
import entities.ContaEstudantil;
import entities.ContaPoupanca;

public class Nugenk {

	public static void main(String[] args) {

		// variaveis
		//Crédito ou Debito
		char tipo;
		//Resposta para o movimento
		char op;
		//Qual conta usar
		char respostaUsarConta = 's';
		//valor do movimento
		double valor = 0.00;
		//escolha caso
		int respostaContas;
		// cases
		char resposta1;
		//poupança - dia aniver
		int dia;
		//caso 5 
		double emprestimoEstu;

		//
		Scanner leia = new Scanner(System.in);
		// Classes contas
		ContaEstudantil cest1 = new ContaEstudantil(14, "123.456.789-55", 10000);
		ContaPoupanca cp1 = new ContaPoupanca(156, "222.333.444-58", 5);
		ContaCorrente cc1 = new ContaCorrente(147, "147.258.369-98", 3);
		ContaEspecial cesp1 = new ContaEspecial(148, "369.258.147", 3, 1000);
		ContaEmpresa cemp1 = new ContaEmpresa(123, "159753852.99", 50000);

		while (respostaUsarConta == 's') {
			System.out.print("▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃\n");
			System.out.print("\n\n NUGENK G3");
			System.out.print("\n\n\tRevolucionando sua vida financeira!");
			System.out.println("Qual tipo de conta deseja acessar?");
			System.out.println("\n 1 - Poupança" + "\n 2 - Corrente" + "\n 3 - Especial" + "\n 4 - Empresa"
					+ "\n 5 - Estudantil" + "\n 6 - Sair");
			System.out.print("\n\n\t\t\t\t☛ Digite aqui: ");
			respostaContas = leia.nextInt();

			switch (respostaContas) {

			case 1:

				// Movimento
				System.out.print("▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃\n");
				System.out.print("\n\t\tNUGENK");
				System.out.print("\n\n\t\tO melhor lugar para revolucionar sua vida financeira!");

				for (int x = 1; x <= 10; x++) {
					System.out.println("MOVIMENTO " + x);
					System.out.println("SALDO ATUAL R$ :" + cp1.getSaldo());
					System.out.print("Movimento D - Débito ou C - Crédito? ");
					tipo = leia.next().toUpperCase().charAt(0);
					System.out.print("Digite o valor :");
					valor = leia.nextDouble();

					if (tipo == 'D') {
						cp1.debito(valor);
					} else if (tipo == 'C') {
						cp1.credito(valor);
					} else {
						System.out.println("Não foi informado um tipo correto...");
					}
					System.out.println("Continua S/N : ");
					op = leia.next().toUpperCase().charAt(0);
					if (op == 'N') {
						break;
					}
					// Conta Poupança
					System.out.println("SALDO ATUALIZADO R$ " + cp1.getSaldo());
					System.out.println("Informe o dia de hoje:");
					dia = leia.nextInt();
					cp1.correcao(dia);
					System.out.println("SALDO FINAL R$ " + cp1.getSaldo());
				}
				break;

			case 2:
				System.out
						.print("▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃\n");
				System.out.print("\n\t\tNUGENK");
				System.out.print("\n\n\t\tO melhor lugar para revolucionar sua vida financeira!");

				for (int x = 1; x <= 10; x++) {

					System.out.println("MOVIMENTO " + x);
					System.out.println("SALDO ATUAL R$ :" + cc1.getSaldo());
					System.out.print("Movimento D - Débito ou C - Crédito? ");
					tipo = leia.next().toUpperCase().charAt(0);
					System.out.print("Digite o valor :");
					valor = leia.nextDouble();

					if (tipo == 'D') {
						cc1.debito(valor);
					} else if (tipo == 'C') {
						cc1.credito(valor);
					} else {
						System.out.println("Não foi informado um tipo correto...");
					}
					System.out.println("Continua S/N : ");
					op = leia.next().toUpperCase().charAt(0);
					if (op == 'N') {
						break;
					}
					// Conta Corrente
					System.out.println("SALDO ATUALIZADO R$ " + cc1.getSaldo());
					System.out.println("Deseja solicitar chegue (S/N)? ");
					resposta1 = leia.next().toUpperCase().charAt(0);
					System.out.println("Deseja retirar um talão de cheque?"
							+ "\nLIMITE MÁXIMO DE 3 TALÕES."
							+ "\nVALOR POR TALÃO: R$ 30.00");
					resposta1 = leia.next().toUpperCase().charAt(0);
					if(resposta1 == 'S') {
						cc1.cheque();
						System.out.println("SALDO ATUAL R$ :"+cc1.getSaldo());	
						System.out.println("Cheques retirados: "+ cc1.getContadorTalao());
					}
					if (resposta1 == 'S') {
						cc1.cheque();
						System.out.println("SALDO ATUALIZADO R$ " + cc1.getSaldo());						
						System.out.println("Cheques retirados: "+ cc1.getContadorTalao());
					}
				}
				break;

			case 3:
				System.out
						.print("▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃\n");
				System.out.print("\n\t\tNUGENK");
				System.out.print("\n\n\t\tO melhor lugar para revolucionar sua vida financeira!");

				for (int x = 1; x <= 10; x++) {

					System.out.println("MOVIMENTO " + x);
					System.out.println("SALDO ATUAL R$ :" + cesp1.getSaldo());
					System.out.print("Movimento D - Débito ou C - Crédito? ");
					tipo = leia.next().toUpperCase().charAt(0);
					System.out.print("Digite o valor :");
					valor = leia.nextDouble();

					if (tipo == 'D') {
						cesp1.debito(valor);
					} else if (tipo == 'C') {
						cesp1.credito(valor);
					} else {
						System.out.println("Não foi informado um tipo correto...");
					}
					System.out.println("Continua S/N : ");
					op = leia.next().toUpperCase().charAt(0);
					if (op == 'N') {
						break;
					}
				}
				// Conta Especial ///não faço ideia
				/*
				 * if(setSaldo(0));
				 * 
				 * System.out.println("SALDO ATUALIZADO R$ "+cesp1.getSaldo()); resposta1 =
				 * leia.next().toUpperCase().charAt(0); if(resposta1 == 'S') {
				 * System.out.println("Quantos Talões você deseja solicitar?"); cheque =
				 * leia.nextInt(); cesp1.talao(cheque); System.out.println("SALDO FINAL R$ " +
				 * cesp1.getSaldo()); } } break;
				 */

			case 4:
				System.out
						.print("▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃\n");
				System.out.print("\n\t\tNUGENK");
				System.out.print("\n\n\t\tO melhor lugar para revolucionar sua vida financeira!");

				// Movimento
				for (int x = 1; x <= 10; x++) {

					System.out.println("MOVIMENTO " + x);
					System.out.println("SALDO ATUAL R$ :" + cemp1.getSaldo());
					System.out.print("Movimento D - Débito ou C - Crédito? ");
					tipo = leia.next().toUpperCase().charAt(0);
					System.out.print("Digite o valor: ");
					valor = leia.nextDouble();

					if (tipo == 'D') {
						cemp1.debito(valor);
					} else if (tipo == 'C') {
						cemp1.credito(valor);
					} else {
						System.out.println("Não foi informado um tipo correto...");
					}
					System.out.println("Continua S/N : ");
					op = leia.next().toUpperCase().charAt(0);
					if (op == 'N') {
						break;
					}
					// Conta Empresa
					System.out.printf("\nVocê tem um empréstimo no valor de R$ %.2f aprovado, deseja utilizar?"
							+ "\nS - Sim" + "\nN- Não\n", cemp1.getEmprestimoEmpresa());
					resposta1 = leia.next().toUpperCase().charAt(0);
					if (resposta1 == 'S') {
						System.out.println("Qual o valor do empréstimo?");
						valor = leia.nextDouble();
						cemp1.pedirEmprestimo(valor);
					}
					System.out.println("Continuar (S/N)? ");
					resposta1 = leia.next().toUpperCase().charAt(0);
					if (resposta1 == 'N') {
						break;
					}

				}
			case 5:
				System.out.print("▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃\n");
				System.out.print("\n\t\tNUGENK");
				System.out.print("\n\n\t\tO melhor lugar para revolucionar sua vida financeira!");

				// Movimento
				for (int x = 1; x <= 10; x++) {

					System.out.println("MOVIMENTO " + x);
					System.out.println("SALDO ATUAL R$ :" + cest1.getSaldo());
					System.out.print("Movimento D - Débito ou C - Crédito? ");
					tipo = leia.next().toUpperCase().charAt(0);
					System.out.print("Digite o valor: ");
					valor = leia.nextDouble();

					if (tipo == 'D') {
						cest1.debito(valor);
					} else if (tipo == 'C') {
						cest1.credito(valor);
					} else {
						System.out.println("Não foi informado um tipo correto...");
					}
					System.out.println("Continua S/N : ");
					op = leia.next().toUpperCase().charAt(0);
					if (op == 'N') {
						break;
					}
					// Conta Estudantil
					System.out.println("SALDO ATUALIZADO R$ " + cest1.getSaldo());
					System.out.println("SALDO FINAL R$ " + cest1.getSaldo());
					System.out.println("\nO empréstimo Estudantil de 5k, está disponivel!");
					System.out.println("Deseja solicitar? (S/N): ");
					resposta1 = leia.next().toUpperCase().charAt(0);
					if (resposta1 == 'S') {
						System.out.println("Entre com valor que deseja solicitar: ");
						emprestimoEstu = leia.nextDouble();
						cest1.usarEstudantil(emprestimoEstu);
						System.out.println("SALDO FINAL R$ " + cest1.getSaldo());
					} else {
						System.out.println("Obrigade por utilizar nossos serviços!");
					}
				}
			case 6:
				
				System.out.println("OBRIGADO, VOLTE SEMPRE!");
				respostaContas = 6;
				break;
			}
		}
	}
}