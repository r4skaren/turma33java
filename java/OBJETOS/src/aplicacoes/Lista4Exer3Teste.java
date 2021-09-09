package aplicacoes;

import java.util.Scanner;

import classes.Lista4Exer3;

public class Lista4Exer3Teste {
	
public static void main(String[] args) {
		
		Lista4Exer3 eletronico1 = new Lista4Exer3();
		Lista4Exer3 eletronico2 = new Lista4Exer3();
		Scanner leia = new Scanner(System.in);
		
		//eletronico 1
		eletronico1.marca = "Apple";
		eletronico1.cor = "Preto";
		
		
		//eletronico 2
		eletronico2.marca = "Samsung";
		eletronico2.cor = "Cinza";
		
		System.out.println("Eletrônico 1 tem a cor: "+eletronico1.cor+"\nSua marca é: "+eletronico1.marca);
		System.out.print("Entre com o valor da sua bateria: ");
		eletronico1.bateriaCelular1 = leia.nextInt();
		eletronico1.bateriaCelular();
		
		System.out.println("\nEletrônico 2 tem a cor: "+eletronico2.cor+"\nSua marca é: "+eletronico2.marca);
		System.out.print("Entre com o valor da sua bateria: ");
		eletronico2.bateriaFone = leia.nextInt();
		eletronico2.bateriaFone();
		
}
}
