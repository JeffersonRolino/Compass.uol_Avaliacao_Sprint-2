package project_2.classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Catalog {
    private int numberOfMovies;
    private int pageSize;
    private int numberOfPages;
    private ArrayList<Movie> movies;

    public Catalog(int _numberOfMovies, int _pageSize){
        this.numberOfMovies = _numberOfMovies;
        this.pageSize = _pageSize;

        if((this.numberOfMovies % this.pageSize) != 0)
        {
           this.numberOfPages = (int)((this.numberOfMovies / this.pageSize) + 1);
        }
        else {
            this.numberOfPages = (int)((this.numberOfMovies / this.pageSize));
        }
    }

    public int getNumberOfMovies() {
        return this.numberOfMovies;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public void setMovies(ArrayList<Movie> _movies){
        this.movies = _movies;
    }

    public ArrayList<Movie> getMovies() {
        return this.movies;
    }

    // Sendo a página n;
    // Cada página deve listar filmes de ((n - 1) * pageSize);
    // até (n) * pageSize;
    // Por exemplo sendo pageSize = 5;
    // A página 3 deve listar os filmes 11,12,13,14,15
    public ArrayList<Movie> queryMovies(int _numberOfMovies, int _page){
        ArrayList<Movie> queryMovies = new ArrayList<Movie>();

        int indexStart = (_page - 1) * this.pageSize;
        int indexEnd = _page * this.pageSize;

        for (int i = indexStart; i < (indexStart + _numberOfMovies) && i < indexEnd; i++) {
            Movie movie = this.movies.get(i);
            queryMovies.add(movie);
        }
        return queryMovies;
    }
}
