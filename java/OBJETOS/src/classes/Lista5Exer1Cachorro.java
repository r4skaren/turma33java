package classes;


public class Lista5Exer1Cachorro extends Lista5Exer1Animal implements Lista5Exer1Treinamento {


		public Lista5Exer1Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}

		public void correr() {
			System.out.println("Cachorro correndo....");
		}
		
		@Override
		public void emitirSom() {
			System.out.println("au au au au....");
		}

		@Override
		public void rolarChao() {
			System.out.println("Cachorro em rolando no chão...");
			
		}

		@Override
		public void emDuasPatas() {
			System.out.println("Cachorro em duas patas...");
			
		}
	}

		