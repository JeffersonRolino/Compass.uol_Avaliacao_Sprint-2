package project_1.tests;

import project_1.classes.Catalog;
import project_1.classes.Product;
import project_1.controllers.ProductController;
import project_1.daos.ProductDAO;

public class ProductControllerTest {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.init();

        catalog.printAll();

//        catalog.getProducts().clear();

//        ProductController.deleteSecondProduct(catalog);

//        ProductController.updateFirstProduct(catalog);
//        ProductController.addThreeRandomProducts(catalog);

//        ProductController.addProduct(catalog);

//

//        catalog.getProducts().forEach(ProductDAO::save);

//        ProductDAO.save(monitor);
//        ProductDAO.save(monitor2);

//        monitor2.setName("Monitor Atualizado");
//        ProductDAO.update(monitor2);
    }
}
