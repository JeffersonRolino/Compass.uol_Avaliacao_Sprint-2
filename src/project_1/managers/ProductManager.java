package project_1.managers;

import project_1.classes.Catalog;
import project_1.classes.Product;
import project_1.daos.ProductDAO;

public class ProductManager {
    public static void addProduct(Catalog _catalog){
        // Get random product...
        Product product =  _catalog.getRandomProduct();
        ProductDAO.save(product);
    }

    public static void addThreeRandomProducts(Catalog _catalog){
        System.out.println("\nProdutos adicionados com sucesso:");
        for (int i = 0; i < 3; i++) {
            addProduct(_catalog);
        }
    }

    public static void updateFirstProduct(Catalog _catalog){
        int[] lastThreeProductsAdded = ProductDAO.selectLastThreeIDs();
        ProductDAO.update(lastThreeProductsAdded[2], _catalog.getRandomProduct());
    }

    public static void deleteSecondProduct(Catalog _catalog){
        int[] lastThreeProductsAdded = ProductDAO.selectLastThreeIDs();
        ProductDAO.delete(lastThreeProductsAdded[1]);
    }
}
