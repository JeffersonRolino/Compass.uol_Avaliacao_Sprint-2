package project_2;

import project_2.views.Menu;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Menu menu = new Menu();

        menu.run();
    }
}
