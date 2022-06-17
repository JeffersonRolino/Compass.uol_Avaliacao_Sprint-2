package project_1.views;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private ArrayList<String> options;

    public Menu(){
        this.options = new ArrayList<String>();
        this.options.add(0, "0 - Exit");
    }

    public void addOption(int _optionNumber, String _option){
        String menuOption = "";
        this.options.add(menuOption + _optionNumber + " - " + _option);
    }

    public void display(){
        this.options.forEach(System.out::println);
    }
}
