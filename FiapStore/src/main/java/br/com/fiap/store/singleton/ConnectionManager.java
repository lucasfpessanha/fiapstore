package br.com.fiap.store.singleton;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
	
	/* Atributo estático para guardar a conexão */
	
	private static ConnectionManager  connectionManager;
	
	/* construtor vazio*/
	private ConnectionManager() {
		
	}
	public static ConnectionManager getInstance() {
		if (connectionManager == null) {
			connectionManager = new ConnectionManager();
		}
		return connectionManager;
	}
	public Connection getConnection() {
		Connection connection = null;
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM94000",
					"221091");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}

