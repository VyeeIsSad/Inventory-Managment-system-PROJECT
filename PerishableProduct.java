public class PerishableProduct extends Product {
    private String ExpyDate;

    public PerishableProduct( int ProductID, String ProductName, double price, int quantity, String ExpyDate) {
        super(ProductID, ProductName, price, quantity);
        this.ExpyDate = ExpyDate;
    }

    public String getExpyDate() {
        return ExpyDate;
    }
    public void setExpyDate(String expyDate) {
        this.ExpyDate = ExpyDate;
    }

    @Override
    public void displayProductInfo () {
        System.out.println("Product ID: " + ProductID);
        System.out.println("Product Name: " + ProductName);
        System.out.println("Product Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Expiry date is: " + ExpyDate);
    }
    
}