package fr.iutvalence.info.dut.m2107.dashnews.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
		String nameJDBC = "org.postgresql.Driver";
		String url = "jdbc:postgresql://murerr:5432/murerr"; // TODO port?
		String login = "murerr";
		String password = "murerr";
		String sql = "select * from consultation;";

		try {
			Class.forName(nameJDBC);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection = null;
		Statement State = null;
		try {
			connection = DriverManager.getConnection(url, login, password);

			State = connection.createStatement();
			ResultSet result = State.executeQuery(sql);
			System.out.println(result);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (connection != null) {
			System.out.println("You are connected now!");
		} else {
			System.out.println("Failed to make connection!");
		}
	}
}
