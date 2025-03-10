public class MobilePhone {
    // Attributes
    private final String brand;
    private final String model;
    private final double price;

    // Constructor
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display details of mobile phone
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: Rs " + price);
    }

    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 16 Pro Max", 175900);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy Z Fold6", 164999);

        // Display the details of mobile phone
        System.out.println("----Phone 1 details----");
        phone1.displayDetails();
        System.out.println("----Phone 2 details----");
        phone2.displayDetails();
    }
}
