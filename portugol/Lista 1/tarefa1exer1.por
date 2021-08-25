programa
{
	
	funcao inicio()
	{
		//variaveis
		inteiro meses, anos, dias, idade

		//entradas
		escreva("Quantos anos voce tem? ")
		leia(anos)
		escreva("Em qual mes você nasceu? ")
		leia(meses)
		escreva("Em qual dia? ")
		leia(dias)

		//idade em dias 1 ano 1*30 + 1 = 365+30+1=396
		
		//processamentos
		idade = (anos *365)+(meses*30)+dias

		//saidas
		escreva("Minha idade aproximadamente é " +idade +"dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 64; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */