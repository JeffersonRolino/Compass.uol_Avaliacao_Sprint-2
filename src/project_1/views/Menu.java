package project_1.views;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private ArrayList<String> options;

    public Menu(){
        this.options = new ArrayList<String>();
        this.scanner = new Scanner(System.in);
        this.options.add(0, "0 - Exit");
    }

    public void addOption(int _optionNumber, String _option){
        String menuOption = "";
        this.options.add(menuOption + _optionNumber + " - " + _option);
    }

    public void run(){
        int userOption = 42;
        while(userOption != 0 ){
            display();
            userOption = readOption();
        }
    }

    public void display(){
        this.options.forEach(System.out::println);
    }

    public int readOption(){
        System.out.println("\nInsira sua opcao: ");
        if(scanner.hasNextInt() && scanner.nextInt() < options.size()){
            return scanner.nextInt();
        }
        else {
            System.out.println("\nEntrada invalida!");
            System.out.println("Por favor digite um numero valido:");
            scanner.nextLine();
            run();
        }
        return 0;
    }
}
