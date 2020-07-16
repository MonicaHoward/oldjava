package udemy_exercises.cell_phone;

import java.util.ArrayList;

class CellPhone {
    private String number;
    private ArrayList<Contact> contacts;

    public CellPhone(String num) {
        number = num;
        contacts = new ArrayList<Contact>();
    }

    public void showContacts() {
        System.out.println("=====================");
        System.out.println("Contact List: ");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + " " + contacts.get(i).getName() + " | " + contacts.get(i).getNum());
        }
        System.out.println("=====================");
    }

    public void quit(){
        return;
    }

    public boolean addContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Error. Contact is already in contact list.");
            return false;
        }

        contacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact originalInfo, Contact updatedInfo) {
        int foundPosition = findContact(originalInfo);
        if (foundPosition < 0) {
            System.out.println("Error. " + originalInfo.getName() + " not found");
            return false;
        }
        this.contacts.set(foundPosition, updatedInfo);
        System.out.println(originalInfo.getName() + ", was replaced with " + updatedInfo.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found");
            return false;
        }
        contacts.remove(foundPosition);
        System.out.println(contact.getName() + ", has been removed");
        return true;

    }

    private int findContact(Contact contact) {
        return contacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return contacts.get(position);
        }
        return null;
    }


}

/*
**Cell Phone with Java Classes**
    - **CellPhone Class:**
        - Contact List
        - quit()
        - showContacts()
        - addContact()
        - updateContat()
        - removeContact()
        - searchContact()
      * **When adding or updating be sure to check if the contact already exists**
      * **Be sure not to expose the inner workings of the Arraylist to MobilePhone (use concepts of encapsulation to meet this requirement)**
*/
