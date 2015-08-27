package br.com.caelum.jdbc.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.model.Categoria;

public class CategoriasDAO {

	private final Connection conn;

	public CategoriasDAO(Connection con) {
		this.conn = con;
	}
	
	
	public List<Categoria> lista() throws SQLException {
		List<Categoria> categorias = new ArrayList<>();

		try (Statement statemant = this.conn.createStatement()) {
			boolean resultado = statemant.execute("select * from Categoria");
			transformaResultadoEmProdutos(statemant, categorias);
		}

		return categorias;
	}


	private void transformaResultadoEmProdutos(Statement statemant, List<Categoria> categorias)
			throws SQLException {
		try (ResultSet resultSet = statemant.getResultSet()) {

			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String nome = resultSet.getString("nome");
				
				Categoria categoria = new Categoria(id, nome);
				
				categorias.add(categoria);
			}
		}
	}
}
