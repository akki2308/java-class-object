public class BankAccount {
    private final String accountHolder;
    private final String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: Rs" + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: Rs" + balance);
    }

    // Main method for testing
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John", "1234567890", 500.00);
        BankAccount account2 = new BankAccount("Alice", "10293847465", 1275.90);
        BankAccount account3 = new BankAccount("Sam", "9876543201", 1400.00);

        System.out.println("-----Account 1 details-----");
        account1.displayBalance();
        account1.deposit(150.00);
        account1.displayBalance();
        System.out.println("\n-----Account 2 details-----");
        account2.displayBalance();
        account2.withdraw(100.00);
        account2.displayBalance();
        System.out.println("\n-----Account 3 details-----");
        account3.displayBalance();
        account3.withdraw(1500.00);
        account3.displayBalance();
    }
}
