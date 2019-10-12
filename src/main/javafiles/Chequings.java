package main.javafiles;

public class Chequings extends Account {

    public Chequings(double balance, int accountNumber, String homeBranch, Customer customer) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.homeBranch = homeBranch;
        this.customer = customer;
    }

    public void makePurchase(double amount) {
        if (amount <= getBalance())
        this.balance = this.balance - amount;
    }

}
