package project_3;

import project_3.classes.SubStringDetector;
import project_3.views.Menu;

public class Main {

    public static void main(String[] args) {
        System.out.println("Insira sua mensagem...");
        Menu menu = new Menu();
        String message = menu.userInput();

        SubStringDetector.stringIterator(message);

    }
}
