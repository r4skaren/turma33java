programa
{
	
	funcao inicio()
	{
		cadeia times[4]
		caracter result
		inteiro pontos[4] = {0, 0, 0, 0}, x = 0, y = 0
		
	
		times[0] = "SPFC"
		times[1] = "SANTOS"
		times[2] = "PALMEIRAS"
		times[3] = "CORINTHIANS"

		para(y=1; y<4; y++){
			para(x=0; x<4; x++){
				escreva("Qual a pontuação do time ", times[x],"?\nEntre com: \nG - ganhou, P - Perdeu ou E - empatou: ")
				leia(result)
				escreva("\n")

				escolha(result){
					caso 'G':
						pontos[x] = pontos[x]+3
						pare
					caso 'P':
						pontos[x] = pontos[x]+0
						pare
					caso 'E':
						pontos[x] = pontos[x]+1
						pare					
			}}}
			para(x=0;x<4; x++){
				escreva(times[x]," totalizou : ", pontos[x] ," pontos.\n")
			}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 443; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */