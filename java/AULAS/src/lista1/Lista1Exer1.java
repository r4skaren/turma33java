package lista1;

import java.util.Scanner;

public class Lista1Exer1 {

	/*1. Faça um sistema que leia a idade de uma pessoa expressa 
	 * em anos, meses e dias e mostre-a expressa apenas em dias.
	 */
	
	public static void main(String[] args) {
		
		//variaveis
		Scanner leia = new Scanner(System.in);//instanciamento
		int meses, anos, dias, idade;
				
		//entradas
		System.out.print("Quantos anos voce tem? ");
		anos = (int) leia.nextDouble();
		System.out.print("Em qual mês você nasceu? ");
		meses = (int) leia.nextDouble();
		System.out.print("Em qual dia? ");
		dias = (int) leia.nextDouble();
				
		//processamentos
		idade = (int) (anos*365)+(meses*30)+dias;
						
		//saidas
		System.out.print("Minha idade aproximadamente é " +idade +" dias");	
	}

}

