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
		System.out.println("A cor do carro é: "+carro1.cor);
		System.out.println("O ano de lasçamento do carro é: "+carro1.anoLascamento);
		System.out.println("O seu carro nesse momento está: "+carro1.ligado);
		System.out.println("Já o seu rádio está: "+carro1.radio);
	}

}
