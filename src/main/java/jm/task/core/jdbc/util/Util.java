package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String URL =
            "jdbc:mysql://localhost:3306/usersdb?serverTimezone=Europe/Moscow&allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USERNAME = "guest";
    private static final String PASSWORD = "kIl3m15o";

    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
