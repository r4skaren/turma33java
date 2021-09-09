package ecommerce;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProjetoFinalizado {

	public static void main(String[] args) {

		//AVISO = para que seu console apresente a melhor performace de design
		//configure a fonte do seu console para verdana/regular/14
		
		Scanner leia = new Scanner(System.in);	
		
		
		// data/hora atual
		LocalDateTime data = LocalDateTime.now();
		
		// formatação da data
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	    String dataFormatada = data.format(formatter);
	    
	    formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	    
	    String dataFormatado = data.format(formatter);
		
		// Declaração de Vetores
		int estoque[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		char resposta;
		do {
			String titulo[] = { "\t\t\t╔═══════════════════════════════════════════════════════════════════════════════════════════════════════════╗\n"
					               + "\t\t\t║\t\tCOD \t","\tPRODUTO\t", "\t\tVALOR R$","\t\t ESTOQUE             ║" };
			String codigo[] = { "G4-1", "G4-2", "G4-3", "G4-4", "G4-5", "G4-6", "G4-7", "G4-8", "G4-9", "G4-10" };
			String produtos[] = { "Ração", "Shampoo", "Fralda", "Remédio", "Colônia", "Alicate", "Escova", "Bola   ","Casinha", "Caminha" };
			double valor[] = { 95.0, 90.0, 40.0, 95.0, 90.0, 50.0, 10.0, 90.0, 70.0, 79.0 };
			int carrinhoQuantidade[] = new int[10];
			int carrinho[] = new int[10];
			String carrinhoCod[] = new String[10];
			double valorCod[] = new double[10];
			int endereco[] = new int[10];
			
			// Declaração de Variáveis
			// caracter resposta
			String codProduto, nome, cpf;
			int linha = 0, quantidade = 0, contador = 0, enderecoCarrinho = 0;
			double valorCompra = 0.00;
			char resposta2;
			int numero;
			int a = 2, b = 1;
			
			
			//Imprimir Títulos
			System.out.print("\n▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
			System.out.print("\n▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
			System.out.print("\n▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ 🚀  LAIKA FAST 🚀 ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
			System.out.print("\n▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n");
			System.out.print("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n");
			System.out.print("\n\t\t\t\t\t\t\t\t\t  Uma experiência de viagem a lua!\n");
			System.out.print("                                                                        ▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔▔                                                                   \n");
			System.out.println("\n\t\t\t\t\t\t\t\t\t        SEJA MUITO BEM-VINDE❗\n\t\t\t\t\t\t\t\t\t         ⭐ 🐱‍🚀 ⭐ ⭐ ⭐ ⭐ ⭐ 🚀 ⭐ ⭐");
			
			
			//Início das compras
			System.out.print("▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃\n");
			System.out.print("\n\n\t\t\t ☛ DESEJA FAZER COMPRAS (S/N)? ");
			resposta = leia.next().charAt(0);
			System.out.println();

			while (resposta != 'N' && resposta != 'n' && resposta != 'S' && resposta != 's') {
				System.out.print("\n\t\t\t ⛒ Opção Inválida, verifique e digite novamente:  ");
				resposta = leia.next().charAt(0);
			}
			
			//Caso "resposta = S": Inicia compras
			if (resposta == 's' || resposta == 'S') {
				
				// Imprime título para tabela de produtos
				System.out.print("\n▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃▃\n");
				System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t  NOSSOS PRODUTOS\n\n");
				System.out.print("\n▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅\n\n");
				for (int x = 0; x < 4; x++) {
					System.out.print(titulo[x] + "\t");
				}
				System.out.print("\n                        ╠═══════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
				System.out.print("\n");

//Ilanna
				//Imprime tabela de produtos
				for (int x = 0; x < 9; x++) {
					System.out.print("\t\t\t║\t\t"+ codigo[x]+"\t\t\t"+produtos[x]+ "\t\t\t\tR$"+ "\t"+valor[x]+ "\t\t\t\t"+estoque[x]+"\t\t   ║\n");
				}
				
				System.out.print("                        ╚═══════════════════════════════════════════════════════════════════════════════════════════════════════════╝\n");

				do {
					leia.nextLine();
					
					System.out.print("\n\t\t\t"+"☛ Digite o código do produto: ");

					codProduto = leia.next().toUpperCase();
					contador++;
					
					
					while (! codProduto.equals( "G4-1") && ! codProduto.equals( "G4-2") && ! codProduto.equals( "G4-3") && ! codProduto.equals( "G4-4") && ! codProduto.equals( "G4-5") && ! codProduto.equals( "G4-6") && ! codProduto.equals( "G4-7")
							&& ! codProduto.equals( "G4-8") && ! codProduto.equals( "G4-9") && ! codProduto.equals( "G4-10")) {
						System.out.print("\n\t\t\t"+"⌦ Código Inválido, verifique e digite novamente: ");
						codProduto = leia.next().toUpperCase();
					}

					for (int x = 0; x < 10; x++) {
						if (codProduto.equals(codigo[x])) {
							linha = x;

							if (endereco[x] != 0) {
								for (int y = 0; y < contador; y++) {
									if (codProduto == carrinhoCod[y]) {
										enderecoCarrinho = y;
									}
								}
								System.out.print("\n\t\t\t"+"⌦ Produto já adicionado. \n\t\t\t☛ Digite a nova quantidade: ");
								quantidade = leia.nextInt();
								while (quantidade > estoque[enderecoCarrinho] || quantidade <= 0) {
									System.out.print("\n\t\t\t⛒ Quantidade indisponível, verifique e tente novamente.");

									quantidade = leia.nextInt();
								}

								valorCod[x] = (valor[linha] * quantidade);
								valorCompra += (valor[linha] * (quantidade - carrinhoQuantidade[enderecoCarrinho]));

								carrinhoQuantidade[enderecoCarrinho] = quantidade;
								contador--;
							}

							else {

								System.out.print("\n\t\t\t☛ Digite a quantidade: ");
								quantidade = leia.nextInt();

								while (quantidade > estoque[enderecoCarrinho] || quantidade <= 0) {
									System.out.print("\n\t\t\t⌦ Quantidade indisponível, verifique e tente novamente.");
									System.out.print("\n\t\t\t☛ Digite a quantidade: ");
									quantidade = leia.nextInt();
								}
								for (int r = contador - 1; r < contador; r++) {
									carrinho[r] = linha;
									carrinhoQuantidade[r] = quantidade;
									carrinhoCod[r] = codigo[x];

									valorCompra += (valor[linha] * quantidade);
									valorCod[r] = (valor[linha] * quantidade);

								}

							}
							endereco[x] = quantidade;
						}
					}

//Matheus            	
					//Apresenta o carrinho atualizado
					System.out.print("\n▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅");
					System.out.print("\n\n\t\t\t🛒 MEU CARRINHO DE COMPRAS\n");
					System.out.print(
							"\t\t\t╒══════════════════════════════════════════════════════════════════════════════════════════════════════╕\n");
					for (int h = 0; h < contador; h++) {
						System.out.print("\n\t\t\t│ Cod. " + codigo[carrinho[h]] + "\t\t" + "Produto: " + produtos[carrinho[h]]
								+ "\t\t" + "Valor: " + "R$ " + valor[carrinho[h]]);
						System.out.print("\t\t" + "Em estoque: " + estoque[carrinho[h]]+"\t            │");
						System.out.print("\n\n\t\t\t│ 📦 Quantidade selecionada: " + carrinhoQuantidade[h] +"\t                                                                                    │"+"\n");
					}
					System.out.print(
							"\n\t\t\t┍━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┐");
					System.out.print("\n\t\t\t┃ 🛍️ Valor da compra R$ " + valorCompra+"                                                                                          ┃");
					System.out.print("\n\t\t\t┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┙");

					System.out.print("\n\n\t\t\t☛ Deseja escolher mais produtos (S/N)? ");
					resposta = leia.next().charAt(0);

					while (resposta != 'N' && resposta != 'n' && resposta != 'S' && resposta != 's') {
						System.out.print("\n\t\t\t⛒ Opção Inválida, verifique e digite novamente:  ");
						resposta = leia.next().charAt(0);
					}

					if (resposta == 'N' || resposta == 'n') {
						System.out.print("\n\t\t\t🤔 Deseja alterar a compra? ");
						resposta = leia.next().charAt(0);
						System.out.println("\n");
					}
					while (resposta != 'N' && resposta != 'n' && resposta != 'S' && resposta != 's') {
						System.out.print("\n\t\t\t ⛒ Opção Inválida, verifique e digite novamente:  ");
						resposta = leia.next().charAt(0);
					}
				} while (resposta == 'S' || resposta == 's');

				for (int x = 0; x < 10; x++) {
					estoque[x] = estoque[x] - endereco[x];
				}

//Karen     //Nota Fiscal
				do {
					//Total da Compra e Impostos
					System.out.print("\t\t\t▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
					System.out.print("\n\t\t\t▓▓▓▓▓ LAIKA FAST ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n");
					System.out.print(
							"\n\t\t\t┍━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┐\n");
					System.out.printf("\t\t\t| 🛍️ Valor total da compra: R$ "+valorCompra+", 9%s de imposto sob o valor corresponde a R$ %.2f","%",(valorCompra * 0.9));
					System.out.println("        |");
					System.out.print("\t\t\t┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┙\n");
					leia.nextLine();
					
					//Dados do Cliente
					System.out.println("\n\n\t\t\t▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
					System.out.print("\n\t\t\t📋 Qual seu nome? ");
					nome = leia.nextLine();
					System.out.println("\n\n\t\t\t▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
					System.out.print("\n\t\t\t📋 Qual seu CPF? ");
					cpf = leia.nextLine();
					
					//Opções de pagamento
					System.out.println("\n");
					System.out.println("\t\t\t╔═══════════════════════════════════════════════════════════════════════════════════════════════════════╗");
					System.out.print("\t\t\t║\tOPÇÕES DE PAGAMENTO 💳                                                                                       ║"
							+ "\n\t\t\t╠═══════════════════════════════════════════════════════════════════════════════════════════════════════╣");
					System.out.print(
							"\n\t\t\t║\tTemos 3 opções para pagamento:                                                                               ║"
							+ "\n\t\t\t╠═══════════════════════════════════════════════════════════════════════════════════════════════════════╣");
					System.out.print("\n\t\t\t║\t↦ Digite 1 para comprar a vista, com desconto de 10%.                                                 ║");
					System.out.print("\n\t\t\t║\t↦ Digite 2 para comprar no crédito com acrescimo de 10%.                                            ║");
					System.out.print("\n\t\t\t║\t↦ Digite 3 para parcelar em 2 vezes com acrescimo de 15%.\t\t\t\t\t      ║");
					System.out.print("\n\t\t\t╚═══════════════════════════════════════════════════════════════════════════════════════════════════════╝\n");
					System.out.print("\n\n\t\t\t\t☛ Digite aqui: ");
					numero = leia.nextInt();

					switch (numero) {

					case 1:
						
						b = 1;
						leia.nextLine();
						System.out.print("\n▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅");
						System.out.print("\n\n\t\t\t____________________________________________________________\n");
						System.out.print("\t\t\tLAIKA FAST LTDA. \n \t\t\tAV. PAULISTA, 2021 - SÃO PAULO - SP \n \t\t\tCNPJ: 94.753.745/0011-56");
						System.out.print("\n\t\t\t____________________________________________________________\n");
						System.out.print("\t\t\t"+dataFormatado+"\n\t\t\tNOTA FISCAL");
						System.out.print("\n\t\t\t____________________________________________________________\n");
						System.out.print("\t\t\tNOME:\t"+ nome+ "\t|\t\tCPF:\t"+ cpf+ "|\n");
						System.out.print("\t\t\t____________________________________________________________\n");
						System.out.print("\t\t\tCÓDIGO\t\tPRODUTO\t\tVL. UNIT\t\tQTD.\n");
						System.out.print("\t\t\t____________________________________________________________\n");

						for (int h = 0; h < contador; h++) {
							System.out.print("\t\t\t"+ codigo[carrinho[h]]+ "\t\t\t"+ produtos[carrinho[h]]+ "\t\t"+ "R$ "+
									valor[carrinho[h]]+ "\t\t"+ " x "+ carrinhoQuantidade[h]+ "\n");
						}
						System.out.print("\n\t\t\t____________________________________________________________\n");
						System.out.printf("\t\t\tValor total da compra a vista com 10%s de desconto:  R$ %.2f","%",
								(valorCompra * 0.9));
						System.out.print("\n\t\t\t____________________________________________________________\n");
						System.out.print("\n\t\t                     AGRADECEMOS PELA PREFERÊNCIA! VOLTE SEMPRE!                                            ");
						System.out.print("\n\t\t\t____________________________________________________________\n");

						break;

					case 2:
						System.out.print("\n▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅");
						System.out.print("\n\n\t\t\t____________________________________________________________\n");
						System.out.print("\t\t\tLAIKA FAST LTDA. \n \t\t\tAV. PAULISTA, 2021 - SÃO PAULO - SP \n \t\t\tCNPJ: 94.753.745/0011-56");
						System.out.print("\n\t\t\t____________________________________________________________\n");
						System.out.print("\t\t\t"+dataFormatado+"\n\t\t\tNOTA FISCAL");
						System.out.print("\n\t\t\t____________________________________________________________\n");
						System.out.print("\t\t\tNOME:\t"+ nome+ "\t|\t\tCPF:\t"+ cpf+ "|\n");
						System.out.print("\t\t\t____________________________________________________________\n");
						System.out.print("\t\t\tCÓDIGO\t\tPRODUTO\t\tVL. UNIT\t\tQTD.\n");
						System.out.print("\t\t\t____________________________________________________________\n");
						
						b = 1;

						for (int h = 0; h < contador; h++) {
							System.out.print("\t\t\t"+ codigo[carrinho[h]]+ "\t\t\t"+ produtos[carrinho[h]]+ "\t\t"+ "R$ "+
									valor[carrinho[h]]+ "\t\t"+ " x "+ carrinhoQuantidade[h]+ "\n");
						}
						System.out.print("\n\t\t\t____________________________________________________________\n");
						System.out.printf("\t\t\tValor total da compra no crédito com 10%s de acrescimo R$ %.2f","%",(valorCompra * 1.1));
						System.out.print("\n\t\t\t____________________________________________________________\n");
						System.out.print("\n\t\t                     AGRADECEMOS PELA PREFERÊNCIA! VOLTE SEMPRE!                                            ");
						System.out.print("\n\t\t\t____________________________________________________________\n");
						break;

//Juan
					case 3:
						System.out.print("\n▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅");
						System.out.print("\n\n\t\t\t_____________________________________________________________________\n");
						System.out.print("\t\t\tLAIKA FAST LTDA. \n \t\t\tAV. PAULISTA, 2021 - SÃO PAULO - SP \n \t\t\tCNPJ: 94.753.745/0011-56");
						System.out.print("\n\t\t\t_____________________________________________________________________\n");
						System.out.print("\t\t\t"+dataFormatado+"\n\t\t\tNOTA FISCAL");
						System.out.print("\n\t\t\t_____________________________________________________________________\n");
						System.out.print("\t\t\tNOME:\t"+ nome+ "\t|\t\tCPF:\t"+ cpf+ "|\n");
						System.out.print("\t\t\t_____________________________________________________________________\n");
						System.out.print("\t\t\tCÓDIGO\t\tPRODUTO\t\tVL. UNIT\t\tQTD.\n");
						System.out.print("\t\t\t_____________________________________________________________________\n");
						
						b = 1;

						for (int h = 0; h < contador; h++) {
							System.out.print("\t\t\t"+ codigo[carrinho[h]]+ "\t\t\t"+ produtos[carrinho[h]]+ "\t\t"+ "R$ "+
									valor[carrinho[h]]+ "\t\t"+ " x "+ carrinhoQuantidade[h]+ "\n");
						}
						System.out.print("\n\t\t\t_____________________________________________________________________\n");
						System.out.printf("\t\t\t  Valor total da compra parcelada em duas vezes com 15%s de acrescimo R$ %.2f.\n\t\t\t  Valor total por parcelas: R$ %.2f","%",(valorCompra * 1.15), (valorCompra * 0.575));
						System.out.print("\n\t\t\t_____________________________________________________________________\n");
						System.out.print("\n\t\t                                 AGRADECEMOS PELA PREFERÊNCIA! VOLTE SEMPRE!                                            ");
						System.out.print("\n\t\t\t_____________________________________________________________________\n");
						
						break;

					default:
						b = 3;
						System.out.print("\n ⌦ Opção invalida tente novamente!");

					}

				} while (a < b);
			} else {
				System.out.print("\nATÉ BREVE! ESPERAMOS VER VOCÊ NOVAMENTE! 🐱‍🚀🚀");
			}
			System.out.print("\n▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅");
			System.out.print("\n\n\t\t\t🐱‍🚀 Deseja comprar novamente? ");
			resposta = leia.next().charAt(0);
			
			
			while (resposta != 'N' && resposta != 'n' && resposta != 'S' && resposta != 's') {
				System.out.print("\n⌦ Opção Inválida, verifique e digite novamente."
						+ "\\n☛  ");
				resposta = leia.next().charAt(0);
			}
		} while (resposta == 's' || resposta == 'S');
	}
}