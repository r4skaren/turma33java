package classes;

public class Lista5Exer1Animal {
		
		//atributos
		private String nome;
		private int idade;

		//construtor
		public Lista5Exer1Animal (String nome, int idade) {
			super();
			this.nome = nome;
			this.idade = idade;
		}
		//encapsulamento - getters and setters

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}
			
		//metodos
		public void emitirSom() {
			System.out.println("Emitindo som....");
		}

		@Override
		public String toString() {
			return "Animal [nome=" + nome + ", idade=" + idade + "]";
		}	
	}
