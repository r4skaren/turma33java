programa
{
/*
 * 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e 
 * apresente no final o total do somatório, a média e o total de valores lidos. 
 * O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
 * Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
 */
	
	funcao inicio()
	{
		real somatorio = 0.00, media, total = 0.00, numero = 0.00

		enquanto (numero >= 0) {
			escreva("Digite o número a ser somado: ")
			leia(numero)
			
			se (numero == 0){
				pare
			}
			somatorio = somatorio + numero
            	total = total + 1
			}
		escreva("A somatória dos números digitados é de: ",somatorio)
        	media = somatorio / total
        	escreva("\nA média dos valores digitados é de: ", media)
        	escreva("\nO total de números digitados é de: ", total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 326; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */