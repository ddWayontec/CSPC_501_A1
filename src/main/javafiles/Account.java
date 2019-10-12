package main.javafiles;

public class Account {
    double balance;
    int accountNumber;
    String homeBranch;
    Customer customer;

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
