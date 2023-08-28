package isuru.singleton.test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dbConnection;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/db-singleton?createDatabaseIfNotExist=true";
    private String username = "root";
    private String password = "1234";

    private DBConnection() {
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static DBConnection getDbConnection() {
        return (dbConnection==null)?dbConnection=new DBConnection():dbConnection;
    }

    public Connection getConnection() {
        return connection;
    }
}
