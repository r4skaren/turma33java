programa
{
	
	funcao inicio()
	{
	    cadeia nome
	    caracter pronome
         real nota, media, somaNotas = 0
         
         escreva("Digite seu nome: ")
         leia(nome)
         escreva("Como prefere ser chamade (A/O/U)? ")
         leia(pronome)
         
         para(inteiro x = 1; x <= 5; x++){
         		escreva("Digite uma nota: ")
         		leia(nota)
         
			somaNotas = somaNotas + nota
		}
		
		media = (somaNotas / 5)
		se (media < 5.00){
			escreva("Olá,"+nome+" sua média é: " + media+" você está recuparad"+pronome+" em notas!")	
		}
		senao se (media >= 5.00){
			escreva("Olá,"+nome+" sua média é: " + media+" você está aprovad"+pronome+"!")	
		}
		
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 448; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */