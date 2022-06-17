package project_1.tests;

import project_1.views.Menu;

public class MenuTest {
    public static void main(String[] args) {
        Menu mainMenu = new Menu();

        mainMenu.addOption(1, "Register Product");

        mainMenu.display();
    }
}
