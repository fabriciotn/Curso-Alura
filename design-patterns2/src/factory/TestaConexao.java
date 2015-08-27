package factory;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory cf = new ConnectionFactory();
		Connection connection = cf.getConnection();
		
		connection.prepareStatement("select * from tabela");
	}
}
