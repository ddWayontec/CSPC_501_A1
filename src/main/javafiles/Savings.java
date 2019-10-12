package main.javafiles;

public class Savings {

    double balance;
    int accountNumber;
    String homeBranch;
    Customer customer;

    public Savings(double balance, int accountNumber, String homeBranch, Customer customer) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.homeBranch = homeBranch;
        this.customer = customer;
    }

    public void depositFunds(double amount) {
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setHomeBranch(String homeBranch) {
        this.homeBranch = homeBranch;
    }

    public String getHomeBranch() {
        return homeBranch;
    }

}
