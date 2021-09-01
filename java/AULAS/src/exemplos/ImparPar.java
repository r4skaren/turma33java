package exemplos;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		
		//variaveis
		Scanner leia = new Scanner(System.in);
		int numero;
		
		//entradas
		System.out.print("Digite o número:");
		numero = leia.nextInt();
				
		//processamentos
		if(numero<0) {
		System.out.println("O número é negativo.");
		}
		else if(numero==0){
			System.out.println("Zero é neutro.");
			}
		else if(numero%2==0){
			System.out.println("O número é par.");
			}
		else {
			System.out.println("Número é impar.");
		}
		//saidas
	}

}
