package exemplos;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		
		//variaveis
		Scanner leia = new Scanner(System.in);
		int numero;
		
		//entradas
		System.out.print("Digite o n�mero:");
		numero = leia.nextInt();
				
		//processamentos
		if(numero<0) {
		System.out.println("O n�mero � negativo.");
		}
		else if(numero==0){
			System.out.println("Zero � neutro.");
			}
		else if(numero%2==0){
			System.out.println("O n�mero � par.");
			}
		else {
			System.out.println("N�mero � impar.");
		}
		//saidas
	}

}
