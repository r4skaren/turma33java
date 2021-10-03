package classes;

public class Lista5Exer1Animal {
	
	private String nome;
	private int idade;
	private String som;
	private String corrida;
		
		public String emitirSom() 
		{
			
			return som;
		}
		
		public Lista5Exer1Animal(String nome, int idade, String som, String corrida) 
		{
			super();
			this.nome = nome;
			this.idade = idade;
			this.som = som;
			this.corrida = corrida;
		}
		public String getNome() 
		{
			return nome;
		}
		public void setNome(String nome) 
		{
			this.nome = nome;
		}
		public int getIdade()
		{
			return idade;
		}
		public void setIdade(int idade) 
		{
			this.idade = idade;
		}
		public String getSom() {
			return som;
		}
		public void setSom(String som) 
		{
			this.som = som;
		}
		
		public String getCorrida()
		{
			return corrida;
		}
		
		//public void setCorrida()
		//{
			//this.corrida = corrida;
		//}
		
		public void exibir() 
		{
			System.out.println("O Animal: " + getNome() + " tem "+ getIdade() + " anos e emite um som de "+getSom() + " e "+ getCorrida() );
			
		}	
	}