package fr.iutvalence.info.dut.m2107.dashnews.DataBase;

import java.sql.DriverManager;

public class Connection {
	
	
	public void connect(String user, String password){
		try
		{
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver O.K.");
			String url = "jdbc:postgresql://localhost:5432/Ecole";

			java.sql.Connection conn = DriverManager.getConnection(url, user, password);

			System.out.println("Connexion effective !");
		}
		catch (Exception e)
		{
			e.printStackTrace();
	    }
	}
}

