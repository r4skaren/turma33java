programa
{
	inclua biblioteca Texto --> txt
	inclua biblioteca Matematica --> mat

    funcao inicio()
    {
    	// Declaração de Vetores
    	inteiro estoque[10] = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10} 
    	caracter resposta
    	faca{
    	cadeia titulo[4] = {"  COD",  "PRODUTO\t", "VALOR R$", "ESTOQUE"}
    	cadeia codigo[10] = {"G4-1","G4-2","G4-3","G4-4","G4-5","G4-6","G4-7","G4-8","G4-9","G4-10"} 
     cadeia produtos[10] = {"Ração","Shampoo","Fralda","Remédio","Colônia","Alicate","Escova","Bola","Casinha","Caminha"}
     real valor[10] = {95.0,90.0,40.0,95.0,90.0,50.0,10.0,90.0,70.0,79.0}
     inteiro carrinhoQuantidade[10]
   	inteiro carrinho[10]
   	cadeia carrinhoCod[10]
   	real valorCod[10]
   	inteiro endereco[10]
     // Declaração de Variáveis
     //caracter resposta
     cadeia codProduto, nome, cpf
     inteiro linha = 0, quantidade = 0, contador=0, enderecoCarrinho =0
     real valorCompra = 0.00
     caracter resposta2
     inteiro numero
     inteiro a=2, b=1
     
	

	// Imprimimir Títulos
	limpa()
	escreva("\n◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾\n")
     escreva("\n\t\t\t\t   LAIKA FAST\n")
     escreva("\n◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾\n")
     escreva("\n\t\t\tUma experiência de viagem a lua!\n")

	//Início das compras
     escreva("\n\n▶ DESEJA FAZER COMPRAS S/N? ") 
     leia(resposta)

	// Caso "resposta = S": Inicia compras
     se(resposta == 's' ou resposta =='S' ) {
     	// Imprime titulo para tabela de produtos
     	limpa()
     	escreva("\n◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾\n")
     	escreva("\nRelação de Produtos\n\n")
     	escreva("\n________________________________________________________\n\n")
     	para(inteiro x=0;x<4;x++) {
          	escreva(titulo[x],"\t")
        	}
        	escreva("\n________________________________________________________\n")
     	escreva("\n")

          // Imprime tabela de produtos
          para(inteiro x=0;x<10;x++) {
          	escreva("| ",codigo[x],"\t", produtos[x],"\t\t","R$ ",valor[x],"\t\t", estoque[x],"             |\n")
          }
          escreva("\n________________________________________________________\n")

          faca{
          	
          	escreva("\n▶ Digite o código do produto: ")
          	leia(codProduto)
          	codProduto = txt.caixa_alta(codProduto)

          	          	
			contador++
			
			
			

          		enquanto(codProduto != "G4-1" e codProduto != "G4-2" e codProduto != "G4-3" e codProduto != "G4-4" e codProduto != "G4-5" e codProduto != "G4-6" e codProduto != "G4-8" e codProduto != "G4-9" e codProduto != "G4-10"){
          		escreva("\nCódigo Inválido, verifique e digite novamente:  ")
          		leia(codProduto)
          		codProduto = txt.caixa_alta(codProduto)
          	
           	}
          	
			
          	para(inteiro x=0;x<10; x++){
          		se(codProduto == codigo[x]){
          			linha = x
          			
          			se (endereco[x] != 0){
          				para(inteiro y=0;y<contador; y++){
          					se(codProduto == carrinhoCod[y]){
          						enderecoCarrinho = y	
          					}			
          				}

          				escreva("▶ Produto já adicionado, digite a nova quantidade: ")
          				leia(quantidade) 
          				  
          				enquanto(quantidade > estoque[enderecoCarrinho] ou quantidade<=0){
                  				escreva("\nQuantidade indisponível, verifique e tente novamente: ")
                  			     
          					leia(quantidade) 	
                			}  				
          				 
          				valorCod[x]= (valor[linha] * quantidade)
          				valorCompra += (valor[linha] * (quantidade - carrinhoQuantidade[enderecoCarrinho]))
          				
          				carrinhoQuantidade[enderecoCarrinho] = quantidade
          				contador--
          				}senao{	
          											
          				escreva("\n▶ Digite a quantidade: ")
          				leia(quantidade)
          				

                  		enquanto(quantidade > estoque[enderecoCarrinho] ou quantidade<=0){
                  			escreva("\nQuantidade indisponíveL, verifique e tente novamente.")
                  			escreva("\n▶ Digite a quantidade: ")
          				leia(quantidade)
                  }
          				para (inteiro r=contador-1;r<contador;r++){
          					carrinho[r]=linha
          					carrinhoQuantidade[r] = quantidade
          					carrinhoCod[r]=codigo[x]
          				
          					valorCompra += (valor[linha] * quantidade)
          					valorCod[r]= (valor[linha] * quantidade)
          					
          				}
          			}endereco[x] =quantidade
          		}
          	}
  
          	escreva("\n◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻◾◻")
          	escreva("\n\n\n\t\t\t   CARRINHO DE COMPRAS\n\n")
          	escreva("_________________________________________________________________________________\n\n")
          	para (inteiro h=0;h<contador; h++){       		
          		escreva("\nCod.",codigo[carrinho[h]],"\t","Produto:",produtos[carrinho[h]],"\t\t","Valor: ","R$ ",valor[carrinho[h]])
          		escreva(+"\t\t","Em estoque:",estoque[carrinho[h]])
          		escreva("\n\n▶ Quantidade selecionada: ", carrinhoQuantidade[h],"\n")
          	}	
          	escreva("\n_________________________________________________________________________________")			
			escreva("\n\nValor da compra R$ ",valorCompra)
          	escreva("\n_________________________________________________________________________________")	
          		
          	escreva("\n\n▶ Deseja continuar? ")
          	leia(resposta)
          	
			enquanto(resposta != 'N' e resposta != 'n' e resposta != 'S' e resposta != 's'){
				escreva("\nOpção Inválida, verifique e digite novamente:  ")
				leia(resposta)
			}
			
          	se(resposta == 'N' ou resposta == 'n') {
          	escreva("\n▶ Deseja alterar a compra? ")
          	leia(resposta)
         		}
         		enquanto(resposta != 'N' e resposta != 'n' e resposta != 'S' e resposta != 's'){
				escreva("\nOpção Inválida, verifique e digite novamente:  ")
				leia(resposta)
			}
          	
          } enquanto(resposta == 'S' ou resposta == 's')

          para (inteiro x=0;x<10;x++){
          	estoque[x] = estoque[x] -endereco[x]
          }

		faca{
			escreva("\n________________________________________________________________________________\n")
			escreva("\n\t\t\t\t   LAIKA FAST\n")
			escreva("\n________________________________________________________________________________\n")
			escreva("\n|Valor total da compra: R$ ",valorCompra,", 9% de imposto sob o valor corresponde a R$",mat.arredondar((valorCompra * 0.09),2),"|")
			escreva("\n________________________________________________________________________________\n")
			escreva("\n\n▶ Qual seu nome? ")
			leia(nome)
			
			escreva("\n\n▶ Qual seu CPF? ")
			leia(cpf)
			escreva("\n\n|OPÇÕES DE PAGAMENTO|\n______________________________________________________")
			escreva("\n\nTemos 3 opções para pagamento:                          |\n________________________________________________________|")
			escreva(+"\n\nDigite 1 para comprar a vista, com desconto de 10%.     |")
			escreva(+"\nDigite 2 para comprar no crédito com acrescimo de 10%.  |")
			escreva("\nDigite 3 para parcelar em 2 vezes com acrescimo de 15%. |")
			escreva("\n________________________________________________________\n")
			escreva(+"\n\n▶ Digite aqui:")
			leia(numero)
			
			escolha(numero) {
				
				caso 1:
				b = 1
				escreva("\n\n______________________________________________________________________________________________________________\n") 
				escreva("\t\t\tLAIKA FAST")
          		escreva("\n\n______________________________________________________________________________________________________________\n") 
				escreva("\t\t\t\t\t\tNOTA FISCAL")
				escreva("\n______________________________________________________________________________________________________________\n")
				escreva("\t\t\tNOME:\t",nome,"\t|\tCPF:\t",cpf,"|\n")
				escreva("______________________________________________________________________________________________________________\n")
				escreva("\t\t\tCÓDIGO\tPRODUTO\t\tVALOR\t\tQUANTIDADE\n")
				escreva("______________________________________________________________________________________________________________\n")
				
				
				para (inteiro h=0;h<contador; h++){         		
          		escreva("\t\t\t",codigo[carrinho[h]],"\t", produtos[carrinho[h]],"\t\t","R$ ",valor[carrinho[h]], "\t\t"," x ", carrinhoQuantidade[h], "\n")
          	}
          		escreva("\n______________________________________________________________________________________________________________\n")
          		escreva("\t                   Valor total da compra a vista com 10% de desconto:  R$ ",mat.arredondar((valorCompra * 0.9), 2))
          		escreva("\n______________________________________________________________________________________________________________\n")
          		escreva("\n\t                        AGRADECEMOS PELA PREFERÊNCIA! VOLTE SEMPRE!                                            \n")
          		escreva("\n______________________________________________________________________________________________________________\n")
          		pare
	
				caso 2:
				escreva("\n\n______________________________________________________________________________________________________________\n") 
				escreva("\t\t\tLAIKA FAST")
          		escreva("\n\n______________________________________________________________________________________________________________\n") 
				escreva("\t\t\t\t\t\tNOTA FISCAL")
				escreva("\n______________________________________________________________________________________________________________\n")
				escreva("\t\t\tNOME:\t",nome,"\t|\tCPF:\t",cpf,"|\n")
				escreva("______________________________________________________________________________________________________________\n")
				escreva("\t\t\tCÓDIGO\tPRODUTO\t\tVALOR\t\tQUANTIDADE\n")
				escreva("______________________________________________________________________________________________________________\n")
				
				 
				b = 1
				
				para (inteiro h=0;h<contador; h++){         		
          		escreva("\t\t\t",codigo[carrinho[h]],"\t", produtos[carrinho[h]],"\t\t","R$ ",valor[carrinho[h]], "\t\t"," x ", carrinhoQuantidade[h], "\n")
          	}
          		escreva("______________________________________________________________________________________________________________\n")
          		escreva("\t                   Valor total da compra no credito com 10% de acrescimo R$",mat.arredondar((valorCompra * 1.1),2))
          		escreva("\n______________________________________________________________________________________________________________\n")
          		escreva("\n\t                        AGRADECEMOS PELA PREFERÊNCIA! VOLTE SEMPRE!                                            \n")
          		escreva("\n______________________________________________________________________________________________________________\n")
          		pare

          		caso 3:
          		escreva("\n\n______________________________________________________________________________________________________________\n") 
				escreva("\t\t\tLAIKA FAST")
          		escreva("\n\n______________________________________________________________________________________________________________\n") 
				escreva("\t\t\t\t\t\tNOTA FISCAL")
				escreva("\n______________________________________________________________________________________________________________\n")
				escreva("\t\t\tNOME:\t",nome,"\t|\tCPF:\t",cpf,"|\n")
				escreva("______________________________________________________________________________________________________________\n")
				escreva("\t\t\tCÓDIGO\tPRODUTO\t\tVALOR\t\tQUANTIDADE\n")
				escreva("______________________________________________________________________________________________________________\n")
				
				b = 1
				
				para (inteiro h=0;h<contador; h++){         		
          		escreva("\t\t\t",codigo[carrinho[h]],"\t", produtos[carrinho[h]],"\t\t","R$ ",valor[carrinho[h]], "\t\t"," x ", carrinhoQuantidade[h], "\n")
          	}
          		escreva("______________________________________________________________________________________________________________\n")
          		escreva("\t                   Valor total da compra parcelado com 15% de acrescimo ",mat.arredondar((valorCompra * 1.15), 2)," com as duas parcelas no valor de: R$ ",valorCompra * 0.575)
          		escreva("\n______________________________________________________________________________________________________________\n")
          		escreva("\n\t                        AGRADECEMOS PELA PREFERÊNCIA! VOLTE SEMPRE!                                            \n")
          		escreva("\n______________________________________________________________________________________________________________\n")
          		pare
          		caso contrario: b = 3
          		escreva("\nOpção invalida tente novamente!")
          		
			}

		}enquanto(a<b) 
     } senao{
     	escreva("\nAté breve!! ")
       }escreva("\n▶ Deseja comprar novamente? ")
       leia (resposta)
       enquanto(resposta != 'N' e resposta != 'n' e resposta != 'S' e resposta != 's'){
				escreva("\nOpção Inválida, verifique e digite novemente:  ")
				leia(resposta)
			}
    	}enquanto(resposta=='s' ou resposta=='S')
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 5837; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {estoque, 9, 13, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */