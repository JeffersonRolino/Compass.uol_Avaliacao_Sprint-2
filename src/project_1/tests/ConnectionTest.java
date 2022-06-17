package project_1.tests;

import db_connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionTest {
    public static void main(String[] args) throws SQLException {
        String db = "products_db";
        Connection connection = new ConnectionFactory().getConnection(db);
        connection.close();
    }
}
