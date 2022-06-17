package project_1.classes;

public class Product {
    private int id;
    private String name;
    private String description;
    private int quantity;
    private double price;

    public Product(int _id, String _name, String _description, int _quantity, double _price){
        this.id = _id;
        this.name = _name;
        this.description = _description;
        this.quantity = _quantity;
        this.price = _price;
    }

    // Getters and Setters...
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
