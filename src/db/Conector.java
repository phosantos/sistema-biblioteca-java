package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
  static String urlDB = "jdbc:mysql://localhost:3306/biblioteca_wissen";
  static String username = "root";
  static String password = "root";

  public static Connection getConnection() throws SQLException {
    Connection connection = null;
    connection = DriverManager.getConnection(urlDB, username, password);

    return connection;
  }
}
