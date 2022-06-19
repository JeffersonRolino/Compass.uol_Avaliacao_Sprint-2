package project_2.classes;

import java.util.ArrayList;

public class Catalog {
    private final int pageSize;
    private final int numberOfPages;
    private ArrayList<Movie> movies;

    public Catalog(int _numberOfMovies, int _pageSize){
        this.pageSize = _pageSize;

        if((_numberOfMovies % this.pageSize) != 0)
        {
           this.numberOfPages = (_numberOfMovies / this.pageSize) + 1;
        }
        else {
            this.numberOfPages = (_numberOfMovies / this.pageSize);
        }
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


    public ArrayList<Movie> queryMovies(int _numberOfMovies, int _page){
        ArrayList<Movie> queryMovies = new ArrayList<>();

        int indexStart = (_page - 1) * this.pageSize;
        int indexEnd = _page * this.pageSize;

        for (int i = indexStart; i < (indexStart + _numberOfMovies) && i < indexEnd; i++) {
            Movie movie = this.movies.get(i);
            queryMovies.add(movie);
        }
        return queryMovies;
    }
}
