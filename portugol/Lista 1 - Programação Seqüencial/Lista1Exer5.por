programa
{
	/* 5.Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
	 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
	 */
	 
	funcao inicio(){
	
	escreva("CALCULADORA DE MÉDIA FINAL\n")
	
	//variaveis
	real nota1,nota2,nota3,media

	//entradas
	escreva("Insira a nota de Sociologia do aluno:")
	leia(nota1)
	escreva("Insira a a nota de História do aluno:")
	leia(nota2)
	escreva("Insira a nota de Filosofia do aluno:")
	leia(nota3)

	//processamentos
	media = (nota1*2+nota2*3+nota3*5)/10

	//saidas
	escreva("A média final do aluno é: "+media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 15; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */