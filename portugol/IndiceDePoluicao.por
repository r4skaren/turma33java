programa
{
	/*
	*5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias que são altamente poluentes do 
	*meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe p
	*ara 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades, se o índice cresc
	*er para 0,4 as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, se o índice 
	*atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. Faça um sistema que l
	*eia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.
	*
	 */
	
	funcao inicio()
	{
		//variaveis
		real indiceP
		//entradas
		escreva("Digite o índice de poluição: ")
		leia(indiceP)
		//processamentos//saidas
		se (indiceP >= 0.3 e indiceP < 0.4){
			escreva("Índice de poluição acima de 0,3 e menor que 0,4.")
			escreva("\nSuspender as atividades das empresas do grupo 1")
		
		}
		senao se (indiceP >= 0.4 e indiceP < 0.5){
			escreva("Índice de poluição acima de 0,4 e menor que 0,5.")
			escreva("\nSuspender as atividades das empresas do grupo 1 e 2")
		
		}
		senao se (indiceP >= 0.5){
			escreva("Índice de poluição acima de 0,5")
			escreva("\nSuspender as atividades das empresas do grupo 1, 2 e 3.")
		
		}
		senao{
			escreva("Índice menor que 0,3. Todas as empresas podem continuar!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1014; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */