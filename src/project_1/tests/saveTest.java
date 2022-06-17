package project_1.tests;

import project_1.classes.Catalog;
import project_1.classes.Product;
import project_1.daos.ProductDAO;

public class saveTest {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        Product monitor = new Product(9, "Monitor Ozone 27", "Monitor Gamer Ozone 27 Led, 144 Hz, Quad HD, 1ms, FreeSync", 3, 1999.90);
        Product monitor1 = new Product(11, "Monitor Ozone 27", "Monitor Gamer Ozone 27 Led, 144 Hz, Quad HD, 1ms, FreeSync", 3, 1999.90);
        Product monitor2 = new Product(15, "Monitor Ozone 15", "Monitor Gamer Ozone 27 Led, 144 Hz, Quad HD, 1ms, FreeSync", 3, 1999.90);
        catalog.addProduct(monitor);
        catalog.addProduct(monitor2);

//        ProductDAO.save(monitor);
//        ProductDAO.save(monitor2);

        monitor2.setName("Monitor Atualizado");
        ProductDAO.update(monitor2);
    }
}
