package classes;

public class Lista4Exer3 {

	//atributos de objeto>
		public String marca;
		public String cor;
		public boolean ligado;
		
	//atributos de classe>
		public int bateriaFone;
		public int bateriaCelular1;
 
	
	//celular ligado, desligado
	public boolean celuLigado() {
		System.out.println("Seu celular está ligado.");
		ligado = true;
		return ligado;
	}
	public boolean celuDesligado() {
		System.out.println("Seu celular está desligado.");
		ligado = false;
		return ligado;
	}
	
	//fone 
	public void bateriaFone() {
		if(bateriaFone <= 15) {
			System.out.println("Bateria está descarregando!!");
		}
		
		else if (bateriaFone == 0) {
			System.out.println("Bateria descarregada!");
		}			
	}
	
	
	//celu
	public int bateriaCelular() {
		
		if(this.bateriaCelular1 == 100) {
			System.out.println("Seu celular está carregado. Retire da tomada!");
		}	
		else if (this.bateriaCelular1 == 0) {
			System.out.println("Bateria descarregada!...Desligando.");
		}
		else if (this.bateriaCelular1 < 100 && bateriaCelular1 > 15 ) {
			System.out.println("Bateria estável.");
		}
		else if(this.bateriaCelular1 <= 15) {
			System.out.println("Celular descarregando.");
		}
		else {
			System.out.println("Ops! Não identificado.");
		}
		return bateriaCelular1;
	}
}
