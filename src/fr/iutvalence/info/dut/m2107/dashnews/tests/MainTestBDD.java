package fr.iutvalence.info.dut.m2107.dashnews.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Class MainTestBDD.
 * 
 * @author IT Prouds & CO.
 *
 */
public class MainTestBDD {
	/**
	 * Mains which executes tests BDD application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String nameJDBC = "pgAdmin";
		String url = "jdbc:postgresql://hostname:port/dbname";
		String login = "murrer";
		String password = "murrer";

		try {
			Class.forName(nameJDBC);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(" erreur");
		}
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, login, password);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
