package lista1;

import java.util.Scanner;

public class Lista1Exer2 {
	/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	expressa em anos, meses e dias.
	 */
 	
	public static void main(String[] args) {
		
	 	int anos = 0, meses = 0,dias = 0,diasIdade = 0;
	 	
		System.out.println("Escreva sua idade em dias: ");
		
    	Scanner leia = new Scanner(System.in);
    	diasIdade = leia.nextInt();
		
		anos = diasIdade/365;
		meses=((diasIdade-(anos*365))/30);				
		dias=((diasIdade%365)%30);
		
		System.out.println("Você tem"+ anos +" anos, " +meses+ " meses e " + dias + " dias de idade!");
	}
}

