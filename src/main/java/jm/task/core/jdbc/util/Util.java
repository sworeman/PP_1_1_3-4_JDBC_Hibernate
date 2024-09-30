package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

    private static final String URL = "jdbc:mysql://localhost:3306/db1.1.3";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";

    public static Connection getConnection() {
        Connection conn = null;
            try {
              //Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
          //} catch (SQLException | ClassNotFoundException e) {
            } catch (SQLException e) {
                System.out.println("Error connecting to database" + e.getMessage());
            }
        return conn;
    }
}
