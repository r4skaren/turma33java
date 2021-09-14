package app;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import classes.Leitores;
import classes.Titulos;
import classes.Produto;

public class LaikaFast {

	public static void main(String[] args) {
		
		/*AVISO: para que seu console apresente a melhor performace de design
		configure a fonte do seu console para verdana - regular - 14   */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Leitores leitor = new Leitores();
		Titulos titulo = new Titulos();
		
		String auxCod = "";
		String titulos[] = { "\t\t\t╔═══════════════════════════════════════════════════════════════════════════════════════════════════════════╗\n"
	               + "\t\t\t║\t\tCOD \t","\tPRODUTO\t", "\t\tESTOQUE","\t\tVALOR R$             ║" };
		int auxIndice = 0, auxIndiceCarrinho = 0;
		int auxQtde = 0;
		char respostaWhile = 'S', respostaAlteraQtd;
		double valorTotal = 0;
		boolean validador = false, a = true;
		int b = 1;
		String nome;
		String cpf;

		char respostaLoop = 'S';
		int contador = 0;
		
		LocalDateTime data = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String dataFormatada = data.format(formatter);

		formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		String dataFormatado = data.format(formatter);

		List<Produto> cadastro = new ArrayList<>();
		List<Produto> carrinho = new ArrayList<>();

		// carregando o cadastro inicial

		cadastro.add(new Produto("G4-01", "Ração", 25.00, 10));
		cadastro.add(new Produto("G4-02", "Shampoo", 10.00, 10));
		cadastro.add(new Produto("G4-03", "Fralda", 35.00, 10));
		cadastro.add(new Produto("G4-04", "Remédio", 10.00, 10));
		cadastro.add(new Produto("G4-05", "Colônia", 14.00, 10));
		cadastro.add(new Produto("G4-06", "Alicate", 15.00, 10));
		cadastro.add(new Produto("G4-07", "Escova", 20.00, 10));
		cadastro.add(new Produto("G4-08", "Bolinha", 10.00, 10));
		cadastro.add(new Produto("G4-09", "Casinha", 95.00, 10));
		cadastro.add(new Produto("G4-10", "Arranhador", 70.00, 10));

				// ABERTURA
				// Titulos de abertura
				titulo.tituloAbertura();
				while (respostaLoop == 'S') {
					respostaWhile = 'S';
					while (respostaWhile == 'S') {
						titulo.desejaComprar1();
						leitor.pegaResposta();
						respostaWhile = leitor.getResposta();
						respostaWhile = leitor.getResposta();
						
						// Condição entrar no carrinho
						while(respostaWhile == 'S') {
								titulo.tituloTabela1();
						for (int x = 0; x < 4; x++) {
								System.out.print(titulos[x] + "\t");
						}
						titulo.tituloTabela2();
						for (Produto item : cadastro) {
								System.out.print("\t\t\t║\t\t"+item.getCodigo() + "\t\t" + item.getNome() + "\t\t\t\t" + item.getEstoque() + "\t\t\t\t"+ item.getValor()+"\t\t\t   ║\n");	
						}
						titulo.tituloTabela3();
						System.out.print("\n\t\t\t☛ Digite o codigo do produto que deseja comprar ou alterar: ");
						auxCod = leia.next().toUpperCase();
						auxIndice = 0;

						while (! auxCod.equals( "G4-01") && ! auxCod.equals( "G4-02") && ! auxCod.equals( "G4-03") && ! auxCod.equals( "G4-04") && ! auxCod.equals( "G4-05") && ! auxCod.equals( "G4-06") && ! auxCod.equals( "G4-07")
						&& ! auxCod.equals( "G4-08") && ! auxCod.equals( "G4-09") && ! auxCod.equals( "G4-10")) {
							System.out.print("\n\t\t\t"+"⌦ Código Inválido, verifique e digite novamente: ");
							auxCod = leia.next().toUpperCase();
						}

						for (Produto item : cadastro) {
							if (item.getCodigo().equals(auxCod)) {
						break;
							}
							auxIndice++;
						}
						
						if (cadastro.size() == auxIndice) {
							System.out.println("\n\t\t\tItem não encontrado");
							break;
						} else {
							auxIndiceCarrinho = 0;
							validador = false;

							for (Produto item : carrinho) {
								if (item.getCodigo().equals(auxCod)) {
							validador = true;
							break;
						}
							}
							auxIndiceCarrinho++;
						}

						if (validador) {
							System.out.print("\n\t\t\t☛ Quanto deseja comprar: ");
							auxQtde = leia.nextInt();
							while (auxQtde > cadastro.get(auxIndice).getEstoque() || auxQtde <= 0) {
								System.out.print("\n\t\t\t⌦ Quantidade indisponível, verifique e tente novamente.");
								System.out.print("\n\t\t\t☛ Digite a quantidade: ");
								auxQtde = leia.nextInt();
							}
							auxIndiceCarrinho -= 1;

							carrinho.get(auxIndiceCarrinho).alterarQtd(auxQtde);
							auxQtde++;

						} else {
							System.out.print("\n\t\t\t☛ Quanto deseja comprar: ");
							auxQtde = leia.nextInt();
							while (auxQtde > cadastro.get(auxIndice).getEstoque() || auxQtde <= 0) {
								System.out.print("\n\t\t\t⌦ Quantidade indisponível, verifique e tente novamente.");
								System.out.print("\n\t\t\t☛ Digite a quantidade: ");
								auxQtde = leia.nextInt();
							}

							carrinho.add(new Produto(cadastro.get(auxIndice).getCodigo(), cadastro.get(auxIndice).getNome(),
							cadastro.get(auxIndice).getValor(), auxQtde));
						}
							titulo.carrinhoAberto();
							valorTotal = 0;
						
							for (Produto item : carrinho) {
								
								System.out.println("\n\t\t\t│ Cod. "+item.getCodigo() + "\t\tProduto: " + item.getNome() + "\t\tEm estoque: " +
							+ item.getValor() + "\tValor: R$" + (item.getEstoque() * item.getValor())+"\t\t    │");
								System.out.println("\n\t\t\t│ 📦 Quantidade selecionada:"+item.getEstoque()+"\t                                                                                    │"+"\n");
								valorTotal += (item.getValor() * item.getEstoque());
							}
							titulo.carrinhoValor();
							System.out.printf("\n\t\t\t┃   🛍️ Valor da compra R$ " +valorTotal+"\t                                                                                    │");
							titulo.carrinhoValor1();
							
							System.out.print("\n\n\t\t\tDeseja  adicionar ou modificar produtos? \n\n\t\t\tDigite S para sim ou N para não: ");
							respostaWhile = leia.next().toUpperCase().charAt(0);
							System.out.print("\n");
							
						}
				// Total da Compra e Impostos
				titulo.logo();
				System.out.print("\n\t\t\t┍━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┐\n");
				System.out.printf("\t\t\t| 🛍️ Valor total da compra: R$ ",valorTotal,", 9%s de imposto sob o valor corresponde a R$ %.2f", "%", (valorTotal * 0.9));
				System.out.println("          |");
				System.out.print("\t\t\t┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┙\n");
				leia.nextLine();
								
						}
				// Dados do Cliente
				System.out.println("\n\n\t\t\t▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
				System.out.print("\n\t\t\t📋 Qual seu nome? ");
				nome = leia.nextLine();
				System.out.println("\n\n\t\t\t▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
				System.out.print("\n\t\t\t📋 Qual seu CPF? ");
				cpf = leia.nextLine();
				
				// Opções de pagamento
				System.out.println("\n");
				titulo.logo();
				System.out.println("\n");
				System.out.println("\t\t\t╔═══════════════════════════════════════════════════════════════════════════════════════════════════════╗");
				System.out.print("\t\t\t║\tOPÇÕES DE PAGAMENTO 💳                                                                                       ║"
								+ "\n\t\t\t╠═══════════════════════════════════════════════════════════════════════════════════════════════════════╣");
				System.out.print("\n\t\t\t║\tTemos 3 opções para pagamento:                                                                               ║"
								+ "\n\t\t\t╠═══════════════════════════════════════════════════════════════════════════════════════════════════════╣");
				System.out.print("\n\t\t\t║\t↦ Digite 1 para comprar a vista, com desconto de 10%.                                                 ║");
				System.out.print("\n\t\t\t║\t↦ Digite 2 para comprar no crédito com acrescimo de 10%.                                            ║");
				System.out.print("\n\t\t\t║\t↦ Digite 3 para parcelar em 2 vezes com acrescimo de 15%.\t\t\t\t\t      ║");
				System.out.print("\n\t\t\t╚═══════════════════════════════════════════════════════════════════════════════════════════════════════╝\n");
				System.out.print("\n\n\t\t\t\t☛ Digite aqui: ");
				int numero = leia.nextInt();

				switch (numero) {

				case 1:

					b = 3;
					leia.nextLine();
					System.out.print("\n▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅");
					titulo.linhaNotaF();
					System.out.print("\t\t\tLAIKA FAST LTDA. \n \t\t\tAV. PAULISTA, 2021 - SÃO PAULO - SP \n \t\t\tCNPJ: 94.753.745/0011-56");
					titulo.linhaNotaF();
					System.out.print("\t\t\t" + dataFormatado + "\n\t\t\tNOTA FISCAL");
					titulo.linhaNotaF();
					System.out.print("\t\t\tNOME:\t" + nome + "\t|\t\tCPF:\t" + cpf + "|\n");
					titulo.linhaNotaF();
					System.out.print("\t\t\tCÓDIGO\t\tPRODUTO\t\t\tVL. UNIT\t\t\tQTD.\n");
					titulo.linhaNotaF();
					
					for (Produto item : carrinho) {
						System.out.println("\n\t\t\t"+item.getCodigo() + "\t\t" + item.getNome()+"\t\t\t"+ item.getValor() + "\t\t\t\t"+item.getEstoque());	
					}
					titulo.linhaNotaF();
					System.out.printf("\n\t\t\tValor Total: " + valorTotal);
					
					titulo.linhaNotaF();
					System.out.printf("\t\t\tValor total da compra a vista com 10%s de desconto:  R$ %.2f", "%",(valorTotal * 0.9));
					titulo.linhaNotaF();
					System.out.print(
							"\n\t\t                     AGRADECEMOS PELA PREFERÊNCIA! VOLTE SEMPRE!                                            ");
					titulo.linhaNotaF();
					a = false;
					break;

				case 2:

					leia.nextLine();
					System.out.print("\n▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅");
					titulo.linhaNotaF();
					System.out.print("\t\t\tLAIKA FAST LTDA. \n \t\t\tAV. PAULISTA, 2021 - SÃO PAULO - SP \n \t\t\tCNPJ: 94.753.745/0011-56");
					titulo.linhaNotaF();
					System.out.print("\t\t\t" + dataFormatado + "\n\t\t\tNOTA FISCAL");
					titulo.linhaNotaF();
					System.out.print("\t\t\tNOME:\t" + nome + "\t|\t\tCPF:\t" + cpf + "|\n");
					titulo.linhaNotaF();
					System.out.print("\t\t\tCÓDIGO\t\tPRODUTO\t\t\tVL. UNIT\t\t\tQTD.\n");
					titulo.linhaNotaF();
					b = 3;
					for (Produto item : carrinho) {
						System.out.println("\n\t\t\t"+item.getCodigo() + "\t\t" + item.getNome()+"\t\t\t"+ item.getValor() + "\t\t\t\t"+item.getEstoque());	
					}
					titulo.linhaNotaF();
					System.out.println("\n\t\t\tValor Total: " + valorTotal);

					titulo.linhaNotaF();
					titulo.linhaNotaF();
					System.out.printf("\t\t\tValor total da compra no crédito com 10%s de acrescimo R$ %.2f", "%",(valorTotal * 1.1));
					titulo.linhaNotaF();
					System.out.print(
							"\n\t\t                     AGRADECEMOS PELA PREFERÊNCIA! VOLTE SEMPRE!                                            ");
					titulo.linhaNotaF();
					a = false;

					break;

				case 3:

					leia.nextLine();
					System.out.print("\n▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅▅");
					titulo.linhaNotaF();
					System.out.print("\t\t\tLAIKA FAST LTDA. \n \t\t\tAV. PAULISTA, 2021 - SÃO PAULO - SP \n \t\t\tCNPJ: 94.753.745/0011-56");
					titulo.linhaNotaF();
					System.out.print("\t\t\t" + dataFormatado + "\n\t\t\tNOTA FISCAL");
					titulo.linhaNotaF();
					System.out.print("\t\t\tNOME:\t" + nome + "\t|\t\tCPF:\t" + cpf + "|\n");
					titulo.linhaNotaF();
					System.out.print("\t\t\tCÓDIGO\t\tPRODUTO\t\t\tVL. UNIT\t\t\tQTD.\n");
					titulo.linhaNotaF();
					b = 3;
					for (Produto item : carrinho) {
						System.out.println("\n\t\t\t"+item.getCodigo() + "\t\t" + item.getNome()+"\t\t\t"+ item.getValor() + "\t\t\t\t"+item.getEstoque());	
					}
					titulo.linhaNotaF();
					System.out.println("\n\t\t\tValor Total: " + valorTotal);

					titulo.linhaNotaF();
					System.out.printf("\t\t\t  Valor total da compra parcelada em duas vezes com 15%s de acrescimo R$ %.2f.\n\t\t\t  Valor total por parcelas: R$ %.2f",
							"%", (valorTotal * 1.15), (valorTotal * 0.575));
					titulo.linhaNotaF();
					System.out.print(
							"\n\t\t                     AGRADECEMOS PELA PREFERÊNCIA! VOLTE SEMPRE!                                            ");
					titulo.linhaNotaF();
					a = false;

					break;

				default:
					b = 1;
					System.out.print("\n\t\t\t⌦ Opção invalida tente novamente!");

				}

			for (Produto item : carrinho) {
				for (Produto prod : cadastro) {
					if (item.getCodigo().equals(prod.getCodigo())) {
						prod.tirarEstoque(item.getEstoque());
					}
				}
			}
			carrinho.clear();
			System.out.print("\n\n\t\t\tDeseja realizar outra compra?");
			a=false;
			respostaLoop = leia.next().toUpperCase().charAt(0);
		}
	}
}
