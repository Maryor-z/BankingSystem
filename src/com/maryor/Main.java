package com.maryor;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Nation australia bank");
        if (bank.addBranch("Adelaide")){
            System.out.println("Branch available");
        }
        bank.addCustomer("Adelaide", "Maryor", 1000000.0);
        bank.addCustomer("Adelaide", "Mary", 1050000.0);
        bank.addCustomer("Adelaide", "May", 10043200.0);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "bob", 15697.7);

        bank.addCustomerTransaction("Adelaide", "Maryor", 645789.67);
        bank.addCustomerTransaction("Adelaide", "Mary", 64578009.67);
        bank.addCustomerTransaction("Adelaide", "Mayo", 6578900.67);

        bank.listCustomer("Adelaide", true);
        bank.listCustomer("Sydney", true);

        bank.addBranch("Melbourne");
        if (!bank.addCustomer("Melbourne", "Brian", 5.5)) {
            System.out.println("branch doesnt exist");
        }
        bank.listCustomer("Melbourne", true);

        if(!bank.addBranch("Adelaide")) {
            System.out.println("branch already exist");
        }

        if (!bank.addCustomerTransaction("Adelaide", "Fergus", 676.8)) {
            System.out.println("Customer does not exist at the branch");
        }

    }

}
