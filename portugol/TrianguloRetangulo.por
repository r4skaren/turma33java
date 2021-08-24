programa
{
	/*
	*7) Receber valores de base e altura de um triângulo e verificar se são valores válidos 
	*(positivos maiores que zero). 
	*Em caso afirmativo, calcular a área do triângulo.
	 */
	 
	funcao inicio()
	{
		escreva("Calculadora de Área de Triângulo\n")
		//variaveis
			real base, altura, triangulo
			
		//entradas
		escreva ("Digite o valor da altura do triângulo em centímetros: ")
		leia (altura)
		escreva ("Digite o valor da base do triângulo em centímetros: ")
		leia (base)

		//processamentos//saidas
		se (base <= 0){
			escreva ("Impossível realizar. Valor da base incorreto!")
		}
		senao se (altura <= 0){
			escreva ("Impossível realizar. Valor da altura incorreto!")
		}
		senao {
		triangulo = (altura * base) / 2
		escreva ("O valor da área do triângulo é de: ", triangulo , " cm²")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 214; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */