package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.caelum.jdbc.DAO.ProdutosDao;
import br.com.caelum.jdbc.model.Produto;

public class Testa {

	 public static void main(String[] args) throws SQLException {
		
		 Produto produto = new Produto("Mesa Preta", "Mesa com 4 pés");
		 
		 try(Connection connection = new ConnectionPool().getConnection()){
			 ProdutosDao dao = new ProdutosDao(connection);
			 
			 //dao.salva(produto);
			 
			 List<Produto> produtos = dao.lista();
			 
			 for (Produto p : produtos) {
				 System.out.println("Nome: " + p.getNome());
				 System.out.println("Descrição: " + p.getDescricao());
				 System.out.println("");
			}
		 }
	}
}
