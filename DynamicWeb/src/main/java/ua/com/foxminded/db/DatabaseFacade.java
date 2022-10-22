package ua.com.foxminded.db;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseFacade {

	public static List<String> getBooks() {

		List<String> result = new ArrayList<String>();

		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "bob",
				"admin")) {
			System.out.println("Java JDBC PostgreSQL Example");

			System.out.println("Connected to PostgreSQL database!");

			Statement statement = connection.createStatement();

			ResultSet resultSet = statement.executeQuery("SELECT * FROM books.\"BOOKS\"");

			while (resultSet.next()) {
				result.add(resultSet.getString("name"));
			}
		} catch (SQLException e) {
			System.out.println("Connection faliure.");
			e.printStackTrace();
		}

		return result;
	}
}
