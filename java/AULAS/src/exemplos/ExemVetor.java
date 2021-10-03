package exemplos;

import java.util.Scanner;

	/*
	 * Fa�a um programa que crie um vetor por leitura com 
	 * 5 valores de pontua��o de uma atividade e o escreva em seguida. 
	 * Encontre ap�s a maior pontua��o e a apresente. 
	 */

public class ExemVetor {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		int maiorNota = 0;
		int pontuacaoAtividade[] = new int [5];
		
		for(int x=0; x<5;x++){
			System.out.print("Avalia��o de 1 a 10\n");
			System.out.print(x+1+"� "+"digite aqui: ");
			pontuacaoAtividade[x] = leia.nextInt();
			System.out.print("\n");
		}
		
		System.out.println("\nA pontua��o �: \n");
		for (int x=0; x<5;x++){
			System.out.print(" | "+pontuacaoAtividade[x]+" | ");
		}
		for (int x=0; x<5;x++){
			if (maiorNota < pontuacaoAtividade[x])
				maiorNota = pontuacaoAtividade[x];	
		}
		System.out.println("\n\nA maior nota � "+maiorNota);
	}
}