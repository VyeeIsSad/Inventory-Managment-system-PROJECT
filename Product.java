public class Product {
    protected int ProductID; // item information
    protected String ProductName;
    protected double price;
    protected int quantity;

    public int getProductID() { // getter for product ID for the nullification of the item in Inventory Manager class
        return ProductID;
    }

    public int getQuantity() { // getters and setters for the quantity
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() { // getters and setters for the price
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Product( int ProductID, String ProductName, double price, int quantity ) { // constructor to initalize the item attributes above
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProductInfo() { // displaying the product info
        System.out.println("Product ID: " + ProductID);
        System.out.println("Product Name: " + ProductName);
        System.out.println("Product Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

