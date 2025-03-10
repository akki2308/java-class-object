public class BookDetails {
    // Attributes
    private final String title;
    private final String author;
    private final double price;

    // Constructor
    public BookDetails(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author name: " + author);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        // Creating objects of class BookDetails
        BookDetails book1 = new BookDetails("Harry Potter", "JK Rowling", 1000);
        BookDetails book2 = new BookDetails("Pride & Prejudice", "Jane Austen", 699);
        BookDetails book3 = new BookDetails("Lord of the Rings", "J.R.R Tolkien", 1599);

        // Display the details of every book
        System.out.println("----Book 1 details----");
        book1.displayBookDetails();
        System.out.println("----Book 2 details----");
        book2.displayBookDetails();
        System.out.println("----Book 3 details----");
        book3.displayBookDetails();
    }
}
