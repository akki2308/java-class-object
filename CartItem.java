public class CartItem {
    private final String[] itemNames = new String[10];
    private final double[] prices = new double[10];
    private final int[] quantities = new int[10];
    private int itemCount = 0;

    public void addItem(String itemName, double price, int quantity) {
        if (itemCount < 10) {
            itemNames[itemCount] = itemName;
            prices[itemCount] = price;
            quantities[itemCount] = quantity;
            itemCount++;
            System.out.println(quantity + " x " + itemName + " added to cart.");
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    public void displayTotalCost() {
        double totalCost = 0;
        System.out.println("----Cart Details----");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(itemNames[i] + " = " + prices[i] + " x " + quantities[i] +  " : Rs" + (prices[i] * quantities[i]));
            totalCost += prices[i] * quantities[i];
        }
        System.out.println("Total cost: Rs" + totalCost);
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem();

        cart.addItem("berries", 0.99, 5);
        cart.addItem("grapes", 0.59, 3);
        cart.addItem("mango", 1.29, 2);

        cart.displayTotalCost();
    }
}
