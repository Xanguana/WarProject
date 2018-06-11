package continentes;

import java.util.ArrayList;

import principal.Pais;

public class Africa extends Continente{
	
	public Africa(ArrayList<Pais> paises) {
		this.setNome("Africa");
		this.adicionaPaises(paises.get(12));
		this.adicionaPaises(paises.get(13));
		this.adicionaPaises(paises.get(14));
		this.adicionaPaises(paises.get(15));
	}
	

}
