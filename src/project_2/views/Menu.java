package project_2.views;

import project_2.classes.Catalog;
import project_2.classes.Movie;
import project_2.daos.MovieDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private final Scanner scanner;
    Catalog catalog;
    private int numberOfMovies = 5;
    private int numberOfPages = 4;

    public Menu() throws SQLException {
        this.scanner = new Scanner(System.in);
        this.catalog = new Catalog(20, 5);
        catalog.setMovies(MovieDAO.selectMovies());
    }

    public void run(){
        int numberOfMovies = numberOfMoviesInput();
        int page = pageInput();

        try {
            displayPage(page);
            displayMovies(catalog.queryMovies(numberOfMovies, page));
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public int numberOfMoviesInput(){
        System.out.println("Insira o numero de filmes que voce deseja listar " + "- max. " + catalog.getPageSize());
        if(scanner.hasNextInt()){
            int movieInput = scanner.nextInt();
            if(movieInput <= catalog.getPageSize()){
                numberOfMovies = movieInput;
            }
            else {
                System.out.println("O numero maximo de filmes por pagina e " + catalog.getPageSize());
                numberOfMoviesInput();
            }
        }
        else {
            System.out.println("\nEntrada invalida!");
            System.out.println("Por favor digite um numero valido:");
            numberOfMoviesInput();
        }
        return numberOfMovies;
    }

    public int pageInput(){
        System.out.println("Insira a pagina que voce deseja consultar " + "- max. " + catalog.getNumberOfPages());
        if(scanner.hasNextInt()){
            int pageInput = scanner.nextInt();
            if(pageInput <= catalog.getNumberOfPages()){
                numberOfPages = pageInput;
            }
            else {
                System.out.println("O Catalogo de filmes possui " + catalog.getNumberOfPages() + " paginas.");
                pageInput();
            }
        }
        else {
            System.out.println("\nEntrada invalida!");
            System.out.println("Por favor digite um numero valido:");
            pageInput();
        }
        return numberOfPages;
    }

    public void displayPage(int _page){
        System.out.println("-------------------------------------------------------------------");
        System.out.println("PAGINA " + _page);
        System.out.println("-------------------------------------------------------------------");
    }

    public void displayMovies(ArrayList<Movie> movies){
        for (Movie movie : movies){
            System.out.printf("%d - %s \t %d\n", movie.getId(), movie.getName(), movie.getYear());
            System.out.println(movie.getDescription());
            System.out.println("-------------------------------------------------------------------");
        }
    }
}
