package exemplos;

import java.util.Scanner;

	/*
	 *7) Receber valores de base e altura de um triângulo e verificar se são valores válidos 
	 *(positivos maiores que zero). 
	 *Em caso afirmativo, calcular a área do triângulo.
	 */

public class MaiorTriangulo {

		public static void main(String[] args) {
				
			@SuppressWarnings("resource")
			Scanner leia = new Scanner(System.in);
			double base, altura, triangulo,base2, altura2, triangulo2;
			
				System.out.println("Calculadora de Área de Triângulo\n");

					
				//entradas
				System.out.print("Digite o valor da altura do triângulo em centímetros: ");
				altura = leia.nextDouble();
				System.out.print("Digite o valor da base do triângulo em centímetros: ");
				base = leia.nextDouble();
				//2
				System.out.print("Digite o valor da altura do triângulo 2 em centímetros: ");
				altura2 = leia.nextDouble();
				System.out.print("Digite o valor da base do triângulo 2 em centímetros: ");
				base2 = leia.nextDouble();
				
				//processamentos//saidas
				triangulo = (altura * base) / 2;
				System.out.print("O valor da área do triângulo é de: "+ triangulo+" cm²");
				
				triangulo2 = (altura2 * base2) / 2;
				System.out.print("O valor da área do triângulo é de: "+ triangulo2+" cm²");
				
				//if é um desvio condicional
				if(triangulo2 == triangulo){
					System.out.println ("O triangulo com a maior area é: "+triangulo2);
				}
				else if (triangulo < triangulo2){
					System.out.println ("O triangulo com a maior area é: "+triangulo);
				}
		}
}
