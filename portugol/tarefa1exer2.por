programa
{
	
	funcao inicio()
	{
/*
 * Faça um sistema que leia a idade de uma pessoa expressa em dias 
 * e mostre-a expressa em anos, meses e dias. 
 */
 		//variaveis
		inteiro idade,mes,dias,diasNascimento

		//entradas
		escreva("Quantos dias de vida você tem? ")
		leia(diasNascimento)

		
		//processamentos
		idade = diasNascimento/365  //você tem dias de vida e os divide por ano
		mes = (diasNascimento%365)/30
		dias = (diasNascimento%365)%30

		//saidas
		escreva("Sua idade é "+idade+", você nasceus no mês "+mes+" no dia "+dias)
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 158; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */