public class CircleArea {
    // Attribute
    private final double radius;
    public double pi = Math.PI;

    // Constructor
    public CircleArea(double radius) {
        this.radius = radius;
    }

    // Method to calculate circumference of circle
    public double calculateCircumferenceOfCircle(double radius) {
        return 2 * pi * radius;
    }
    // Method to calculate area of circle
    public double calculateAreaOfCircle(double radius) {
        return pi * radius * radius;
    }

    // Method to display area and circumference of circle
    public void displayAreaAndCircumference() {
        System.out.println("Circumference: " + calculateCircumferenceOfCircle(radius));
        System.out.println("Area: " + calculateAreaOfCircle(radius));
    }
    public static void main(String[] args) {
        // Create objects of circle
        CircleArea circle1 = new CircleArea(7.5);
        CircleArea circle2 = new CircleArea(31.4);

        // Display results
        System.out.println("---Compute area of circle 1---");
        circle1.displayAreaAndCircumference();
        System.out.println("---Compute area of circle 1---");
        circle2.displayAreaAndCircumference();
    }
}
