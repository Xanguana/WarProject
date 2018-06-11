package militares;

public class Militar {
	
	private String tipo;
	private int pontos;
	private int quantidade;
	

	public Militar(String tipo, int pts, int quantidade) {
		this.tipo = tipo;
		this.pontos = pts;
		this.quantidade = quantidade;
	}
	
	public void adicionaQuantidade(int qtd) {
		this.quantidade += qtd;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
}
