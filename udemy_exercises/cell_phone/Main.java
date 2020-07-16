package udemy_exercises.cell_phone;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static CellPhone cellPhone = new CellPhone("281-330-8004");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        while (!quit) {
            System.out.println("===============================");
            System.out.println("What would you like to do?");
            System.out.println("Press 1 to SHOW CONTACTS");
            System.out.println("Press 2 to ADD NEW CONTACT");
            System.out.println("Press 3 to UPDATE CONTACT");
            System.out.println("Press 4 to REMOVE CONTACT");
            System.out.println("Press 5 to SEARCH CONTACT");

            System.out.println("or Press 0 to QUIT");
            System.out.println("===============================");



            int action = scan.nextInt();
            scan.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Entering Quit Mode");
                    break;
                case 1:
                    cellPhone.showContacts();
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
                    searchContact();
                    break;
                default:
                    cellPhone.showContacts();
            }
        }
    }

    private static void addContact() {
        System.out.println("Name : ");
        String name = scan.nextLine();
        System.out.println("Enter Phone #: ");
        String phone = scan.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if (cellPhone.addContact(newContact)) {
            System.out.println("===============================");
            System.out.println("newContact added: " + name + " | " + phone);
            System.out.println("===============================");

        } else {
            System.out.println("===============================");
            System.out.println("Error. Contact " + name + " already exists");
            System.out.println("===============================");
        }
    }

    private static void updateContact() {
        System.out.println("===============================");
        System.out.println("Which contact would you like to update? ");
        System.out.println("===============================");

        String name = scan.nextLine();
        Contact existingContactRecord = cellPhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("===============================");
            System.out.println("Error. No contact with name " + name + " exits.");
            System.out.println("===============================");

            return;
        }
        System.out.println("Update contact name ");
        String newName = scan.nextLine();
        System.out.println("Update contact number ");
        String newNumber = scan.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (cellPhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Contact has been changed from " + existingContactRecord + " to " + newContact);
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scan.nextLine();
        Contact existingContactRecord = cellPhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found...");
            return;
        }
        if (cellPhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted contact");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void searchContact() {
        System.out.println("Enter existing contact name: ");
        String name = scan.nextLine();
        Contact existingContactRecord = cellPhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found...");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " Phone #: " + existingContactRecord.getNum());
    }

    private static void startPhone() {
        System.out.println("HELLO!");
    }

}
