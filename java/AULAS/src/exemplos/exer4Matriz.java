package exemplos;

import java.util.Scanner;

/*
 * Crie um programa que receba valores do 
 * usuário para preencher uma matriz 3X3, 
 * e em seguida, exiba a soma dos valores dela e 
 * a soma dos valores da primeira diagonal, ou seja, diagonal principal.

 */
public class exer4Matriz {

	public static void main(String[] args) {
		
		//variaveis
		Scanner leia = new Scanner(System.in);
		int valores[][] = new int[3][3];
		int x=0, y=0,soma=0,somaDiagonais=0;
			

		System.out.println("Insira o valor na matriz: ");
		while (x < 3)
		{
			while (y < 3) 
			{
			 System.out.printf("Matriz[%d][%d]: ", x, y);
				valores[x][y] = leia.nextInt();
				soma += valores[x][y];
				
			if (x == y)
				somaDiagonais += valores[x][y];
				y++;
			}
				System.out.println();
				y = 0;
				x++;
		}
			x = 0;
			y = 0;
			System.out.println("Os valores inseridos pelo usuário são: ");
			
			while (x < 3)
			{
				while (y < 3) 
				{
					System.out.print(valores[x][y] + " ");
					y++;
				}
				System.out.println();
				y = 0;
				x++;
			}
			System.out.println("A soma de todos os valores é: " + soma);
			System.out.println("A soma das diagonais principais é: " + somaDiagonais);
			leia.close();
		}
}
