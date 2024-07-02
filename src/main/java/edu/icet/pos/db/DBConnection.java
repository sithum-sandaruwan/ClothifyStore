package edu.icet.pos.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static DBConnection instance;
    private final Connection connection;

    private DBConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Clothify", "root", "Sikka@323");
    }

    public Connection getConnection() {
        return connection;
    }

    private static DBConnection getInstance() throws SQLException, ClassNotFoundException {
        if (instance == null) {
            return instance = new DBConnection();
        }
        return instance;
    }
}
