package lista1;

import java.util.Scanner;

public class Lista1Exer3 {


	/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
	 *expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
	 */

		public static void main(String[] args) {
		
			//variaveis
			@SuppressWarnings("resource")
			Scanner leia = new Scanner(System.in);//instanciamento
			int horas, minutos , tempoDuracaoEventoSegundos, seg;
	
			//entradas
			System.out.print("Informe o tempo de duração do evento em segundos :");
			tempoDuracaoEventoSegundos = (int) leia.nextDouble();
	
			//processamentos
			horas = (int) (tempoDuracaoEventoSegundos/ 3600);
			minutos = (int) ((tempoDuracaoEventoSegundos % 3600) / 60);
			seg = (int) ((tempoDuracaoEventoSegundos % 3600) % 60);
	
			//saidas
			System.out.print("A duração do evento foi de "+ horas 
					+" horas "+minutos+ " minutos e "+seg+ " segundos");
	}
}

