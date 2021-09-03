package lista3;

import java.util.Scanner;

public class Lista3Exer3 {
	/*
	 * Solicitar a idade de várias pessoas e imprimir: 
	 * Total de pessoas com menos de 21 anos. 
	 * Total de pessoas com mais de 50 anos. 
	 * O programa termina quando idade for =-99. (WHILE)
	 */
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			int idade = 0, TotalPessoas21 = 0, TotalPessoas50 = 0, idadePessoa = 0;
			
			while(true) {
				
				idadePessoa += 1;
				System.out.printf("Idade da pessoa "+idadePessoa+": ");
				idade = leia.nextInt();
				
				if (idade == -99)
					break;
				
				if(idade<21)
					TotalPessoas21++;
				
				else if(idade>50)
					TotalPessoas50++;
			}
				System.out.println("\nTotal de pessoas com menos de 21 anos: "+TotalPessoas21);
				System.out.println("\nTotal de pessoas com mais de 50 anos: "+TotalPessoas50);
			}
}