package lista2;

import java.util.Scanner;

/*Fa�a um programa que receba tr�s inteiros e 
 * diga qual deles � o maior.
 */
public class QualMaior {

	public static void main(String[] args) {
		
		//variaveis
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);//instanciamento
		int numero1, numero2, numero3,maiorNumero = 0;
		
		//entradas
		System.out.println("Digite o n�mero 1: ");
		numero1 = leia.nextInt();
		System.out.println("Digite o n�mero 2: ");
		numero2 = leia.nextInt();
		System.out.println("Digite o n�mero 3: ");
		numero3 = leia.nextInt();
				
		//processamentos
		if(numero1 > maiorNumero) {
			maiorNumero = numero1;
		}
		else if(numero2 > maiorNumero) {
			maiorNumero = numero2;
		}
		else if(numero3 > maiorNumero){
			maiorNumero = numero3;
		}
		else {
			System.out.println(".");
		}
		//saidas
		System.out.println("O maior n�mero �: "+maiorNumero);
	}

}
