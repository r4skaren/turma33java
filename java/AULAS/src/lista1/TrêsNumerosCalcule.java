package lista1;

import java.util.Scanner;

public class Tr�sNumerosCalcule {

	public static void main(String[] args) {
		
		//variaveis
		Scanner leia = new Scanner(System.in);//instanciamento
		int A,B,C,D,R,S;

		//entradas
		System.out.print("Informe o n�mero para A:");
		A = (int) leia.nextDouble();
		System.out.print("Informe o n�mero para B:");
		B = (int) leia.nextDouble();
		System.out.print("Informe o n�mero para C:");
		C = (int) leia.nextDouble();
		
		//processamentos
		R = (int) (Math.pow(A+B,2));
		S = (int) (Math.pow(B+C,2));
		
		D = (int) (R+S/2);
		
		//saidas
		System.out.print("Informe o n�mero para B:");
	}

}
