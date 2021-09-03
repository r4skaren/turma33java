package exemplos;

import java.util.Scanner;

public class Para2 {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	double somaImpar = 0.00,x;
	
	for(x=0; x<=500; x++) {
		if((x%2)==1 && (x%3) ==0) {
			somaImpar = somaImpar+x;
			
			System.out.println(x);
		}
	}
	System.out.println(somaImpar);
	}

}
