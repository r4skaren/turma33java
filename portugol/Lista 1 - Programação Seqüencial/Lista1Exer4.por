programa
{
	inclua biblioteca Matematica
	/*4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) 
	e calcule a seguinte expressão:
	*/
	
	funcao inicio()
	{
		escreva("Sistema de Potenciação\n")
		//variaveis
		inteiro A,B,C,D,R,S

		//entradas
		escreva("\nDigite o número referente a A: ")
		leia(A)
		escreva("Digite o número referente a B: ")
		leia(B)
		escreva("Digite o número referente a C: ")
		leia(C)

		//processamentos
		R = (A+B)*(A+B)
		S = (B+C)*(B+C) 
		
		D = R+S/2

		//saidas
		escreva("\nO valor total da expressão é: ",D)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 394; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */