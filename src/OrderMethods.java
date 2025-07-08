import java.util.ArrayList;
import java.util.List;

public class OrderMethods {

    // List of available pizzas
    static final List<String> availablePizzas = new ArrayList<>();

    static {
        availablePizzas.add("Margherita");
        availablePizzas.add("Pepperoni");
        availablePizzas.add("Hawaiian");
        availablePizzas.add("BBQ Chicken");
        availablePizzas.add("Vegetarian");
    }

    // Method to get the list of available pizzas
    public static void displayAvailablePizzas() {
        System.out.println("\nAvailable Pizzas:");
        for (int i = 0; i < availablePizzas.size(); i++) {
            System.out.println((i + 1) + ". " + availablePizzas.get(i));
        }
    }

    public static void addOrder(ArrayList<Order> orders, String pizzaType, int quantity) {
        if (quantity > 0) {
            orders.add(new Order(pizzaType, quantity));
            System.out.println("Order added: " + pizzaType + " x" + quantity + "\n");
        } else {
            System.out.println("Quantity must be positive.\n");
        }
    }

    // Method to update the quantity of an existing order
    public static void updateOrder(ArrayList<Order> orders, int index, int newQuantity) {
        if (newQuantity > 0 && index >= 0 && index < orders.size()) {
            orders.get(index).setQuantity(newQuantity);
            System.out.println("Order updated: " + orders.get(index).getPizzaType() + " x" + newQuantity + "\n");
        } else {
            System.out.println("Invalid index or quantity.\n");
        }
    }

    // Method to remove an existing order
    public static void removeOrder(ArrayList<Order> orders, int index) {
        if (index >= 0 && index < orders.size()) {
            System.out.println("Removed order: " + orders.get(index).getPizzaType() + " x" + orders.get(index).getQuantity() + "\n");
            orders.remove(index);
        } else {
            System.out.println("Invalid index.\n");
        }
    }

    // Method to print all orders
    public static void printOrders(ArrayList<Order> orders) {
        if (orders.isEmpty()) {
            System.out.println("No orders found.\n");
        } else {
            for (int i = 0; i < orders.size(); i++) {
                orders.get(i).printOrder(i);
            }
        }
    }
}
