import java.util.ArrayList;
import java.util.Scanner;

public class PizzaOrderingSystem {
    public static void main(String[] args) {

        // Creating an ArrayList to store orders
        ArrayList<Order> orders = new ArrayList<>();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("\n=== Pizza Restaurant ===");
        System.out.println("1. Add Order");
        System.out.println("2. Update Order");
        System.out.println("3. Remove Order");
        System.out.println("4. List Orders");
        System.out.println("5. Exit");

        while (!exit) {
            System.out.print("Choose an option (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Add a new order
                    OrderMethods.displayAvailablePizzas();
                    System.out.print("Enter pizza number: ");
                    int pizzaChoice = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (pizzaChoice >= 0 && pizzaChoice < OrderMethods.availablePizzas.size()) {
                        String pizzaType = OrderMethods.availablePizzas.get(pizzaChoice);
                        System.out.print("Enter quantity: ");
                        int quantity = scanner.nextInt();
                        OrderMethods.addOrder(orders, pizzaType, quantity);
                    } else {
                        System.out.println("Invalid pizza selection.");
                    }
                    break;

                case 2:
                    // Update an existing order
                    System.out.println("\n----Current Order(s) for Update----");
                    OrderMethods.printOrders(orders);
                    System.out.print("Enter pizza number to update: ");
                    int updateIndex = scanner.nextInt() - 1;
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    OrderMethods.updateOrder(orders, updateIndex, newQuantity);
                    break;

                case 3:
                    // Remove an order
                    System.out.println("\n----Current Order(s) for Removal----");
                    OrderMethods.printOrders(orders);
                    System.out.print("Enter pizza number to remove: ");
                    int removeIndex = scanner.nextInt() - 1;
                    OrderMethods.removeOrder(orders, removeIndex);
                    break;

                case 4:
                    // List all orders
                    System.out.println("\n----Current Order(s)----");
                    OrderMethods.printOrders(orders);
                    System.out.println("\n");
                    break;

                case 5:
                    // Exit the program
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 5.\n");
            }
        }

        scanner.close();
    }
}