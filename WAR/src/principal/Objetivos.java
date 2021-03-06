package principal;

import java.util.ArrayList;

import jogador.Jogador;

public class Objetivos {

	private int id;
	private String obj;
	private boolean usando;


	public Objetivos(int id, String descrição, boolean usado) {
		this.id = id;
		this.obj = descrição;
		this.usando = usado;
	}

	public boolean objetivoAlcançado(Jogador jogador, ArrayList<Pais> pais) {
		boolean vencedor = false;
		System.out.println("Objetivo: "+jogador.getObj().getObj());
		switch (jogador.getObj().getId()) {
		case 1:
			if(pais.get(0).getJogador() == jogador && pais.get(1).getJogador() == jogador&&
			pais.get(2).getJogador() == jogador && pais.get(3).getJogador() == jogador &&
			pais.get(8).getJogador() == jogador && pais.get(9).getJogador() == jogador &&
			pais.get(10).getJogador() == jogador &&	pais.get(11).getJogador() == jogador) {
				vencedor = true;
			}
			break;
		case 2:
			if(pais.get(20).getJogador() == jogador && pais.get(21).getJogador() == jogador&&
			pais.get(22).getJogador() == jogador && pais.get(23).getJogador() == jogador) {
				vencedor = true;
			}break;
		case 3:
			if(jogador.getQuantidade_territorios() == 24) {
				vencedor = true;
			}
			break;
		case 4:
			if(pais.get(4).getJogador() == jogador && pais.get(5).getJogador() == jogador&&
			pais.get(6).getJogador() == jogador && pais.get(7).getJogador() == jogador &&
			pais.get(12).getJogador() == jogador && pais.get(13).getJogador() == jogador &&
			pais.get(14).getJogador() == jogador &&	pais.get(15).getJogador() == jogador) {
				vencedor = true;
			}
			break;
		case 5:
			if(pais.get(16).getJogador() == jogador && pais.get(17).getJogador() == jogador&&
			pais.get(18).getJogador() == jogador && pais.get(19).getJogador() == jogador) {
				vencedor = true;
			}break;
		case 6:
			if(pais.get(0).getJogador() == jogador && pais.get(1).getJogador() == jogador&&
			pais.get(2).getJogador() == jogador && pais.get(3).getJogador() == jogador &&
			pais.get(20).getJogador() == jogador && pais.get(21).getJogador() == jogador&&
			pais.get(22).getJogador() == jogador && pais.get(23).getJogador() == jogador) {
				vencedor = true;
			}
			break;
		case 7:
			if(jogador.getCor().equalsIgnoreCase("Preto")) {
				if(jogador.getQuantidade_territorios() == 24) {
					vencedor = true;
				}
			}
			break;
		case 8:
			if(jogador.getCor().equalsIgnoreCase("Branco")) {
				if(jogador.getQuantidade_territorios() == 24) {
					vencedor = true;
				}
			}
			break;
		case 9:
			if(jogador.getCor().equalsIgnoreCase("Azul")) {
				if(jogador.getQuantidade_territorios() == 24) {
					vencedor = true;
				}
			}
			break;
		case 10:
			if(jogador.getCor().equalsIgnoreCase("Amarelo")) {
				if(jogador.getQuantidade_territorios() == 24) {
					vencedor = true;
				}
			}
			break;
		default:
			System.out.println("Erro nos objetivos");
			break;
		}
		if(vencedor == true) {
			System.out.println("Vencedor "+jogador.getNome());
		}
		return vencedor;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getObj() {
		return obj;
	}
	public void setObj(String obj) {
		this.obj = obj;
	}
	public boolean isUsando() {
		return usando;
	}
	public void setUsando(boolean usando) {
		this.usando = usando;
	}
}
