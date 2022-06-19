package project_1.tests;

import project_1.classes.Catalog;

public class ProductControllerTest {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.init();

        catalog.printAll();
    }
}
