package lista3;

import java.util.Scanner;

public class Lista3Exer5 {

	public static void main(String[] args) {
		
		//variaveis
		int numeroDigitado, somaDosNumerosDigitados,totalDosNumerosDigitados,i;
		Scanner leia = new Scanner(System.in);

		somaDosNumerosDigitados = 0;
		totalDosNumerosDigitados = 0;
		i = 0;

		do{i++;
		System.out.print("N�mero" + i + ": ");
		numeroDigitado = leia.nextInt();

		somaDosNumerosDigitados += numeroDigitado;
		totalDosNumerosDigitados += 1;

		} while (numeroDigitado != 0);
		leia.close();
		totalDosNumerosDigitados--;
		
		//saidas
		System.out.println("Total de n�meros digitados: " + totalDosNumerosDigitados);
		System.out.println("Soma dos n�meros digitados: " + somaDosNumerosDigitados);
	}

}
