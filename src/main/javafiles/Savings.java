package main.javafiles;

public class Savings extends Account {

    public Savings(double balance, int accountNumber, String homeBranch, Customer customer) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.homeBranch = homeBranch;
        this.customer = customer;
    }

}
