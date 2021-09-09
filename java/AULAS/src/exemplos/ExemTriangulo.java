package exemplos;

import java.util.Scanner;

/*
*7) Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos 
*(positivos maiores que zero). 
*Em caso afirmativo, calcular a �rea do tri�ngulo.
 */

public class ExemTriangulo {

		public static void main(String[] args) {
		
			
			Scanner leia = new Scanner(System.in);
			double base, altura, triangulo;
			
				System.out.println("Calculadora de �rea de Tri�ngulo\n");

					
				//entradas
				System.out.print("Digite o valor da altura do tri�ngulo em cent�metros: ");
				altura = leia.nextDouble();
				System.out.print("Digite o valor da base do tri�ngulo em cent�metros: ");
				base = leia.nextDouble();

				//processamentos//saidas
				if (base <= 0){
					System.out.println("Imposs�vel realizar. Valor da base incorreto!");
				}
				else if (altura <= 0){
					System.out.println("Imposs�vel realizar. Valor da altura incorreto!");
				}
				else {
				triangulo = (altura * base) / 2;
				System.out.print("O valor da �rea do tri�ngulo � de: "+ triangulo+" cm�");
					}
			}
	}
