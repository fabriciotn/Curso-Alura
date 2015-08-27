package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.hsqldb.jdbc.JDBCPool;

public class ConnectionPool {

	private static Connection connection;
	private DataSource dataSource;

	public ConnectionPool() {
		JDBCPool pool = new JDBCPool();
        pool.setUrl("jdbc:hsqldb:hsql://localhost/loja-virtual");
        pool.setUser("SA");
        pool.setPassword("");
        
        this.dataSource = pool;
	}
	
	public Connection getConnection() throws SQLException {
		//connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/loja-virtual", "SA", "");
		connection = dataSource.getConnection();
		return connection;
	}
}
