package continentes;

import java.util.ArrayList;
import principal.Pais;

/**
 * 
 * @author aline e leandro
 *
 */

public class Continente {
	
	private String nome;
	private ArrayList<Pais> paises = new ArrayList<>();
	
	
	public void ganhaMilitares() {
		
	}
	
	public void adicionaPaises(Pais pais) {
		this.paises.add(pais);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Pais> getPaises() {
		return paises;
	}
	public void setPaises(ArrayList<Pais> paises) {
		this.paises = paises;
	}
}
