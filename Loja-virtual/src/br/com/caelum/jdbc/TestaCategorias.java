package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.caelum.jdbc.DAO.CategoriasDAO;
import br.com.caelum.jdbc.model.Categoria;

public class TestaCategorias {

	public static void main(String[] args) throws SQLException {
		
		try(Connection con = new ConnectionPool().getConnection()){
		
			List<Categoria> categorias = new CategoriasDAO(con).lista();
			
			for (Categoria categoria : categorias) {
				System.out.println("ID: " + categoria.getId());
				System.out.println("Nome: " + categoria.getNome());
			}
		}
	}
}
