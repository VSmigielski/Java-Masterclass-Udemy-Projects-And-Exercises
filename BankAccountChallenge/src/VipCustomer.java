// 3 fields: name, creditLimit, email
// Create 3 constructors
// 1st constructor should be empty with default values assigned
// 2nd should have 2 parameters/values and 1 defaulted field value
// 3rd should have all 3 fields to be saved

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("default name", 0, "default email");
    }

    public VipCustomer(String name, String email) {
        this(name, 0, email);
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
