programa
{
	/*
	*8) Construa um sistema para ler uma variável numérica N e imprimi-la somente 
	*se a mesma for maior que 100, caso contrário imprimi-la com o valor zero.
	 */
	 
	funcao inicio()
	{
		escreva("Sistema N\n")
		
		//variaveis
		real n

		//entradas
		escreva("Digite o valor de N: ")
		leia(n)

		//processamentos//saidas
		se (n > 100){
			escreva("Logo N é igual a =",n)
			}
		
		senao{
			n = 0
			escreva("Logo N é igual a = ",n)
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 206; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */