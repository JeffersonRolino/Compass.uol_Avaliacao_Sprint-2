package project_2.classes;

public class Catalog {
    private int numberOfMovies;
    private int pageSize;
    private int numberOfPages;

    // Sendo a página n;
    // Cada página deve listar filmes de ((n - 1) * pageSize) + 1;
    // até (n) * pageSize;
    // Por exemplo sendo pageSize = 5;
    // A página 3 deve listar os filmes 11,12,13,14,15

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
}
