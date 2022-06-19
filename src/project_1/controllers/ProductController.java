package project_1.controllers;

import project_1.classes.Catalog;
import project_1.classes.Product;
import project_1.daos.ProductDAO;

public class ProductController {
    public static void addProduct(Catalog _catalog){
        // Get random product...
        Product product =  _catalog.getRandomProduct();
        ProductDAO.save(product);
    }

    public static void addThreeRandomProducts(Catalog _catalog){
        for (int i = 0; i < 3; i++) {
            addProduct(_catalog);
        }
    }

    public static void updateFirstProduct(Catalog _catalog){
        int[] lastThreeProductsAdded = ProductDAO.selectLastThreeIDs();

//        for (int i = 0; i < lastThreeProductsAdded.length; i++) {
//            System.out.println(lastThreeProductsAdded[i]);
//        }

        ProductDAO.update(lastThreeProductsAdded[2], _catalog.getRandomProduct());
    }

    public static void deleteSecondProduct(Catalog _catalog){
        int[] lastThreeProductsAdded = ProductDAO.selectLastThreeIDs();

        ProductDAO.delete(lastThreeProductsAdded[1]);
    }
}
