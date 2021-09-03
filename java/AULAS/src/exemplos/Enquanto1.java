package exemplos;

import java.util.Scanner;

/*
 * 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e 
 * apresente no final o total do somatório, a média e o total de valores lidos. 
 * O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
 * Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
 */

public class Enquanto1 {

	public static void main(String[] args) {
		
		//variaveis
		Scanner leia = new Scanner(System.in);
		double somatorio = 0.00, media = 0.00, total = 0.00, numero = 0.00;
		
		while(numero >= 0) {
			
			System.out.println("Digite o número a ser somado (negativo o programa irá interromper): ");
			numero = leia.nextDouble();
			
			if(numero < 0) {
				break;
			}
			somatorio = somatorio + numero;
	        total = total + 1;
		}
			media = somatorio/total;
			System.out.printf("A somatória dos números digitados é de: %.0f ",somatorio);
			System.out.printf("\nA média dos valores digitados é de: %.0f ", media);
			System.out.printf("\nO total de números digitados é de: %.0f ", total);
	}

}
