package principal;

/**
 * 
 * @author Aline e Leandro
 * 
 * Classe para definir as cores do jogo, no qual já é pre-definido os tipos de cores que poderá ser escolhido pelo Jogador
 * no ínicio do jogo, dando a ele as opções.
 *
 */

public class Cor {
	
	private String nome_cor;
	private boolean usado;
	
	/**
	 * @param nome - utilizado para definir nomes das cores
	 * @param usado - define se a cor ja foi ou não usada por um jogador
	 */
	
	public Cor(String nome, boolean usado) {
		this.nome_cor = nome;
		this.usado = usado;
	}
	
	//gets e sets

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
