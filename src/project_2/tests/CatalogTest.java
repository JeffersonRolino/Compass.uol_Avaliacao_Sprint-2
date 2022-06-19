package project_2.tests;

import project_2.classes.Catalog;

public class CatalogTest {
    public static void main(String[] args) {

        Catalog catalog = new Catalog(20,5);


        System.out.println(catalog.getNumberOfMovies());
        System.out.println(catalog.getPageSize());
        System.out.println(catalog.getNumberOfPages());
    }
}
