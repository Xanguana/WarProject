package principal;


public class Cor {

	private String nome_cor;
	private boolean usado;
	
	public Cor(String nome, boolean usado) {
		this.nome_cor = nome;
		this.usado = usado;
	}

	public String getNome_cor() {
		return nome_cor;
	}

	public void setNome_cor(String nome_cor) {
		this.nome_cor = nome_cor;
	}

	public boolean isUsado() {
		return usado;
	}

	public void setUsado(boolean usado) {
		this.usado = usado;
	}
}
