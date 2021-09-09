package classes;

/*1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto cliente, 
 * defina as instancias deste objeto e apresente as informações deste objeto no console.
 */
public class Lista4Exer1 {
	
		public boolean vivo;
		public String primeiroNome, nomesDoMeio,ultimoNome;
		public char pronome;
		public boolean ativo = false;

	
		public Lista4Exer1 (String primeiro, String meio, String ultimo) { 
			primeiroNome = primeiro;
			nomesDoMeio = meio;
			ultimoNome = ultimo;
		}
		
		public String getNomeCompleto() {
			String nomeCompleto = primeiroNome+ " "+nomesDoMeio+" "+ultimoNome;
			return nomeCompleto;
		}
			
			public void ativoCliente() {
				if(ativo) {
					System.out.println("Cliente: "+getNomeCompleto()+"\nSituação: Ativade");
				}
				else {
					System.out.println("Cliente: "+getNomeCompleto()+"\nSituação: Desatividade");
				}
		}

}

