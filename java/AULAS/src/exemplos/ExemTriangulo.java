package exemplos;

import java.util.Scanner;

/*
*7) Receber valores de base e altura de um triângulo e verificar se são valores válidos 
*(positivos maiores que zero). 
*Em caso afirmativo, calcular a área do triângulo.
 */

public class ExemTriangulo {

		public static void main(String[] args) {
		
			
			Scanner leia = new Scanner(System.in);
			double base, altura, triangulo;
			
				System.out.println("Calculadora de Área de Triângulo\n");

					
				//entradas
				System.out.print("Digite o valor da altura do triângulo em centímetros: ");
				altura = leia.nextDouble();
				System.out.print("Digite o valor da base do triângulo em centímetros: ");
				base = leia.nextDouble();

				//processamentos//saidas
				if (base <= 0){
					System.out.println("Impossível realizar. Valor da base incorreto!");
				}
				else if (altura <= 0){
					System.out.println("Impossível realizar. Valor da altura incorreto!");
				}
				else {
				triangulo = (altura * base) / 2;
				System.out.print("O valor da área do triângulo é de: "+ triangulo+" cm²");
					}
			}
	}
