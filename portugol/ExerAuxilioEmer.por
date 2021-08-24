programa
{
	funcao inicio()
	{
		escreva("Auxílio Emergencial\n")
		
	 //variaveis
	 inteiro status
	 cadeia nome

	 //entradas
	 escreva("Olá, digite seu nome: ")
	 leia(nome)
	 escreva("Você é o(a) Chefe da família?\n 1 - sim\n 2 - não\n")
	 leia(status)

	 //processamentos
		se (status == 1){
		escreva("Ok,",nome," por ser chefe da sua família você receberá R$1.200,00!")
		}

		se (status == 2){
		escreva("Ok,",nome," você receberá R$600,00!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 237; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */