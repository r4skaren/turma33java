programa
{
	inclua biblioteca Matematica
/*
 * 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, 
 * coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
	a) média do salário da população; 
	b) média do número de filhos; 
	c) maior salário;
	d) percentual de pessoas com salário até R$100,00. 
 */
	
	funcao inicio()
	{
		escreva("Sistema de Pesquisa dos Habitantes da Cidade\n")
		//variaveis
		const inteiro HABITANTES = 2
		inteiro numeroFilhos
         	real totalFilhos = 0.00, mediaNumeroFilhos= 0.00
		real salario = 0.00, mediaSalario, maiorSalario = 0.00, totalSalarios = 0.00
		real quantosAcima100 = 0.00, percentualAcima100 = 0.0
		

		//entradas processamentos
	para (inteiro x=1; x<= HABITANTES; x++){
		escreva("\nDigite o valor do salário du habitante ",x,":")
		leia(salario) 
		escreva("Digite a quantidade de filhos du habitante ",x,":")
		leia(numeroFilhos)

		
		totalSalarios = totalSalarios + salario
		totalFilhos = totalFilhos + numeroFilhos
		
		se (salario > maiorSalario){
				maiorSalario = salario
		}
		//percentual de pessoas com salário até R$100,00	
			se (salario <= 100.00){
				quantosAcima100 = quantosAcima100 +1
				
		}
	}
		//media de Salario
			mediaSalario = salario/HABITANTES
			escreva("\nA média de salário por habitantes foi de R$ ",mediaSalario)
			
			
		//media numero de filhos
			mediaNumeroFilhos = totalFilhos / HABITANTES
			escreva("\nA média de filhos por habitantes é: ",totalFilhos)
			
		//maior salario
			escreva("\nO Maior salario por habitantes é: R$ "+maiorSalario)
			
		//percentual acima de 100
			percentualAcima100 = (quantosAcima100/HABITANTES) * 100.00
			escreva("\nPercentual de pessoas com salário até R$100,00: ")
			escreva(+Matematica.arredondar(percentualAcima100,2) + "%")	
							
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1823; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */