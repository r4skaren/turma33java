package exemplos;

public class Carro {

	public boolean ligado;
	public boolean radio;
	public String cor;
	public int anoLascamento;
	
		//metodo
		public boolean ligado() {
			return ligado = true;
		}
		
		public boolean desligado(){
			return ligado = false;
		}
		
		//sobrecarga de metodo
		public void ouvirRadio() {
					System.out.print(radio = true);
		}
		public void naoOuvirRadio(int anoAtual) {
			System.out.print(radio = false);
		}

}
