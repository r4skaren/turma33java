package app;

import java.util.Scanner;

import entities.ContaEstudantil;

public class TesteConta {

		public static void main(String[] args) {
		
		char tipo, op,respostaEstu;
		double valor=0.00, emprestimoEstu;
		int dia;

		Scanner leia = new Scanner(System.in);
		
		ContaEstudantil cest1 = new ContaEstudantil(14,"123.456.789-55",10000);
		
		/*ContaPoupanca cp1 = new ContaPoupanca(156,"222.333.444-58",5);
		ContaCorrente cc1 = new ContaCorrente(147,"147.258.369-98",3);
		ContaEspecial cesp1 = new ContaEspecial(148,"369.258.147",3,1000);
		ContaEmpresa  cemp1 = new ContaEmpresa(123,"159753852.99",50000);*/
		
	
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
			
			}
			//estudantil
			System.out.println("SALDO ATUALIZADO R$ "+cest1.getSaldo());
			/*System.out.println("Informe o dia de hoje :");
			dia = leia.nextInt();
			cest1.correcao(dia);*/
			System.out.println("SALDO FINAL R$ " + cest1.getSaldo());
			System.out.println("\nO empréstimo Estudantil de 5k, está disponivel!");
			System.out.println("Deseja solicitar? (S/N): ");
			respostaEstu = leia.next().toUpperCase().charAt(0);		
				if(respostaEstu == 'S') {
					System.out.println("Entre com valor que deseja solicitar: ");
					emprestimoEstu = leia.nextDouble();
					cest1.usarEstudantil(emprestimoEstu);
					System.out.println("SALDO FINAL R$ " + cest1.getSaldo());
				}
				else {
				System.out.println("Obrigade por utilizar nossos serviços!");
				}
	}

}
