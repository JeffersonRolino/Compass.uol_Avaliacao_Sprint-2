package project_2.views;

import project_2.classes.Catalog;
import project_2.daos.MovieDAO;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner;
    Catalog catalog;

    public Menu() throws SQLException {
        this.scanner = new Scanner(System.in);
        this.catalog = new Catalog(20, 5);
        catalog.setMovies(MovieDAO.selectMovies());
    }

    public void run(){
        int numberOfMovies = numberOfMoviesInput();
        int page = pageInput();
        catalog.queryMovies(numberOfMovies, page);
    }

    public int numberOfMoviesInput(){
        int numberOfMovies = 0;
        System.out.println("Insira o numero de filmes que voce deseja listar " + "- max. " + catalog.getPageSize());
        if(scanner.hasNextInt()){
            numberOfMovies = scanner.nextInt();
            scanner.nextLine();
            if(numberOfMovies > catalog.getPageSize()){
                System.out.println("O numero maximo de filmes por pagina e " + catalog.getPageSize());
                numberOfMoviesInput();
            }
        }
        else {
            System.out.println("\nEntrada invalida!");
            System.out.println("Por favor digite um numero valido:");
            scanner.nextLine();
            numberOfMoviesInput();
        }
        return numberOfMovies;
    }

    public int pageInput(){
        int page = 0;
        System.out.println("Insira a pagina que voce deseja consultar " + "- max. " + catalog.getNumberOfPages());
        if(scanner.hasNextInt()){
            page = scanner.nextInt();
            scanner.nextLine();
            if(page > catalog.getNumberOfPages()){
                System.out.println("O Catalogo de filmes possui " + catalog.getNumberOfPages() + " paginas.");
                pageInput();
            }
        }
        else {
            System.out.println("\nEntrada invalida!");
            System.out.println("Por favor digite um numero valido:");
            scanner.nextLine();
            pageInput();
        }
        return page;
    }
}
