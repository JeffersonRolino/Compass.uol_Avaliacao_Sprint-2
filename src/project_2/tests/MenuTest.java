package project_2.tests;

import project_2.views.Menu;

import java.sql.SQLException;

public class MenuTest {
    public static void main(String[] args) throws SQLException {
        Menu menu = new Menu();

//        menu.numberOfMoviesInput();
        menu.run();

    }
}
