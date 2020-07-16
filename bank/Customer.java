package bank;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double initialDeposit) {
        name = customerName;
        transactions = new ArrayList<Double>();
        setTransaction(initialDeposit);
    }

    public void setTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

/*
- **Customer Class**:
- Customer Name
*/

