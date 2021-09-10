package classes;

public class Lista5Exer1Cavalo extends Lista5Exer1Animal implements Lista5Exer1Treinamento{

	
	public Lista5Exer1Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	public void correr() {
		System.out.println("Cavalo correndo....");
	}
	@Override 
	public void emitirSom() {
		System.out.println("Irccccc irccccc.");
	}

	@Override
	public void rolarChao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emDuasPatas() {
		System.out.println("Cavalo em duas patas....");
		
	}
	
}
