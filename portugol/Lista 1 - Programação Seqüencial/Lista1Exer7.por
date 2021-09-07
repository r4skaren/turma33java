programa
{
	inclua biblioteca Matematica --> mat
	/*7. Um sistema de equações lineares do tipo: 
	, pode ser resolvido segundo mostrado abaixo : 
 	Escreva um sistema que lê os coeficientes a,b,c,d,e e f 
 	e calcula e mostra os valores de x e y. 
	 */
	
	funcao inicio()
	{
	
		//variaveis
		real a,b,c,d,em,f,x,y
		
		//entradas
		escreva("Digite o valor de A: ")
		leia(a)
		escreva("Digite o valor de B: ")
		leia(b)
		escreva("Digite o valor de C: ")
		leia(c)
		escreva("Digite o valor de D: ")
		leia(d)
		escreva("Digite o valor de E: ")
		leia(em)
		escreva("Digite o valor de F: ")
		leia(f)
		
		//processamentos
		x = ((c*em)-(b*f))/((a*em)-(b*d))
		y = ((a*f)-(c*d))/((a*em)-(b*d))
		
		//saidas
		escreva("\nO valor de X é: ",mat.arredondar(x, 2),"\nJá o valor de Y é: ",mat.arredondar(y, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 248; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */