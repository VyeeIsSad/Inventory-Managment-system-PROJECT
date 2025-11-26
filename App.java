import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int Nchoice; // variable for user choice from menu interface
        InventoryManager inventory = new InventoryManager();
        Scanner scanner = new Scanner(System.in); // importing scanner for user input

        do { // menu display interface for the user
            System.out.println("===============================");
            System.out.println("Inventory Management System");
            System.out.println("1. Add product");
            System.out.println("2. View all products");
            System.out.println("3. Search product");
            System.out.println("4. Remove product");
            System.out.println("5. Update product quantity");
            System.out.println("6. Exit");
            System.out.println("===============================");
            System.out.print("Enter your choice: ");
            Nchoice = scanner.nextInt();

            if (Nchoice < 1 || Nchoice > 6) {
                System.out.println("Invalid choice! please enter a valid number from the list!");
            } else {
                try { // try for exception handling ( manages run time errors )
                    switch (Nchoice) {
                        case 1:
                            int type;
                            do {
                                System.out.println("Enter the type of product you'd like to add (1 for regular, 2 for perishable): ");
                                type = scanner.nextInt();
                                if (type != 1 && type != 2) {
                                    System.out.println("Invalid product type!");
                                }
                            } while (type != 1 && type != 2);

                            if (type == 1) { // if statement for the type of product thats being added , 1 is regular 2 is perishable items
                                System.out.println("Enter product ID: "); // asks for information for the product
                                int id = scanner.nextInt();

                                System.out.println("Enter product name: ");
                                String name = scanner.next();

                                System.out.println("Enter product price: ");
                                double price = scanner.nextDouble();

                                System.out.println("Enter product quantity: ");
                                int quantity = scanner.nextInt();

                                Product p1 = new Product(id, name, price, quantity); // assigning the product theyre adding to an object and printing it out ( 1 for regular product )
                                inventory.addProduct(p1);
                                System.out.println("Product added successfully!!");

                            } else if (type == 2) { // else if for perishables
                                System.out.println("Enter product ID: ");
                                int id = scanner.nextInt();

                                System.out.println("Enter product name: ");
                                String name = scanner.next();

                                System.out.println("Enter product price: ");
                                double price = scanner.nextDouble();

                                System.out.println("Enter product quantity: ");
                                int quantity = scanner.nextInt();

                                System.out.println("Enter product expiry date (YYYY/MM/DD): "); // added expiry date for the perishable items
                                String expyDate = scanner.next();

                                PerishableProduct pp1 = new PerishableProduct(id, name, price, quantity, expyDate); // assigning the perishable item to an object and printing it out
                                inventory.addProduct(pp1);
                                System.out.println("Product added successfully!!");
                            }
                            break; // end of the case 1

                        case 2: // calling viewallProducts method from the InventoryManager class
                            System.out.println("------------------");
                            inventory.viewallProducts();
                            break;

                        case 3: 
                            System.out.println("-----------------");
                            System.out.println("Enter product ID to search: "); // allowing the user to search for a product by its ID 
                            int searchId = scanner.nextInt();
                            inventory.searchProduct(searchId); 
                            System.out.println("-----------------");
                            break;

                        case 4:
                            System.out.println("Enter product ID to remove: "); // allowing the user to remove a product also by using its ID for easy access
                            int removeId = scanner.nextInt();
                            inventory.removeProduct(removeId);
                            System.out.println("Product removed successfully!!");
                            break;

                        case 5:
                            System.out.println("Enter product ID to update: "); // the user can update the quantity of the product by entering the item ID
                            int updateId = scanner.nextInt();

                            System.out.println("Enter the new quantity: ");
                            int newQuantity = scanner.nextInt();

                            inventory.updateProduct(updateId, newQuantity);
                            System.out.println("Product has been updated successfully!!");
                            break;

                        case 6:
                            System.out.println("Exiting the program, Thank you!"); // message to exit the program after hitting 6
                            break;

                        default:
                            System.out.println("Invalid choice! please enter a number from the list above!"); // for invalid input
                            break;
                    }
                } catch (Exception e) { // try and catch used to be safe
                    System.out.println("An error occurred: " + e.getMessage());
                    scanner.next(); // to remove the invalid input from scanner
                }
            }
        } while (Nchoice != 6); // loops back after the user has entered 6 and exited the program
        scanner.close();
    }
}

