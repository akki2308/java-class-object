public class EmployeeDetails {
    // Attributes
    private final String name;
    private final int emp_id;
    private final double salary;

    // Constructor
    public EmployeeDetails(String name, int emp_id, double salary){
        this.name = name;
        this.emp_id = emp_id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + emp_id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // Create objects of employee details
        EmployeeDetails emp1 = new EmployeeDetails("Akshit", 1, 300000000);
        EmployeeDetails emp2 = new EmployeeDetails("Yagyata", 2, 3005258000);

        // Display details of each employee
        System.out.println("----Employee 1 details----");
        emp1.displayEmployeeDetails();
        System.out.println("----Employee 2 details----");
        emp2.displayEmployeeDetails();

    }

}
