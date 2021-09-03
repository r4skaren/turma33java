package exemplos;

import java.util.Scanner;

/*
 * 1- Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e 
 * apresente no final o total do somat�rio, a m�dia e o total de valores lidos. 
 * O programa deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo valores positivos. 
 * Ou seja, o programa deve parar quando o usu�rio fornecer um valor negativo.
 */

public class Enquanto1 {

	public static void main(String[] args) {
		
		//variaveis
		Scanner leia = new Scanner(System.in);
		double somatorio = 0.00, media = 0.00, total = 0.00, numero = 0.00;
		
		while(numero >= 0) {
			
			System.out.println("Digite o n�mero a ser somado (negativo o programa ir� interromper): ");
			numero = leia.nextDouble();
			
			if(numero < 0) {
				break;
			}
			somatorio = somatorio + numero;
	        total = total + 1;
		}
			media = somatorio/total;
			System.out.printf("A somat�ria dos n�meros digitados � de: %.0f ",somatorio);
			System.out.printf("\nA m�dia dos valores digitados � de: %.0f ", media);
			System.out.printf("\nO total de n�meros digitados � de: %.0f ", total);
	}

}
