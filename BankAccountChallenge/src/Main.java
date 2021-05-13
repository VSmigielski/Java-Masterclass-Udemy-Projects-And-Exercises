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

        BankAccount veroAccount = new BankAccount("Veronica", "v@gmail.com", "619-813-2184");

        System.out.println("Customer Name: " + veroAccount.getCustomerName() + " Customer Email: " + veroAccount.getEmail() +
                " Customer Phone Number: " + veroAccount.getPhoneNumber());

        VipCustomer vipCustomer = new VipCustomer();

        System.out.println("Name: " + vipCustomer.getName() + " Credit Limit: " + vipCustomer.getCreditLimit() +
                " Email: " + vipCustomer.getEmail());

        VipCustomer vipCustomer2 = new VipCustomer("Vero", "v@gmail.com");

        System.out.println("Name: " + vipCustomer2.getName() + " Credit Limit: " + vipCustomer2.getCreditLimit() +
                " Email: " + vipCustomer2.getEmail());

        VipCustomer vipCustomer3 = new VipCustomer("Veronica", 17000, "veronicasmigielski@gmail.com");

        System.out.println("Name: " + vipCustomer3.getName() + " Credit Limit: " + vipCustomer3.getCreditLimit() +
                " Email: " + vipCustomer3.getEmail());
    }
}
