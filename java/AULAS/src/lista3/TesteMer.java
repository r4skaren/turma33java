package lista3;

import java.util.ArrayList;
import java.util.List;

public class TesteMer {


	public static void main(String[] args) {
		System.out.println(combinacoes(6));
		
	}
	
	public static List<Integer> combinacoes(int maxDigit){
		
		List<Integer> listaComb = new ArrayList<Integer>();
		
		for(int x=1000; x<=9999; x++ ) {
			
			String[] combinacao =  new String[4];
			String num = Integer.toString(x);
			
			combinacao = num.split("");
			int soma= Integer.parseInt(combinacao[0])+
			Integer.parseInt(combinacao[1])+
			Integer.parseInt(combinacao[2])+
			Integer.parseInt(combinacao[3]);
			
			if(Integer.parseInt(combinacao[0]) <= maxDigit && Integer.parseInt(combinacao[1]) <= maxDigit && Integer.parseInt(combinacao[2]) <= maxDigit &&
					Integer.parseInt(combinacao[3]) <= maxDigit) {
				
				if(soma == 21) {
					listaComb.add(x);
				}
				
			}
			
			
		}
		
		return listaComb;
		
	}
}