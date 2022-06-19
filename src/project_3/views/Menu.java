package project_3.views;

import java.util.Scanner;

public class Menu {
    Scanner scanner;

    public Menu(){
        this.scanner = new Scanner(System.in);
    }

    public String userInput() {
        String userInput = "";
        if (this.scanner.hasNext()) {
            userInput = this.scanner.nextLine();
            scanner.close();
        }
        return userInput;
    }
}
