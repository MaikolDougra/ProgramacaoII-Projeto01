import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConection {
    private static DBConnection instance = null;
	private Connection conn;
	
	private String url = "jdbc:mysql://localhost:5422/Maikell_BDProgramaçãoIIBiblioteca";
	private String usuario = "postgres";
	private String senha = "1234";
	
	private DBConnection() throws SQLException {
			try {
				Class.forName("org.postgresql.Driver");
				conn = DriverManager.getConnection(url, usuario, senha);
			}catch (Exception ex) {
				
			
			}
	}
	
	public Connection getConnection() {
		return conn;
	}
	
	public static DBConnection getInstance() throws SQLException {
		if(instance == null) {
			instance = new DBConnection();
		}else if (instance.getConnection().isClosed()) {
			instance = new DBConnection();
		}
		
		return instance;
	}
}
