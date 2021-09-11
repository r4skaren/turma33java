package app;

import java.util.Scanner;

import entities.ContaCorrente;
import entities.ContaCorrenteMatheus;
import entities.ContaEmpresa;
import entities.ContaEspecial;
import entities.ContaEstudantil;
import entities.ContaPoupanca;

public class Nugenk {

	public static void main(String[] args) {

		// variaveis -> estu
		char tipo, op,resposta1;
		double valor = 0.00, emprestimoEstu;
		int dia;
		int resposta;
		int cheque;
		
		//

		Scanner leia = new Scanner(System.in);

		ContaEstudantil cest1 = new ContaEstudantil(14, "123.456.789-55", 10000);
		ContaPoupanca cp1 = new ContaPoupanca(156, "222.333.444-58", 5);
		ContaCorrenteMatheus cc1 = new ContaCorrenteMatheus(147, "147.258.369-98", 3);
		ContaEspecial cesp1 = new ContaEspecial(148, "369.258.147", 3, 1000);
		ContaEmpresa cemp1 = new ContaEmpresa(123, "159753852.99", 50000);

		System.out.print("▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃\n");
		System.out.print("\n\n NUGENK");
		System.out.print("\n\n\tO melhor lugar para revolucionar sua vida financeira!");
		System.out.println("Existem algumas opções de contas. Qual deseja acessar?");
		System.out.println("\n1 - Poupança\r\n"
				+ "		 \n 2 - Corrente"
				+ "		\n 3 - Especial"
				+ "		 \n 4 - Empresa"
				+ "		 \n 5 - Estudantil");
		System.out.print("\n\n\t\t\t\t☛ Digite aqui: ");
		resposta = leia.nextInt();
		
		/* 1 - Poupança
		 * 2 - Corrente
		 * 3 - Especial
		 * 4 - Empresa
		 * 5 - Estudantil
		 */
		
		
			switch(resposta) {
			
				case 1:
					//Movimento
					for (int x=1; x<=10; x++) {
						
						System.out.println("MOVIMENTO "+x);
						System.out.println("SALDO ATUAL R$ :"+cest1.getSaldo());
						System.out.print("Movimento D - Débito ou C - Crédito? ");
						tipo = leia.next().toUpperCase().charAt(0);
						System.out.print("Digite o valor :");
						valor = leia.nextDouble();
		
						if (tipo=='D') {
							cest1.debito(valor);
						} 
						else if (tipo=='C') {
							cest1.credito(valor);
						} else {
							System.out.println("Não foi informado um tipo correto...");
						}
						System.out.println("Continua S/N : ");
						op = leia.next().toUpperCase().charAt(0);	
						if (op=='N') {
							break;
						}
						//Conta Poupança
						System.out.println("SALDO ATUALIZADO R$ "+cp1.getSaldo());
						System.out.println("Informe o dia de hoje :");
						dia = leia.nextInt();
						cp1.correcao(dia);
						System.out.println("SALDO FINAL R$ " + cp1.getSaldo());
						}
						break;
					
				case 2: 
						for (int x=1; x<=10; x++) {
						
						System.out.println("MOVIMENTO "+x);
						System.out.println("SALDO ATUAL R$ :"+cest1.getSaldo());
						System.out.print("Movimento D - Débito ou C - Crédito? ");
						tipo = leia.next().toUpperCase().charAt(0);
						System.out.print("Digite o valor :");
						valor = leia.nextDouble();
		
						if (tipo=='D') {
							cest1.debito(valor);
						} 
						else if (tipo=='C') {
							cest1.credito(valor);
						} else {
							System.out.println("Não foi informado um tipo correto...");
						}
						System.out.println("Continua S/N : ");
						op = leia.next().toUpperCase().charAt(0);	
						if (op=='N') {
							break;
						}
						//Conta Corrente
						System.out.println("SALDO ATUALIZADO R$ "+cc1.getSaldo());
						System.out.println("Deseja solicitar chegue (S/N)? ");
						resposta1 = leia.next().toUpperCase().charAt(0);
						if(resposta1 == 'S') {
							System.out.println("Quantos Talões você deseja solicitar?");
							cheque = leia.nextInt();
							cc1.talao(cheque);
							System.out.println("SALDO FINAL R$ " + cc1.getSaldo());
							}
						}
						break;
						
				case 3:
						for (int x=1; x<=10; x++) {
						
						System.out.println("MOVIMENTO "+x);
						System.out.println("SALDO ATUAL R$ :"+cest1.getSaldo());
						System.out.print("Movimento D - Débito ou C - Crédito? ");
						tipo = leia.next().toUpperCase().charAt(0);
						System.out.print("Digite o valor :");
						valor = leia.nextDouble();
		
						if (tipo=='D') {
							cest1.debito(valor);
						} 
						else if (tipo=='C') {
							cest1.credito(valor);
						} else {
							System.out.println("Não foi informado um tipo correto...");
						}
						System.out.println("Continua S/N : ");
						op = leia.next().toUpperCase().charAt(0);	
						if (op=='N') {
							break;
						}
						//Conta Especial
						if(setSaldo(0));
						
						System.out.println("SALDO ATUALIZADO R$ "+cesp1.getSaldo());
						resposta1 = leia.next().toUpperCase().charAt(0);
						if(resposta1 == 'S') {
							System.out.println("Quantos Talões você deseja solicitar?");
							cheque = leia.nextInt();
							cesp1.talao(cheque);
							System.out.println("SALDO FINAL R$ " + cesp1.getSaldo());
							}
						}
						break;
					
							
						
					

			}
	}



}
