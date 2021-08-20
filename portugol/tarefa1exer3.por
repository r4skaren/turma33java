//programa
programa
{
	/*
	 * Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
	 * expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
	 */
	 
	funcao inicio()
	{

	//variaveis
	
	inteiro horas, minutos , tempoDuracaoEventoSegundos, seg
	
	//entradas
	escreva("Informe o tempo de duração do evento em segundos:")
	leia(tempoDuracaoEventoSegundos)
	
	//processamentos
	
	horas = (tempoDuracaoEventoSegundos/ 3600)
	minutos = ((tempoDuracaoEventoSegundos % 3600) / 60)
	seg = ((tempoDuracaoEventoSegundos % 3600) % 60)
		
	//saidas
	escreva("A duração do evento foi de "+ horas +" horas "+minutos+ " minutos e "+seg+ " segundos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 328; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */