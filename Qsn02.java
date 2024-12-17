package javaTask12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Qsn02 {

	public static void main(String[] args) {

		try {
			Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Database\\MyDatabase.db");
			Statement statement = connection.createStatement();

			System.out.println("Connection to SQLite has been established.");

			String query = "CREATE TABLE Employee (\r\n"
					+ "  empcode INTEGER PRIMARY KEY,\r\n"
					+ "  empname TEXT NOT NULL,\r\n"
					+ "  empage INTEGER NOT NULL,\r\n"
					+ "  esalary INTEGER NOT NULL\r\n"
					+ ");";

			statement.execute(query);

			query = "INSERT INTO Employee VALUES ('101', 'Jenny', '25', '10000');";
			statement.executeUpdate(query);
			query = "INSERT INTO Employee VALUES ('102', 'Jacky', '30', '20000');";
			statement.executeUpdate(query);
			query = "INSERT INTO Employee VALUES ('103', 'Joe', '20', '40000');";
			statement.executeUpdate(query);
			query = "INSERT INTO Employee VALUES ('104', 'John', '40', '80000');";
			statement.executeUpdate(query);
			query = "INSERT INTO Employee VALUES ('105', 'Shameer', '25', '90000');";
			statement.executeUpdate(query);
			System.out.println("All 4 rows have been inserted");

			statement.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
