// Create fields for the accountNumber, balance, customerName, email, and phoneNumber
// Create getters/setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field)
// 2. To allow the customer to withdraw funds. This should deduct from the balance field, but not allow withdrawal to complete
// if there are insufficient funds.
// Add some sout in the two methods above as well
public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        // Calling a constructor with another constructor (must be first line/statement)
        this("56789", 2.50, "Default name", "Default address", "default phone");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositValue) {
        balance += depositValue;
        System.out.println("This is your new balance: " + balance);
    }

    public void withdraw(double withdrawValue) {
        if ((balance - withdrawValue) < 0) {
            System.out.println("You do not have sufficient funds. Your current balance is: " + balance);
        } else {
            balance -= withdrawValue;
            System.out.println("This is your new balance: " + balance);
        }
    }
}
