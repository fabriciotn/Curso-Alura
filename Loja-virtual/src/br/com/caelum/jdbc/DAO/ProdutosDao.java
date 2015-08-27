package br.com.caelum.jdbc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.jdbc.model.Produto;

public class ProdutosDao {

	private final Connection con;

	public ProdutosDao(Connection con) {
		this.con = con;
	}

	public void salva(Produto produto) throws SQLException {
		String sql = "insert into Produto (nome, descricao) values (?,?)";

		try (PreparedStatement stmt = con.prepareStatement(sql,
				Statement.RETURN_GENERATED_KEYS)) {

			stmt.setString(1, produto.getNome());
			stmt.setString(2, produto.getDescricao());
			stmt.execute();

			try (ResultSet rs = stmt.getGeneratedKeys()) {
				if (rs.next()) {
					int id = rs.getInt("id");
					produto.setId(id);
					System.out.println("Produto " + id
							+ " inserido com sucesso!");
				}
			}

		}
	}

	public List<Produto> lista() throws SQLException {
		List<Produto> produtos = new ArrayList<>();

		try (Statement statemant = con.createStatement()) {
			
			boolean resultado = statemant.execute("select * from Produto");
			
			try (ResultSet resultSet = statemant.getResultSet()) {

				while (resultSet.next()) {
					int id = resultSet.getInt("id");
					String nome = resultSet.getString("nome");
					String descricao = resultSet.getString("descricao");
					
					Produto produto = new Produto(nome, descricao);
					produto.setId(id);
					
					produtos.add(produto);
				}
			}
		}

		return produtos;
	}
}