package continentes;

import java.util.ArrayList;

import principal.Pais;

public class Oceania extends Continente {
	
	public Oceania(ArrayList<Pais> paises) {
		this.setNome("Oceania");
		this.adicionaPaises(paises.get(20));
		this.adicionaPaises(paises.get(21));
		this.adicionaPaises(paises.get(22));
		this.adicionaPaises(paises.get(23));
	}

}
