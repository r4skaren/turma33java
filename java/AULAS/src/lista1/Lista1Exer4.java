package lista1;

import java.util.Scanner;

public class Lista1Exer4 {

	public static void main(String[] args) {
		
		//variaveis
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);//instanciamento
		int A,B,C,D,R,S;

		//entradas
		System.out.print("Informe o n�mero para A:");
		A = (int) leia.nextInt();
		System.out.print("Informe o n�mero para B:");
		B = (int) leia.nextInt();
		System.out.print("Informe o n�mero para C:");
		C = (int) leia.nextInt();
		
		//processamentos
		R = (int) (Math.pow(A+B,2));
		S = (int) (Math.pow(B+C,2));
		
		D = (int) (R+S/2);
		
		//saidas
		System.out.print("O valor final �: "+ D);
	}
}
