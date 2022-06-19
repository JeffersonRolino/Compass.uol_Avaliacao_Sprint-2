package project_1.views;

import project_1.classes.Catalog;
import project_1.managers.ProductManager;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner;
    Catalog catalog;
    int menuOption = 42;

    public Menu(){
        this.scanner = new Scanner(System.in);
        this.catalog = new Catalog();
        catalog.init();
    }

    public void run(){
        while(menuOption != 0 ){
            display();
            if(scanner.hasNextInt()){
                menuOption = scanner.nextInt();
                scanner.nextLine();
                if(menuOption == 1){
                    ProductManager.addThreeRandomProducts(this.catalog);
                }
                else if(menuOption == 2){
                    ProductManager.updateFirstProduct(this.catalog);
                }
                else if(menuOption == 3){
                    ProductManager.deleteSecondProduct(this.catalog);
                }
            }
            else {
                System.out.println("\nEntrada invalida!");
                System.out.println("Por favor digite um numero valido:");
                scanner.nextLine();
                run();
            }
        }
    }

    public void display(){
        System.out.println("------------------------------------------------------------");
        System.out.println("\tMENU");
        System.out.println("------------------------------------------------------------");
        System.out.println("1 - Adicionar 3 Produtos");
        System.out.println("2 - Atualizar Primeiro Produto");
        System.out.println("3 - Excluir Segundo Produto");
        System.out.println("0 - Sair");
        System.out.println("Insira sua opcao: ");
    }
}
