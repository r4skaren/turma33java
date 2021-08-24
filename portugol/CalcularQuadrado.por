programa
{
	/*
	 * 3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
	 */
	
	funcao inicio()
	{
		escreva("Calcular Quadrados\n")
		//variaveis
		real n1,n2,n3,n4, q1,q2,q3,q4
		//entradas
		escreva("Digite o número 1: ")
		leia(n1)
		escreva("Digite o número 2: ")
		leia(n2)
		escreva("Digite o número 3: ")
		leia(n3)
		escreva("Digite o número 4: ")
		leia(n4)
		//processaentos
			q1 = n1*n1
			q2 = n2*n2
			q3 = n3*n3
			q4 = n4*n4
		//saidas
		se(q3 >= 1000){
			escreva("O valor do quadrado de ",n3," é de: ", q3)
		}
		senao {
		escreva("O valor do quadrado de ",n1," é de: ",q1)
		escreva("\nO valor do quadrado de ",n2," é de: ",q2)
		escreva("\nO valor do quadrado de ",n3," é de: ",q3)
		escreva("\nO valor do quadrado de ",n4," é de: ",q4)
			}
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 303; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */