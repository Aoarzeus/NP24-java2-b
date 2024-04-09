package br.com.senaisp.bauru.alex.classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBd {
	private static ConexaoBd instancia = null;
	private Connection conn;
	
	private ConexaoBd() throws SQLException {
	conn = DriverManager.getConnection("jdbc:sqlite:C:\\javalibs\\Dados\\NP24_JAVA2_B.DB");
	}
	public static ConexaoBd getInstancia() throws SQLException {
		if (instancia==null) {
			instancia = new ConexaoBd();
		}
		return instancia;
	}
	public Connection getConn() {
		return conn;
	}
	
}
