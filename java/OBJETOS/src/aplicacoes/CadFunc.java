package aplicacoes;

import classes.Funcionario;
import classes.Terceiro;

public class CadFunc {

	public static void main(String[] args) {
		
		Funcionario colaborador1 = new Funcionario ("001", 30, 50.0, "La");
		Terceiro colaborador2 = new Terceiro("023","CARLA",50);
		
		System.out.println(colaborador1);
	}

}
