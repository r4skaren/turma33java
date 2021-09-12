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
		// caso 2
		int respostaTalao;
		//caso 3
		double valorMovimento;
		//caso 4
		double emprestimoEmp;
		//caso 5 
		double emprestimoEstu;


		//
		Scanner leia = new Scanner(System.in);
		// Classes contas
		ContaPoupanca cp1 = new ContaPoupanca(156, "222.333.444-58", 5);
		ContaCorrente cc1 = new ContaCorrente(147, "147.258.369-98", 3);
		ContaEspecial cesp1 = new ContaEspecial(148, "369.258.147", 3, 1000);
		ContaEmpresa cemp1 = new ContaEmpresa(123, "159753852.99", 10000);
		ContaEstudantil cest1 = new ContaEstudantil(14, "123.456.789-55", 5000);

		while (respostaUsarConta == 's') {
			System.out.print("▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃\n");
			System.out.print("\n\n\t\t\t\t\t                                     NUGENK G3");
			System.out.print("\n\n\t\t\t\t                       Transparência e revolução em sua vida financeira!");
			System.out.println("\n┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅");
			System.out.println("\n\n\t\tQual tipo de conta deseja acessar?");
			System.out.println("\n┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅");
			System.out.println("\n\t\t 1 - Poupança" + "\n\t\t 2 - Corrente" + "\n\t\t 3 - Especial" + "\n\t\t 4 - Empresa"
					+ "\n\t\t 5 - Estudantil" + "\n\t\t 6 - Sair");
			System.out.println("\n┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅");
			System.out.print("\n\n\t\t\t\t☛ Digite aqui: ");
			respostaContas = leia.nextInt();

			switch (respostaContas) {

			case 1:

				// Movimento
				System.out.print("▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃\n");
				System.out.print("\n\t\tNUGENK G3");
				System.out.print("\n\n\t\tTransparência e revolução em sua vida financeira!\n");
				System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
				System.out.print("\t\t↣ CONTA POUPANÇA\n");
				// Movimento
				for (int x = 1; x <= 10; x++) {
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.println("\t\tSaldo Atual: R$ " + cp1.getSaldo());
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.println("\n\t\t"+x+"° movimento: ");
					System.out.print("\n\t\tTipos de movimento: \n\t\tD para Débito  \n\t\tC para Crédito \n\n\t\t☞ Digite aqui: ");
					tipo = leia.next().toUpperCase().charAt(0);
					System.out.print("\n\t\tDigite o valor: ");
					valor = leia.nextDouble();

					if (tipo == 'D') {
						cp1.debito(valor);
					} else if (tipo == 'C') {
						cp1.credito(valor);
					} else {
						System.out.println("\n\t\tNão foi informado um tipo correto...");
					}
					System.out.print("\n\t\tContinuar? (S/N): ");
					op = leia.next().toUpperCase().charAt(0);
					if (op == 'N') {
						break;
					}
				
					// Conta Poupança
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.println("\n\t\tSaldo atual: R$ " + cp1.getSaldo());
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.print("\n\t\tInforme o dia de hoje:");
					dia = leia.nextInt();
					cp1.correcao(dia);
					System.out.print("\n\t\tSALDO FINAL: R$ " + cp1.getSaldo());
				}

				break;

			case 2:
				System.out.print("▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃\n");
				System.out.print("\n\t\tNUGENK G3");
				System.out.print("\n\n\t\tTransparência e revolução em sua vida financeira!!\n");
				System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
				System.out.print("\t\t↣ CONTA CORRENTE\n");
				// Movimento
				for (int x = 1; x <= 10; x++) {
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.println("\t\tSaldo Atual: R$ " + cc1.getSaldo());
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.println("\n\t\t"+x+"° movimento: ");
					System.out.print("\n\t\tTipos de movimento: \n\t\tD para Débito  \n\t\tC para Crédito \n\n\t\t☞ Digite aqui: ");
					tipo = leia.next().toUpperCase().charAt(0);
					System.out.print("\n\t\tDigite o valor: ");
					valor = leia.nextDouble();

					if (tipo == 'D') {
						cc1.debito(valor);
					} else if (tipo == 'C') {
						cc1.credito(valor);
					} else {
						System.out.println("\n\t\tNão foi informado um tipo correto...");
					}
					System.out.print("\n\t\tContinuar? (S/N):  ");
					op = leia.next().toUpperCase().charAt(0);
					if (op == 'N') {
						break;
					}
				}
					//Conta Corrente
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.println("\n\t\tSaldo atual: R$ " + cc1.getSaldo());
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.print("\n\t\tOPORTUNIDADE ÚNICA! \n\n\t\tEstá disponível 3 talões. No valor de R$ 30,00!");
		            System.out.print("\n\n\t\tDeseja solicitar? (S/N): ");
		            resposta1 = leia.next().toUpperCase().charAt(0);
		            if(resposta1 == 'S') {
		            	System.out.print("\n\t\tQuantos talões deseja solicitar? ");
		            	System.out.print("\n\t\tDigite aqui: ");
		            	respostaTalao = leia.nextInt();
						cc1.talao(respostaTalao);
						System.out.println("\n\t\tSaldo atualizado: R$ "+cc1.getSaldo());	
						//System.out.println("\n\t\tCheques retirados: "+ respostaTalao);
					}
				break;
				
			case 3:
				System.out.print("▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃\n");
				System.out.print("\n\t\tNUGENK G3");
				System.out.print("\n\n\t\tTransparência e revolução em sua vida financeira!\n");
				System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
				System.out.print("\t\t↣ CONTA ESPECIAL\n");
				// Movimento
				for (int x = 1; x <= 10; x++) {
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.println("\n\t\tSaldo Atual: R$ " + cesp1.getSaldo());
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.println("\n\t\t"+x+"° movimento: ");
					System.out.println("\n\t\tSaldo inicial: R$ " + cesp1.getSaldo());
					System.out.print("\n\t\tTipos de movimento: \n\t\tD para Débito  \n\t\tC para Crédito \n\n\t\t☞ Digite aqui: ");
					tipo = leia.next().toUpperCase().charAt(0);
					System.out.print("\n\t\tDigite o valor: ");
					valor = leia.nextDouble();

					if (tipo == 'D') {
						cesp1.debito(valor);
					} else if (tipo == 'C') {
						cesp1.credito(valor);
					} else {
						System.out.println("\n\t\tNão foi informado um tipo correto...");
					}
					// Conta Especial
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.println("\n\t\tSaldo atual: R$ " + cesp1.getSaldo());
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					if(cesp1.getSaldo() <= 0) {
					System.out.print("\n\t\tSeu saldo se encontra no valor de: R$ "+cesp1.getSaldo());
					System.out.print("\n\n\t\tPara continuar a movimentação é necessário que você utilize o seu limite especial.");
					System.out.print("\n\t\tDeseja utilizar? (S/N): ");
					resposta1 = leia.next().toUpperCase().charAt(0);
					if(resposta1 == 'S') {
					System.out.print("\n\t\tDigite o valor desejado (Limite de R$ 1000,00): ");
					valorMovimento = leia.nextDouble();
					cesp1.usarLimite(valorMovimento);
						}
					}
					else {
						System.out.print("\n\t\tContinuar? (S/N): ");
					op = leia.next().toUpperCase().charAt(0);
					if (op == 'N') {
						break;
						}
					}
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.println("\n\t\tSaldo atual: R$ " + cesp1.getSaldo());
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
				}
			break;
				 
			case 4:
				System.out.print("▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃\n");
				System.out.print("\n\t\tNUGENK G3");
				System.out.print("\n\n\t\tTransparência e revolução em sua vida financeira!\n");
				System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
				System.out.print("\t\t↣ CONTA EMPRESA\n");
				// Movimento
				for (int x = 1; x <= 10; x++) {
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.println("\t\tSaldo Atual: R$ " + cemp1.getSaldo());
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.println("\n\t\t"+x+"° movimento: ");
					System.out.println("\n\t\tEscolha um movimento\n");
					System.out.print("\n\t\tTipos de movimento: \n\t\tD para Débito  \n\t\tC para Crédito \n\n\t\t☞ Digite aqui: ");
					tipo = leia.next().toUpperCase().charAt(0);
					System.out.print("\n\t\tDigite o valor: ");
					valor = leia.nextDouble();

					if (tipo == 'D') {
						cemp1.debito(valor);
					} else if (tipo == 'C') {
						cemp1.credito(valor);
					} else {
						System.out.println("\n\t\tNão foi informado um tipo correto...");
					}
					// Conta Empresa
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.print("\n\t\tSaldo atualizado para: R$ "+ cemp1.getSaldo()+"\n");
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.print("\n\n\t\tDeseja continuar? (S/N): ");
					op = leia.next().toUpperCase().charAt(0);
					if (op == 'N') {
						break;
					}
				}
					//Conta Empresa
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.print("\n\t\tSaldo Atual: R$ " + cemp1.getSaldo());
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.print("\n\t\tO empréstimo empresa de "+cemp1.getEmprestimoEmpresa()+" está disponivel!");
					System.out.print("\n\t\tDeseja solicitar? (S/N): ");
					resposta1 = leia.next().toUpperCase().charAt(0);
					if (resposta1 == 'S') {
						System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
						System.out.print("\n\t\tEntre com valor que deseja solicitar: ");
						emprestimoEmp = leia.nextDouble();
						cemp1.pedirEmprestimo(emprestimoEmp);
						System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
						System.out.println("\n\n\t\tSALDO FINAL R$ " + cemp1.getSaldo());
					}
					break;
			case 5:
				System.out.print("▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃\n");
				System.out.print("\n\t\tNUGENK G3");
				System.out.print("\n\n\t\tTransparência e revolução em sua vida financeira!\n");
				System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
				System.out.print("\t\t↣ CONTA ESTUDANTIL\n");
				// Movimento
				for (int x = 1; x <= 10; x++) {
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.println("\t\tSaldo Atual: R$ " + cest1.getSaldo());
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.println("\n\n\t\t"+x+"° movimento: ");
					System.out.println("\n\t\tEscolha um movimento\n");
					System.out.print("\t\tTipos de movimento: \n\t\tD para Débito  \n\t\tC para Crédito \n\n\t\tDigite aqui: ");
					tipo = leia.next().toUpperCase().charAt(0);
					System.out.print("\n\t\tDigite o valor: ");
					valor = leia.nextDouble();
					
					if (tipo == 'D') {
						cest1.debito(valor);
					} else if (tipo == 'C') {
						cest1.credito(valor);
					} else {
						System.out.println("\n\t\tNão foi informado um tipo correto...");
					}
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.print("\n\t\tSaldo atualizado para: R$ "+ cest1.getSaldo()+"\n");
					System.out.print("\n\n\t\tDeseja continuar? (S/N): ");
					op = leia.next().toUpperCase().charAt(0);
					if (op == 'N') {
						break;
					}
				}
					// Conta Estudantil
				System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.print("\n\t\tSaldo Atual: R$ " + cest1.getSaldo());
					System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
					System.out.print("\n\t\tO empréstimo estudantil de "+cest1.getLimiteEstudantil()+" está disponivel!");
					System.out.print("\n\t\tDeseja solicitar? (S/N): ");
					resposta1 = leia.next().toUpperCase().charAt(0);
					if (resposta1 == 'S') {
						System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
						System.out.print("\n\t\tEntre com valor que deseja solicitar: ");
						emprestimoEstu = leia.nextDouble();
						cest1.usarEstudantil(emprestimoEstu);
						System.out.print("༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝༝\n");
						System.out.println("\n\n\t\tSALDO FINAL R$ " + cest1.getSaldo());
					}
					break;
			case 6:
				System.out.println("\n\n\t\t【VOLTE SEMPRE!】");
				respostaContas = 'n';
				break;
			}
		}
	}
}