package exemplos;

import java.util.Scanner;

	/*
	 *7) Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos 
	 *(positivos maiores que zero). 
	 *Em caso afirmativo, calcular a �rea do tri�ngulo.
	 */

public class MaiorTriangulo {

		public static void main(String[] args) {
				
			@SuppressWarnings("resource")
			Scanner leia = new Scanner(System.in);
			double base, altura, triangulo,base2, altura2, triangulo2;
			
				System.out.println("Calculadora de �rea de Tri�ngulo\n");

					
				//entradas
				System.out.print("Digite o valor da altura do tri�ngulo em cent�metros: ");
				altura = leia.nextDouble();
				System.out.print("Digite o valor da base do tri�ngulo em cent�metros: ");
				base = leia.nextDouble();
				//2
				System.out.print("Digite o valor da altura do tri�ngulo 2 em cent�metros: ");
				altura2 = leia.nextDouble();
				System.out.print("Digite o valor da base do tri�ngulo 2 em cent�metros: ");
				base2 = leia.nextDouble();
				
				//processamentos//saidas
				triangulo = (altura * base) / 2;
				System.out.print("O valor da �rea do tri�ngulo � de: "+ triangulo+" cm�");
				
				triangulo2 = (altura2 * base2) / 2;
				System.out.print("O valor da �rea do tri�ngulo � de: "+ triangulo2+" cm�");
				
				//if � um desvio condicional
				if(triangulo2 == triangulo){
					System.out.println ("O triangulo com a maior area �: "+triangulo2);
				}
				else if (triangulo < triangulo2){
					System.out.println ("O triangulo com a maior area �: "+triangulo);
				}
		}
}
