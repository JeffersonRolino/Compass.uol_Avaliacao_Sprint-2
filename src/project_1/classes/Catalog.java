package project_1.classes;

import java.util.ArrayList;

public class Catalog {
    private ArrayList<Product> products;

    public Catalog(){
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product _product){
        this.products.add(_product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
