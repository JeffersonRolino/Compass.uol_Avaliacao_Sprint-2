package project_2.tests;

import project_2.classes.Catalog;
import project_2.classes.Movie;
import project_2.daos.MovieDAO;

import java.sql.SQLException;

public class CatalogTest {
    public static void main(String[] args) throws SQLException {

        Catalog catalog = new Catalog(20,5);

        catalog.setMovies(MovieDAO.selectMovies());

//        for(Movie movie : catalog.getMovies()){
//            System.out.println(movie.getId() + ", " + movie.getName()  + ", " + movie.getDescription()  + ", " + movie.getYear());
//        }

        catalog.queryMovies(3,2);
    }
}
