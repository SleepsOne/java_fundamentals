package dev.lpa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

record Customer (String name, ArrayList<Double> transaction){
    public Customer(String name, Double initialDeposit){
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transaction.add(initialDeposit);
    }


}

class Bank{
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String customerName){
        for (Customer i : customers){
            if (i.name().equalsIgnoreCase(customerName)){
                return i;
            }
        }
        System.out.println(customerName + " was not found");
        return null;
    }

    public void adddNewCustomer(String customerName, double initialDeposit){
        if (getCustomer(customerName) == null){
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New customer added: " + customer);
        }
    }

    public void addTransaction(String name, double transactionAmount){
        Customer customer = getCustomer(name);
        if (customer != null) {
            customer.transaction().add(transactionAmount);
        }
    }

    public void printStatement(String name){
        Customer customer = getCustomer(name);
        if (customer == null) {
            return;
        }
        System.out.println("-".repeat(30));
        System.out.println("Customer name: " + customer.name());
        System.out.println("Transaction:");
        for (double d : customer.transaction()) {
            System.out.printf(("%-10.2f$  (%s)%n"), d, d < 0 ? "debit" : "credit");
        }




    }
}
public class Main {
    public static void main(String[] args) {
        Bank viettin = new Bank("Viettin Bank");
        viettin.adddNewCustomer("Duc", 1000);
        viettin.adddNewCustomer("Hop", 500);
        System.out.println(viettin);

        viettin.addTransaction("Duc", +2000);
        viettin.addTransaction("Duc", -50);
        viettin.addTransaction("hop", -100);

        viettin.printStatement("duc");
        viettin.printStatement("hoP");

        viettin.addTransaction("Lai", 1000);

        int day = new Random().nextInt(7);



    }
}
