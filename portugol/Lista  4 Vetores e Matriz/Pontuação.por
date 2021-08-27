programa
/*
 * Faça um programa que crie um vetor por leitura com 
 * 5 valores de pontuação de uma atividade e o escreva em seguida. 
 * Encontre após a maior pontuação e a apresente. 
 */
{
	
	funcao inicio()
	{
		//variaveis  // 0 - 4
		real maiorNota = 0.00, pontuacaoAtividade[5]


		para (inteiro x=0; x<5;x++){
			escreva("Avaliação de 1 a 10\n")
			escreva(x+1,"° "+"digite aqui:")
			leia(pontuacaoAtividade[x])
			escreva("\n")
		}
		escreva ("\nA pontuação é: ")
		para (inteiro x=0; x<5;x++){
			escreva(" ",pontuacaoAtividade[x]," | ")
		}
		para (inteiro x=0; x<5;x++){
			se (maiorNota < pontuacaoAtividade[x])
				maiorNota = pontuacaoAtividade[x]	
		}
		escreva("\nA maior nota é ",maiorNota)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 656; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */