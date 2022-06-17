package project_1.tests;

import java.util.ArrayList;
import project_1.classes.Catalog;
import project_1.classes.Product;

public class CatalogTest {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        Product monitor = new Product(9, "Monitor Ozone 27", "Monitor Gamer Ozone 27 Led, 144 Hz, Quad HD, 1ms, FreeSync", 3, 1999.90);


        catalog.addProduct(monitor);
        catalog.addProduct(new Product(3, "Notebook Asus ZenBook 14 Intel", "Notebook Asus ZenBook 14 Intel Core I5-1135G7, 8GB, 256 GB SSD, Windows 10 Home, 14´ FHD IPS, Iris Xe Graphics, Cinza Escuro - UX425EA-BM319T", 5, 5499.90));

        for (int i = 0; i < catalog.getProducts().size(); i++) {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("ID: " + catalog.getProducts().get(i).getId());
            System.out.println("Name: " + catalog.getProducts().get(i).getName());
            System.out.println("Description: " + catalog.getProducts().get(i).getDescription());
            System.out.println("Quantity: " + catalog.getProducts().get(i).getQuantity());
            System.out.println("Price: " + catalog.getProducts().get(i).getPrice());
        }
    }
}
