public class InventoryOfItems {
    // Attributes
    private final String itemCode;
    private final String itemName;
    private final double price;

    // Constructor
    public InventoryOfItems(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to calculate total cost for given quantity
    public double totalCostOfItems(int quantity) {
        return price * quantity;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: Rs." + price);
    }

    public static void main(String[] args) {
        // Creating objects
        InventoryOfItems item1 = new InventoryOfItems("101", "Laptop", 750.50);
        InventoryOfItems item2 = new InventoryOfItems("102", "Phone", 500.00);

        // Displaying item details
        System.out.println("----Item 1 details----");
        item1.displayItemDetails();
        System.out.println("Total Cost for 2 units: Rs." + item1.totalCostOfItems(2));
        System.out.println();
        System.out.println("----Item 2 details----");
        item2.displayItemDetails();
        System.out.println("Total Cost for 3 units: Rs." + item2.totalCostOfItems(3));
    }
}
