// Write a class with the name Person. Three fields firstName, lastName, and age
// Write the following methods
// getters/setters for fields
// Method named isTeen it needs to return a value of true is the value age is > 12 and < 20, otherwise return false
// Method getFullName, return firstName + lastName
// If both strings are empty, return an empty string
// If one string is empty, return one or the other respectively
// Use .isEmpty() to check if the strings are empty
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 101) {
            this.age = age;
        } else {
            age = 0;
        }
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }
}
