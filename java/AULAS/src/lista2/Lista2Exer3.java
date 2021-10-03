package lista2;

import java.util.Scanner;

	/*Faça um programa que receba a idade de uma pessoa e 
	 * mostre na saída em qual categoria ela se encontra:
		10-14 infantil
		15-17 juvenil
		18-25 adulto
	 */

	public class Lista2Exer3 {

			public static void main(String[] args) {
				
			//variaveis
			@SuppressWarnings("resource")
			Scanner leia = new Scanner(System.in);//instanciamento
			int idade;
			
			//entradas
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			//processamentos
			//saidas
			if (idade > 25 || idade < 10) {
				System.out.println("Você não está entre as categorias!");
			}
			else if(idade >= 10 && idade <= 14) {
				System.out.println("Sua categoria é infantil.");
			}
			else if(idade >= 15 && idade <= 17) {
				System.out.println("Sua categoria é juvenil.");
			}
			else {
				System.out.println("Sua categoria é Adulto.");
			}
	}
}
