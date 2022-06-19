package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection(String _dataBase){
        String ip = "jdbc:mysql://localhost:3306/";
        String url = ip + _dataBase;
        try {
            return DriverManager.getConnection(url, "root", "root");
        } catch (SQLException exception){
            throw new RuntimeException(exception);
        }
    }
}
