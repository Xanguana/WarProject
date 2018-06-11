package continentes;

import java.util.ArrayList;

import principal.Pais;

public class Europa extends Continente {
	
	public Europa(ArrayList<Pais> paises) {
		this.setNome("Europa");
		this.adicionaPaises(paises.get(8));
		this.adicionaPaises(paises.get(9));
		this.adicionaPaises(paises.get(10));
		this.adicionaPaises(paises.get(11));
	}

}
