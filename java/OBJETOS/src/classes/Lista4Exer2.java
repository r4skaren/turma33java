package classes;


public class Lista4Exer2 {

		
		public String companhia;
		public boolean decolando;
		public boolean tremDePouso;
		public int velocidade;
		
		public void abaixarTremDePouso() {
			System.out.printf("O avião da %s está abaixando o trem de pouso..\n",this.companhia);
			this.tremDePouso = true;
		}
		
		public void levantarTremDePouso() {
			System.out.printf("O avião da %s está levantando o trem de pouso..\n",this.companhia);
			this.tremDePouso = false;
		}
		
		public void decolar() {
			System.out.printf("O avião da %s está decolando..\n",this.companhia);
			this.decolando = true;
			levantarTremDePouso();
		}
		
		public void pousar() {
			System.out.printf("O avião da %s está pousando..\n",this.companhia);
			this.decolando = false;
			abaixarTremDePouso();
		}
		
		public void aumentarVelocidade() {
			System.out.printf("O avião da %s está aumentando a velocidade..\n",this.companhia);
			this.velocidade ++;
			
			if(this.velocidade == 6) {
				decolar();
			}
		}
		
		public void diminuirVelocidade() {
			System.out.printf("O avião da %s está diminuindo a velocidade..\n",this.companhia);
			this.velocidade --;
			
			if(this.velocidade == 5) {
				pousar();
			}
		}
		
	}
