package exemplos;

public class CarroTeste {

	public static void main(String[] args) {
		
		//variaveis
		Carro carro1 = new Carro();
		
		carro1.cor = "Preto";
		carro1.anoLascamento = 2020;
		carro1.ligado = true;
		carro1.radio = true;
		
		
		//saidas
		System.out.println("A cor do carro �: "+carro1.cor);
		System.out.println("O ano de las�amento do carro �: "+carro1.anoLascamento);
		System.out.println("O seu carro nesse momento est�: "+carro1.ligado);
		System.out.println("J� o seu r�dio est�: "+carro1.radio);
	}

}
