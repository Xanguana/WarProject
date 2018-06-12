package continentes;

import java.util.ArrayList;

import principal.Pais;

public class America_do_sul extends Continente {

	public America_do_sul(ArrayList<Pais> paises) {
		
		this.setNome("America do Sul");
		this.adicionaPaises(paises.get(0));
		this.adicionaPaises(paises.get(1));
		this.adicionaPaises(paises.get(2));
		this.adicionaPaises(paises.get(3));
	}
	
}
