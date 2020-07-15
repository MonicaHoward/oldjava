package bank;

import udemy_exercises.bank.Bank;

public class Main {
    public static void main(String[] args){

        Bank bank = new Bank("Chase");

        bank.addBranch("Downtown");


        bank.addCustomer("Downtown", "Monica", 5000);
        bank.addCustomer("Downtown", "Craig", 2700);
        bank.addCustomer("Downtown", "Xavier", 100000);

        bank.addBranch("Clearfork");
        bank.addCustomer("Clearfork", "Lauren", 30000);

        bank.addBranch("Southside");




        bank.addCustomerTransaction("Downtown", "Monica", 50000);
        bank.addCustomerTransaction("Downtown", "Xavier", -20000);
        bank.addCustomerTransaction("Clearfork", "Lauren", (int) 175.50);

        bank.listCustomers("Downtown", true);
        bank.listCustomers("Clearfork", true);

        bank.addBranch("Southside");


    }
}
