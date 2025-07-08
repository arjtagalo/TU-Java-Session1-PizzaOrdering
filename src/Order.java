public class Order {

        private String pizzaType;
        private int quantity;

        // Constructor
        public Order(String pizzaType, int quantity) {
            this.pizzaType = pizzaType;
            this.quantity = Math.max(quantity, 1);
        }

        // Getters and Setters
        public String getPizzaType() {
            return pizzaType;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            if (quantity > 0) {
                this.quantity = quantity;
            } else {
                System.out.println("Quantity must be positive.");
            }
        }

        // Print order details
        public void printOrder(int index) {
            System.out.println((index + 1) + ". " + pizzaType + " x" + quantity);
        }

}
