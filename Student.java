public class Student {
    // Attributes
    private final String name;
    private final String rollNumber;
    private final double marks;

    // Constructor
    public Student(String name, String rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade of the student
    public char calculateGrade(double marks) {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else if (marks >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        char grade = calculateGrade(marks);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Akshit", "001", 85);
        Student s2 = new Student("Harsh", "002", 45);
        Student s3 = new Student("Harshit+","003", 90);

        // Display the details of student
        System.out.println("----Student 1 details----");
        s1.displayDetails();
        System.out.println("----Student 2 details----");
        s2.displayDetails();
        System.out.println("----Student 3 details----");
        s3.displayDetails();
    }
}
