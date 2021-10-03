package lista2;

import java.util.Scanner;


/*4 - Faça um programa em que permita a entrada de um número 
 * qualquer e exiba se este número é par ou ímpar. 
 * Se for par exiba também a raiz quadrada do mesmo; 
 * se for ímpar exiba o número elevado ao quadrado.
 * 
 */
public class Lista2Exer4 {
	
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner leia = new Scanner(System.in);
			
			//entradas
			double resultado, numero;
			System.out.print("Digite um número: ");
			numero = leia.nextDouble();
			
			
			//processamentos e saidas
			if (numero < 0) {
				System.out.println("O número é negativo.");
			}
			else if (numero == 0) {
				System.out.println("O número é neutro.");
			}
			else if (numero % 2 == 0) {
				System.out.println("O número é par.");
				resultado=Math.sqrt(numero);
				System.out.printf("A raiz quadrada do numero é: ",resultado);
			}
			else {
				System.out.println("O número é impar");
				resultado=Math.pow((numero),2);
				System.out.println(numero+" elevado ao quadrado é igual a: "+resultado);
			}
	}
}

