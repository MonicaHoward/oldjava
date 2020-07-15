package udemy_exercises.cell_phone;

class Contact {
    private String name;
    private String number;

    //Constructor
    public Contact(String contactName, String num) {
        name = contactName;
        number = num;
    }

    public String getName() {
        return name;
    }

    public String getNum() {
        return number;
    }

    public static Contact createContact(String name, String num) {
        return new Contact(name, num);
    }
}


/*
    - **Contact Class:**
        - Name
        - Phone number
        - saveContact()
        - modifyContact()
        - searchContact()
        - removeContact()
*/
