programa
{
	/*
	*2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
	*E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
	*Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável 
	*E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
	*No final do processamento imprimir o salário total e o salário excedente.
	*
	 */
	funcao inicio()
	{
		escreva("Calculadora de Salário\n")
		//variaveis
		real codigo,numeroHorasTrabalhadas, horaLimite, salario, excesso
		
		//entradas
		escreva("\nOlá, digite o seu código de identificação: ")
	 	leia(codigo)
	 	escreva("Olá, digite o número de horas trabalhadas: ")
	 	leia(numeroHorasTrabalhadas)
	 	
		//processamentos//saidas
		horaLimite = 50
		excesso = numeroHorasTrabalhadas - horaLimite
		salario = 10+excesso
		
		se (numeroHorasTrabalhadas > 50){
		escreva("Há um excesso de horas trabalhadas, você receberá ",excesso*20)
			//
			escreva("\nSeu salário total foi de: R$ ",salario,"\n")
			escreva("Já o salário excedente total de: R$ ",excesso*20)
		}

		se (numeroHorasTrabalhadas <= 50){
		escreva("Não há excessos, logo sem acrescimos.\n")
			//
			escreva("Seu salário total foi de: R$ ",salario,"\n")
			escreva("Já o salário excedente total de: R$ ",excesso)
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1157; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */