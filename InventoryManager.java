public class InventoryManager {
    protected Product [] products = new Product[50]; // max amount of items that can be in this inventory is 50
    private int count = 0;

    public void addProduct(Product pr) {
        if ( count < products.length ) {
            products[count++] = pr;
        }
        else {
            System.out.println("Inventory is full!!");
        }
    }

    public void viewallProducts() {
            for ( int i = 0; i < count; i++) {
                products[i].displayProductInfo(); // using display product info to display all the products in the inventory
                System.out.println("---------------------");
            }
        }

    public void searchProduct( int id ) {
        boolean search = false; // search defaulted to false
        for ( int i = 0; i < count; i++ ) {
            if ( products[i].ProductID == id ) {
                System.out.println("Product found: " + products[i].ProductID);
                products[i].displayProductInfo();
                search = true;
                break;
            }
        }
        if ( search == false) {
            System.out.println("The item cannot be found!");
        }
    }

    public void removeProduct( int id ) {
        for (int i = 0; i < count; i++) {
            if (products[i] != null && (products[i]).getProductID() == id) { // nullifying to remove the product via product id ???
                products[i] = null; 
                return;
            }
        }
    }

    public void updateProduct( int id, int quantity) {
        for ( int i = 0; i < count; i++ ) {
            if ( products[i].ProductID == id) {
                products[i].setQuantity(quantity);
                System.out.println("Product has been updated sucessfully!!");
                break;
            }
        }
    }
}

// old remove code ( before exception handling )
// for ( int i = 0; i < count; i++) {
        //     if ( products[i].ProductID == id) {
        //         for ( int j = i; j < count - 1; j++) {
        //             products[i] = products[j+1];
        //             count--;
        //             System.out.println("Product removed successfully!!");
        //             break;
        //         }
                
        //     }
        // }

