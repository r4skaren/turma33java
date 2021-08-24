programa
{
	/*
	 * 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando 
	 * se este número é par ou ímpar, e se é positivo ou negativo.
	 */
	
	funcao inicio()
	{
	escreva("Sistema Impar ou Par\n")
		//variaveis
		inteiro numero
		
		//entradas
		escreva("Digite um número: ")
		leia(numero)
		
		//processamentos//saidas
		se (numero == 0){
			escreva(numero,"é neutro!")
		}
		senao se(numero < 0 e numero % 2 == 0){
			escreva(numero,"é par e negativo.")
		}
		senao se(numero % 2 == 0){
			escreva(numero,"é par e positivo.")
		}
		senao se(numero % 2 == 1){
			escreva(numero,"é impar e positivo.")
		}
		senao {
			escreva(numero,"é impar e negativo.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 224; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */