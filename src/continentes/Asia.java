package continentes;

import java.util.ArrayList;

import principal.Pais;

public class Asia extends Continente {

	public Asia(ArrayList<Pais> paises) {
		this.setNome("Asia");
		this.adicionaPaises(paises.get(16));
		this.adicionaPaises(paises.get(17));
		this.adicionaPaises(paises.get(18));
		this.adicionaPaises(paises.get(19));
	}
}
