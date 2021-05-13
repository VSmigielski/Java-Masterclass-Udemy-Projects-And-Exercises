public class Main {
    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount("12345", 0, "Bob Brown", "bob@gmail.com","123-456-7890");

        bobsAccount.withdraw(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdraw(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdraw(100.0);

        System.out.println("Account number: " + bobsAccount.getAccountNumber() + " Balance: " + bobsAccount.getBalance() +
                " Customer Name: " + bobsAccount.getCustomerName() + " Customer Email: " + bobsAccount.getEmail() +
                " Customer Phone Number: " + bobsAccount.getPhoneNumber());

    }
}
