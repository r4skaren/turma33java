package ecommerce;

import java.util.Locale;
import java.util.Scanner;

public class comparacao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);	
		
		// Declaração de Vetores
		int estoque[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		char resposta;
		do {
			String titulo[] = { "  COD", "PRODUTO\t", "VALOR R$", "ESTOQUE" };
			String codigo[] = { "G4-1", "G4-2", "G4-3", "G4-4", "G4-5", "G4-6", "G4-7", "G4-8", "G4-9", "G4-10" };
			String produtos[] = { "Ração", "Shampoo", "Fralda", "Remédio", "Colônia", "Alicate", "Escova", "Bola",
					"Casinha", "Caminha" };
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

			// Imprimimir Títulos
			System.out.print("\n◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾\n");
			System.out.print("\n\t\t\t\t   LAIKA FAST\n");
			System.out.print("\n◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾\n");
			System.out.print("\n\t\t\tUma experiência de viagem a lua!\n");

			// Início das compras
			System.out.print("\n\n▶ DESEJA FAZER COMPRAS S/N? ");
			resposta = leia.next().charAt(0);
			while (resposta != 'N' && resposta != 'n' && resposta != 'S' && resposta != 's') {
				System.out.print("\nOpção Inválida, verifique e digite novamente:  ");
				resposta = leia.next().charAt(0);
			}
			// Caso "resposta = S": Inicia compras
			if (resposta == 's' || resposta == 'S') {
				// Imprime titulo para tabela de produtos
				System.out.print("\n◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾\n");
				System.out.print("\nRelação de Produtos\n\n");
				System.out.print("\n________________________________________________________\n\n");
				for (int x = 0; x < 4; x++) {
					System.out.print(titulo[x] + "\t");
				}
				System.out.print("\n________________________________________________________\n");
				System.out.print("\n");

//Ilanna

				// Imprime tabela de produtos
				for (int x = 0; x < 10; x++) {
					System.out.print("| "+ codigo[x]+ "\t"+ produtos[x]+ "\t\t"+ "R$ "+ valor[x]+ "\t\t"+ estoque[x]+
							"             |\n");
				}
				System.out.print("\n________________________________________________________\n");

				do {
					leia.nextLine();
					
					System.out.print("\n▶ Digite o código do produto: ");

					codProduto = leia.next().toUpperCase();
					contador++;
					//System.out.print(codProduto);
					while (! codProduto.equals( "G4-1") && ! codProduto.equals( "G4-2") && ! codProduto.equals( "G4-3") && ! codProduto.equals( "G4-4") && ! codProduto.equals( "G4-5") && ! codProduto.equals( "G4-6") && ! codProduto.equals( "G4-7")
							&& ! codProduto.equals( "G4-8") && ! codProduto.equals( "G4-9") && ! codProduto.equals( "G4-10")) {
						System.out.print("\nCódigo Inválido, verifique e digite novamente:  ");
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
								System.out.print("▶ Produto já adicionado, digite a nova quantidade: ");
								quantidade = leia.nextInt();
								while (quantidade > estoque[enderecoCarrinho] || quantidade <= 0) {
									System.out.print("\nQuantidade indisponíveL, verifique e tente novamente.");

									quantidade = leia.nextInt();
								}

								valorCod[x] = (valor[linha] * quantidade);
								valorCompra += (valor[linha] * (quantidade - carrinhoQuantidade[enderecoCarrinho]));

								carrinhoQuantidade[enderecoCarrinho] = quantidade;
								contador--;
							}

							else {

								System.out.print("\n▶ Digite a quantidade: ");
								quantidade = leia.nextInt();

								while (quantidade > estoque[enderecoCarrinho] || quantidade <= 0) {
									System.out.print("\nQuantidade indisponíveL, verifique e tente novamente.");
									System.out.print("\n▶ Digite a quantidade: ");
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

					System.out.print(
							"\n◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻");
					System.out.print("\n\n\n\t\t\t   CARRINHO DE COMPRAS\n\n");
					System.out.print(
							"_________________________________________________________________________________\n\n");
					for (int h = 0; h < contador; h++) {
						System.out.print("\nCod." + codigo[carrinho[h]] + "\t" + "Produto:" + produtos[carrinho[h]]
								+ "\t\t" + "Valor: " + "R$ " + valor[carrinho[h]]);
						System.out.print("\t\t" + "Em estoque:" + estoque[carrinho[h]]);
						System.out.print("\n\n▶ Quantidade selecionada: " + carrinhoQuantidade[h] + "\n");
					}
					System.out.print(
							"\n_________________________________________________________________________________");
					System.out.print("\n\nValor da compra R$ " + valorCompra);
					System.out.print(
							"\n_________________________________________________________________________________");

					System.out.print("\n\n▶ Deseja continuar? ");
					resposta = leia.next().charAt(0);

					while (resposta != 'N' && resposta != 'n' && resposta != 'S' && resposta != 's') {
						System.out.print("\nOpção Inválida, verifique e digite novamente:  ");
						resposta = leia.next().charAt(0);
					}

					if (resposta == 'N' || resposta == 'n') {
						System.out.print("\n▶ Deseja alterar a compra? ");
						resposta = leia.next().charAt(0);
					}
					while (resposta != 'N' && resposta != 'n' && resposta != 'S' && resposta != 's') {
						System.out.print("\nOpção Inválida, verifique e digite novamente:  ");
						resposta = leia.next().charAt(0);
					}
				} while (resposta == 'S' || resposta == 's');

				for (int x = 0; x < 10; x++) {
					estoque[x] = estoque[x] - endereco[x];
				}

//Karen
				do {
					System.out.print(
							"\n________________________________________________________________________________\n");
					System.out.print("\n\t\t\t\t   LAIKA FAST\n");
					System.out.print(
							"\n________________________________________________________________________________\n");
					System.out.printf("\n|Valor total da compra: R$ ", valorCompra,
							", 9% de imposto sob o valor corresponde a R$", Math.round(valorCompra * 0.09), 2, "|");
					System.out.print(
							"\n________________________________________________________________________________\n");
					leia.nextLine();
					System.out.print("\n\n▶ Qual seu nome? ");
					nome = leia.nextLine();

					System.out.print("\n\n▶ Qual seu CPF? ");
					cpf = leia.nextLine();
					System.out.print("\n\n|OPÇÕES DE PAGAMENTO|\n______________________________________________________");
					System.out.print(
							"\n\nTemos 3 opções para pagamento:                          |\n________________________________________________________|");
					System.out.print("\n\nDigite 1 para comprar a vista, com desconto de 10%.     |");
					System.out.print("\nDigite 2 para comprar no crédito com acrescimo de 10%.  |");
					System.out.print("\nDigite 3 para parcelar em 2 vezes com acrescimo de 15%. |");
					System.out.print("\n________________________________________________________\n");
					System.out.print("\n\n▶ Digite aqui:");
					numero = leia.nextInt();

					switch (numero) {

					case 1:

						b = 1;

						System.out.print(
								"\n\n______________________________________________________________________________________________________________\n");
						System.out.print("\t\t\tLAIKA FAST");
						System.out.print(
								"\n\n______________________________________________________________________________________________________________\n");
						System.out.print("\t\t\t\t\t\tNOTA FISCAL");
						System.out.print(
								"\n______________________________________________________________________________________________________________\n");
						System.out.print("\t\t\tNOME:\t"+ nome+ "\t|\tCPF:\t"+ cpf+ "|\n");
						System.out.print(
								"______________________________________________________________________________________________________________\n");
						System.out.print("\t\t\tCÓDIGO\tPRODUTO\t\tVALOR\t\tQUANTIDADE\n");
						System.out.print(
								"______________________________________________________________________________________________________________\n");

						for (int h = 0; h < contador; h++) {
							System.out.print("\t\t\t"+ codigo[carrinho[h]]+ "\t"+ produtos[carrinho[h]]+ "\t\t"+ "R$ "+
									valor[carrinho[h]]+ "\t\t"+ " x "+ carrinhoQuantidade[h]+ "\n");
						}

						System.out.print(
								"\n______________________________________________________________________________________________________________\n");
						System.out.printf(
								"\t                   Valor total da compra a vista com 10%s de desconto:  R$ %.2f","%",
								(valorCompra * 0.9));
						System.out.print(
								"\n______________________________________________________________________________________________________________\n");
						System.out.print(
								"\n\t                        AGRADECEMOS PELA PREFERÊNCIA! VOLTE SEMPRE!                                            \n");
						System.out.print(
								"\n______________________________________________________________________________________________________________\n");

						break;

					case 2:
						System.out.print(
								"\n\n______________________________________________________________________________________________________________\n");
						System.out.print("\t\t\tLAIKA FAST");
						System.out.print(
								"\n\n______________________________________________________________________________________________________________\n");
						System.out.print("\t\t\t\t\t\tNOTA FISCAL");
						System.out.print(
								"\n______________________________________________________________________________________________________________\n");
						System.out.print("\t\t\tNOME:\t"+ nome+ "\t|\tCPF:\t"+ cpf+ "|\n");
						System.out.print(
								"______________________________________________________________________________________________________________\n");
						System.out.print("\t\t\tCÓDIGO\tPRODUTO\t\tVALOR\t\tQUANTIDADE\n");
						System.out.print(
								"______________________________________________________________________________________________________________\n");

						b = 1;

						for (int h = 0; h < contador; h++) {
							System.out.print("\t\t\t"+ codigo[carrinho[h]]+ "\t"+ produtos[carrinho[h]]+ "\t\t"+ "R$ "+
									valor[carrinho[h]]+ "\t\t"+ " x "+ carrinhoQuantidade[h]+ "\n");
						}
						System.out.print(
								"______________________________________________________________________________________________________________\n");
						System.out.printf(
								"\t                   Valor total da compra no credito com 10%s de acrescimo R$ %.2f","%",(valorCompra * 1.1));
						System.out.print(
								"\n______________________________________________________________________________________________________________\n");
						System.out.print(
								"\n\t                        AGRADECEMOS PELA PREFERÊNCIA! VOLTE SEMPRE!                                            \n");
						System.out.print(
								"\n______________________________________________________________________________________________________________\n");
						break;

//Juan
					case 3:
						System.out.print(
								"\n\n______________________________________________________________________________________________________________\n");
						System.out.print("\t\t\tLAIKA FAST");
						System.out.print(
								"\n\n______________________________________________________________________________________________________________\n");
						System.out.print("\t\t\t\t\t\tNOTA FISCAL");
						System.out.print(
								"\n______________________________________________________________________________________________________________\n");
						System.out.print("\t\t\tNOME:\t"+ nome+ "\t|\tCPF:\t"+ cpf+ "|\n");
						System.out.print(
								"______________________________________________________________________________________________________________\n");
						System.out.print("\t\t\tCÓDIGO\tPRODUTO\t\tVALOR\t\tQUANTIDADE\n");
						System.out.print(
								"______________________________________________________________________________________________________________\n");

						b = 1;

						for (int h = 0; h < contador; h++) {
							System.out.print("\t\t\t"+ codigo[carrinho[h]]+ "\t"+ produtos[carrinho[h]]+ "\t\t"+ "R$ "+
									valor[carrinho[h]]+ "\t\t"+ " x "+ carrinhoQuantidade[h]+ "\n");
						}
						System.out.print(
								"______________________________________________________________________________________________________________\n");
						System.out.printf(
								"\t      Valor total da compra parcelada em duas vezes com 15%s de acrescimo R$ %.2f.\nValor total por parcelas: R$ %.2f","%",(valorCompra * 1.15), (valorCompra * 0.575));
						System.out.print(
								"\n______________________________________________________________________________________________________________\n");
						System.out.print(
								"\n\t                        AGRADECEMOS PELA PREFERÊNCIA! VOLTE SEMPRE!                                            \n");
						System.out.print(
								"\n______________________________________________________________________________________________________________\n");
						break;

					default:
						b = 3;
						System.out.print("\nOpção invalida tente novamente!");

					}

				} while (a < b);
			} else {
				System.out.print("\nAté breve!! ");
			}
			System.out.print("\n▶ Deseja comprar novamente? ");
			resposta = leia.next().charAt(0);
			while (resposta != 'N' && resposta != 'n' && resposta != 'S' && resposta != 's') {
				System.out.print("\nOpção Inválida, verifique e digite novamente:  ");
				resposta = leia.next().charAt(0);
			}
		} while (resposta == 's' || resposta == 'S');

	}

}


/*leia.nextLine();
						System.out.print(
								"\n\n                 ____________________________________________________________\n");
						System.out.print("\t\t\tLAIKA FAST");
						System.out.print(
								"\n\n                 ____________________________________________________________\n");
						System.out.print("\t\t\t\t\t\t\tNOTA FISCAL");
						System.out.print(
								"\n\n                 ____________________________________________________________\n");
						System.out.print("\t\t\tNOME:\t"+ nome+ "\t|\t\tCPF:\t"+ cpf+ "|\n");
						System.out.print(
								"                 ____________________________________________________________\n");
						System.out.print("\t\t\tCÓDIGO\t\tPRODUTO\t\tVALOR\t\tQUANTIDADE\n");
						System.out.print(
								"                 ____________________________________________________________\n");

*/