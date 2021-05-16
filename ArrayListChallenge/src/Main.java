import java.util.Scanner;

public class Main {
// Create a program that implements a simple mobile phone with the following capabilities
    // Able to store, modify, remove and query contact names
    // You will want to create a separate class for Contacts (name and phone number)
    // Create a master class (MobilePhone) that holds ArrayList of Contacts
    // The mobile phone class has the functionality listed above
    // Add a menu and options that are available
    // Options: quit, print list of contacts, add new contact, update existing contact, remove contact and search/find contact
    // When adding or updating be sure to check if the contact already exists (use name)
    // be sure not to expose the inner workings of the arraylist to mobilephone
    // e.g. no ints, no .get(i) etc
    // MobilePhone should do everything with Contact objects only

    private static Scanner s = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("619-813-2184");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printInstructions();
                    break;
            }
        }
    }

    private static void printInstructions() {
        System.out.println("\nAvailable Actions -- Press");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t 0 - To shutdown.");
        System.out.println("\t 1 - To print contacts.");
        System.out.println("\t 2 - To add a new contact.");
        System.out.println("\t 3 - To update an existing contact.");
        System.out.println("\t 4 - To remove an existing contact.");
        System.out.println("\t 5 - To search if a contact exists");
        System.out.println("\t 6 - To show available actions.");
    }

    private static void printContacts() {
        System.out.println("Contact List: ");
        mobilePhone.printContactList();
    }

    private static void addContact() {
        System.out.println("Enter new contact name: ");
        String name = s.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = s.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if (mobilePhone.addContact(newContact)) {
            System.out.println("New contact added! Name: " + name + ", Number: " + phoneNumber);
        } else {
            System.out.println("Cannot add! " + name + " is already on file.");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = s.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
        }

        System.out.println("Enter new contact name: ");
        String newName = s.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = s.nextLine();

        Contact newContact = Contact.createContact(newName, newNumber);
         if (mobilePhone.updateContact(existingContactRecord, newContact)) {
             System.out.println("Successfully updated record!");
         } else {
             System.out.println("Error updating record.");
         }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = s.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
        } else {
            if (mobilePhone.removeContact(existingContactRecord)) {
                System.out.println("Successfully deleted the contact.");
            } else {
                System.out.println("Error deleting the contact.");
            }
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = s.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);

        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println("Name: " + existingContactRecord.getName() + " Number: " + existingContactRecord.getPhoneNumber());
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

}
