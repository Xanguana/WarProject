package jogador;

import java.util.Random;

public class Dados {

	Random gerador = new Random();	

	public int jogar_dado() {
		return gerador.nextInt(6);
	}
}
