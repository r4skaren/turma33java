import java.util.Scanner;

public class OiMundo {

	public static void main(String[] args) {

		//variaveis
		Scanner leia = new Scanner(System.in);//instanciamento
		String nome;
		int anoNascimento;
		int anoAtual=2021;

		//entradas
		System.out.print("Digite o nome :");
		nome = leia.next().toUpperCase();
		System.out.print("Digite o ano de nascimento :");
		anoNascimento = leia.nextInt();

		//saida
		System.out.print("Oi Mundo!");
		System.out.println(nome+" sua idade é "+(anoAtual-anoNascimento)+" anos.");
		System.out.println("O nome da pessoa digita tem o total de letras: "+nome.length());

	}

}