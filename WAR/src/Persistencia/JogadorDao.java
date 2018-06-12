package Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jogador.Jogador;

public class JogadorDao {

	public void inserirJogador(Jogador p) throws SQLException {
		Connection conexao = new Conexao().getConnection();
		PreparedStatement result = conexao.prepareStatement("insert into Player (nomeJogador,corJogador,objJogador)"
				+"values (?,?,?)");
		result.setString(1,p.getNome());
		result.setString(2,p.getCor());
		result.setString(3,p.getObj().getObj());
		int retorno = result.executeUpdate();
		if( retorno == 1) {
			System.out.println("Inserção concluida");
		}else {
			System.out.println("Algo deu errado na inserção");
		}
		conexao.close();
	}

	public void deletarjogador(Jogador p) throws SQLException{
		Connection conexao = new Conexao().getConnection();
		PreparedStatement result = conexao.prepareStatement("Delete from Player where nomeJogador = ?;");
		result.setString(1,p.getNome());
		conexao.close();
		int retorno = result.executeUpdate();
		if(retorno == 1) {
			System.out.println(p.getNome()+" Deleteado com sucesso");
		}else {
			System.out.println("Algo deu errado ao deletar");
		}
	}

	public Jogador buscarJogador(String nome) throws SQLException{
		Connection conexao = new Conexao().getConnection();
		PreparedStatement result = conexao.prepareStatement("select * from Player where nomeJogador = '?'");
		result.setString(1,nome);
		result.executeQuery();
		conexao.close();
		Jogador jogador = new Jogador();
		jogador.setNome(((ResultSet) result).getString("nomeJogador"));
		return jogador;
	}

	public void insertPaisJogador(int x, String pais) throws SQLException {
		Connection conexao = new Conexao().getConnection();
		PreparedStatement result1 = conexao.prepareStatement(
				"SET SQL_SAFE_UPDATES = 0;");
		result1.executeQuery();
		PreparedStatement result2 = conexao.prepareStatement(
				"ALTER TABLE `War`.`Player`ADD COLUMN `Pais1` VARCHAR(45) AFTER `objPlayer`;");
		int retorno = result2.executeUpdate();
		if(retorno != 1) {
			PreparedStatement result4 = conexao.prepareStatement(
					"ALTER TABLE `War`.`Player`ADD COLUMN `Pais"+x+"` VARCHAR(45) AFTER `Pais"+(x-1)+"`;");
			result4.executeUpdate();
		}
		PreparedStatement result3 = conexao.prepareStatement(
				"UPDATE `War`.`Player` SET `Pais"+x+"' = ? WHERE `nomeJogador`= ?");
		result3.setString(1,pais);
		result3.executeUpdate();
		conexao.close();
	}
}
