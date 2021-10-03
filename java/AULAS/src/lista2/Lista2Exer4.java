package lista2;

import java.util.Scanner;


/*4 - Fa�a um programa em que permita a entrada de um n�mero 
 * qualquer e exiba se este n�mero � par ou �mpar. 
 * Se for par exiba tamb�m a raiz quadrada do mesmo; 
 * se for �mpar exiba o n�mero elevado ao quadrado.
 * 
 */
public class Lista2Exer4 {
	
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner leia = new Scanner(System.in);
			
			//entradas
			double resultado, numero;
			System.out.print("Digite um n�mero: ");
			numero = leia.nextDouble();
			
			
			//processamentos e saidas
			if (numero < 0) {
				System.out.println("O n�mero � negativo.");
			}
			else if (numero == 0) {
				System.out.println("O n�mero � neutro.");
			}
			else if (numero % 2 == 0) {
				System.out.println("O n�mero � par.");
				resultado=Math.sqrt(numero);
				System.out.printf("A raiz quadrada do numero �: ",resultado);
			}
			else {
				System.out.println("O n�mero � impar");
				resultado=Math.pow((numero),2);
				System.out.println(numero+" elevado ao quadrado � igual a: "+resultado);
			}
	}
}

