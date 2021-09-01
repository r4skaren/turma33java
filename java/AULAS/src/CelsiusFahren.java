import java.util.Scanner;

public class CelsiusFahren {

	public static void main(String[] args) {

		//variaveis
		Scanner leia = new Scanner(System.in);//instanciamento
		String nome;
		double celsius;
		double fahrenheit;
				
		//entradas
		System.out.print("Digite seu nome: ");
		nome = leia.next();
		System.out.print("Qual é a temperatura em graus:");
		celsius = leia.nextDouble();

		fahrenheit =(double) (1.8*celsius+32);
		
		//saida
		System.out.println(nome+" sua temperatura em Celsius, neste exato momento é: "+celsius+"\nSua temperatura convertida em Fahrenheit é: "+fahrenheit);

}
}
