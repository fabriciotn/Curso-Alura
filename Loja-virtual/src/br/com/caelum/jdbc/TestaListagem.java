package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = new ConnectionPool().getConnection();
		Statement statemant = connection.createStatement();
		boolean resultado = statemant.execute("select * from Produto");
		ResultSet resultSet = statemant.getResultSet();
		
		while (resultSet.next()) {
			int id = resultSet.getInt("id");
			String nome = resultSet.getString("nome");
			String descricao = resultSet.getString("descricao");
			
			System.out.println("Id: " + id);
			System.out.println("Nome: " + nome);
			System.out.println("Descrição: " + descricao);
			System.out.println("------------------------------\n");
		}
		
		resultSet.close();
		statemant.close();
		connection.close();
	}
}
