package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection(){
		Connection conexao = null;
		String banco = System.getenv("tipoBanco");
		
		try {
			if(banco.equals("mySql")){
				conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "usuario", "senha");
			}else if(banco.equals("postgres")){
				conexao = DriverManager.getConnection("jdbc:postgres://localhost:3306/banco", "usuario", "senha");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return  conexao;
	}
}
