package continentes;

import java.util.ArrayList;

import principal.Pais;

public class America_do_norte extends Continente {
	
	public America_do_norte(ArrayList<Pais> paises) {
		this.setNome("America do Norte");
		this.adicionaPaises(paises.get(4));
		this.adicionaPaises(paises.get(5));
		this.adicionaPaises(paises.get(6));
		this.adicionaPaises(paises.get(7));
	}

}
