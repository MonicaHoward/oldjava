package udemy_exercises.bank;

import bank.Branch;
import bank.Customer;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<bank.Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public void addBranch(String branchName) {
        this.branches.add(new bank.Branch(branchName));
    }

    public boolean addCustomer(String branchName, String customerName, double initialDeposit) {
        Branch branch = getBranch(branchName);
        return branch.newCustomer(customerName, initialDeposit);
    }

    public boolean customerTransaction(String branchName, String customerName, double amount) {
        Branch branch = getBranch(branchName);
        return branch.customerTransaction(customerName, amount);

    }

    private Branch getBranch(String BranchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(BranchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public void listCustomers(String branchName, boolean showTransactions) {
        Branch branch = getBranch(branchName);
            System.out.println("===================");
            System.out.println("Customer Ledger");
            System.out.println(branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.print("Customer: ");
//                System.out.print(branchCustomer.getName(i));

                System.out.println("Transactions");
                ArrayList<Double> transactions = branchCustomer.getTransactions();
                for (int j = 0; j < transactions.size(); j++) {
                    System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                }

            }

    }

    public void addCustomerTransaction(String downtown, String monica, int i) {
    }
}


/*
**Banking w/ Java Classes**
   - **Bank class**
      - List of Branches
      - Add a new branch
      - Add a customer to that branch with initial transaction
      - Add a transaction for an existing customer for that branch
      - Show a list of customers for a particular branch and optionally a list of their transactions
   - Demonstration autoboxing and unboxing in your code
   - Think about where you are adding the code to perform certain actions
   - **Branch class**
     - List of Customers
     - List of Transactions
   - **Customer Class**:
     - Customer Name
   - **Branch Class**:
     - addCustomer and initial transaction amount.
     - Also needs to add additional transactions for that customer/branch
   - **Bank:**
     
*/