package App;

import Classes.Leitores;
import Classes.Titulos;

public class Programa {

	public static void main(String[] args) {
		Titulos titulo = new Titulos();
		Leitores leitor = new Leitores();
		
		char respostaWhile, respostaCarrinho, respostaOutraCompra;
		
		// LAÇO PRINCIPAL
		do {
			// Titulos de abertura
			titulo.tituloAbertura();
			titulo.desejaComprar1();
			
			leitor.pegaResposta();
			respostaWhile = leitor.getResposta();
			respostaCarrinho = leitor.getResposta();
			// Condição entrar no carrinho
			while(respostaCarrinho == 'S') {		
				//Titutos de tabela
				titulo.tituloTabela1();
				// CLASSE PRODUTO - GUI E ILANNA - TITULO DA TABELA
				titulo.tituloTabela2();
				// CLASSE PRODUTO - GUI E ILANNA - TABELA DE PRODUTOS
				titulo.tituloTabela3();
				
				// Lê código do produto
				System.out.print("\n\t\t\t"+"☛ Digite o código do produto: ");
				leitor.pegaCodigo();
				// Metodo Para Validar e Adicionar Ao carrinho.
				System.out.print("\n\t\t\t☛ Digite a quantidade: ");
				leitor.pegaQuantidade();
				//Metodo para Validar e Verificar se quantidade está disponível.
				titulo.carrinhoAberto();
				// Metodo para mostrar Produto / Quantidade / Valor do carrinho.
				
				System.out.print("\n\t\t\t:thinking: Deseja alterar a compra? ");
				leitor.pegaResposta();
				respostaOutraCompra = leitor.getResposta();

				 while (respostaOutraCompra != 'S' || respostaOutraCompra != 'N') {
						System.out.print("\n\t\t\t:thinking: Opção inválida ");
						System.out.print("\n\t\t\t:thinking: Deseja alterar a compra? ");
						leitor.pegaResposta();
						respostaOutraCompra = leitor.getResposta();
				} 
			
				
				if(respostaOutraCompra == 'S') {
					break;					
				} else {
					
				}
				
				
				// Metodo Pergunta se quer realizar outra compra (Se sim, dá break)
				
				// Se não - Método para perguntar se quer alterar a quantidade.
				
			} 	
			break;
			
		}while(respostaWhile == 'S');
		
		titulo.naoComprar();
			
		
	}
	public static void fun() {
		System.out.println("Função");
	}
}