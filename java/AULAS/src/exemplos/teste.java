package exemplos;

import java.util.Scanner;

public class teste {
     
	public static void main(String[] args) {
		
	//variaveis
	@SuppressWarnings("resource")
	Scanner leia = new Scanner(System.in);
	
	int valorPontuacao[] = new int[5];
	int maiorValor =0;
	
	for(int i=0; i<5; i++) {
		System.out.println("Digite a pontuação do "+i+1+"º:");
		
		valorPontuacao[i] = leia.nextInt();
		
		if(valorPontuacao[i] > maiorValor){
			maiorValor = valorPontuacao[i];
		}
	} 
	System.out.println("Maior pontuação foi:"+maiorValor);
	}
}
