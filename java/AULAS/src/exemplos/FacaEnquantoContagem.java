package exemplos;

import java.util.Scanner;

/*
 * FA�A...ENQUANTO
1- Fa�a um programa que mostre uma contagem na tela de 233 a 456, 
s� que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando n�o estiver.
 */

public class FacaEnquantoContagem {

	public static void main(String[] args) {

		int cont = 233;

		do{
		System.out.println(cont);
		
		if (cont >= 300 && cont <= 400){
			cont = cont + 3;
					}
		else {
			cont = cont + 5;
						}
				}while (cont < 456);	
		}
} 

