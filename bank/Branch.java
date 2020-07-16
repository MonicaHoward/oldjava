package bank;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        name = branchName;
        customers = new ArrayList<Customer>();
    }

    public boolean newCustomer(String customerName, double initialDeposit) {
        return customers.add(new Customer(customerName, initialDeposit));
    }

    public boolean customerTransaction(String customerName, double amount) {
        return false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<bank.Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String customerName){
        for (int i = 0; i < this.customers.size(); i++){
            Customer checkedCustomer = this.customers.get(i);
                return checkedCustomer;
        }
        return null;
    }
}

/*
**Branch Class**:
     - addCustomer and initial transaction amount.
     - Also needs to add additional transactions for that customer/branch
*/

