programa
{
	/* 3. Escreve um programa que lê duas matrizes N1 (4,6) e N2 (4,6) e cria:
	a) Uma matriz M1 separa os elementos como somas dos elementos de mesma posição
	das matrizes N1 e N2;
	b) Uma matriz M2 são considerados elementos como diferenças dos elementos de mesma
	posição das matrizes N1 e N2. 
 	*/
 	
	funcao inicio ()
	{
		inteiro n1 [4][6], n2[4][6], m1[4][6], m2[4][6]

		//leia n1
		para (inteiro x = 0; x <4; x ++) {
			para (inteiro y = 0; y <6; y ++) {
				escreva("\nDígite o valor da matriz N1 na linha ",x, " e o valor da coluna ",y)
				escreva(+" respectivamente.")
				leia (n1[x][y])
			}
		}
		//leia n2
		para (inteiro x = 0; x <4; x ++) {
			para (inteiro y = 0; y <6; y ++) {
				escreva("\nDígite o valor da matriz N2 na linha ", x, "e o valor da coluna ", y)
				escreva(+" respectivamente.")
				leia (n2[x][y])
			}
		}
		//matriz M1
		para (inteiro x = 0; x <4; x ++) {
			para (inteiro y = 0; y <6; y ++) {
				m1 [x] [y] = n1 [x] [y] + n2 [x] [y]
			}
		}
		//matriz M2
		para (inteiro x = 0; x <4; x ++) {
			para (inteiro y = 0; y <6; y ++) {
				se (n1 [x][y]> n2 [x][y]) {
					m2 [x][y] = n1 [x][y] -n2 [x][y]
				}
				senao {
					m2 [x][y] = n2 [x][y] -n1 [x][y]
				}
			}
		}
		//das saidas
		escreva ("\nA matriz M1 é:")
		para (inteiro x = 0; x <4; x ++) {
			escreva("\n")
			
			para (inteiro y = 0; y <6; y ++) {
				escreva (m1 [x][y], "\t")
				escreva("\n")								
			}
		}
		escreva ("\nA matriz M2 é:")
		para (inteiro x = 0; x <4; x ++) {
			escreva("\n")
			para (inteiro y = 0; y <6; y ++) {
				escreva(m2 [x][y], "\t")							
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 434; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */