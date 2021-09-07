programa
{
	inclua biblioteca Matematica --> mat
	/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos 
	 * (aplicados ao custo de fábrica). 
	 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
	 * escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
	 * 
	 */
	
	funcao inicio()
	{
		escreva("Calcular o custo para o consumidor\n")
		//variaveis
		real custoFabrica,custoConsumidor
		
		//entradas
		escreva("\nEntre com o valor referente ao custo de fábrica: ")
		leia(custoFabrica)
		
		//processamentos
		custoFabrica = custoFabrica *(1 +0.28+0.45)
		custoConsumidor = custoFabrica
		
		//saidas
		escreva("\nO custo ao consumidor de um carro com: \n◾ Percentagem do distribuidor de 28% \n◾ Impostos de 45% \n\nApresenta um valor de: R$ ",mat.arredondar(custoFabrica, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 489; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */