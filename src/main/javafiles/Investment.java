package main.javafiles;

public class Investment {

    double balance;
    int accountNumber;
    String homeBranch;
    InvestmentCalculator investmentCalculator;
    double interestRate;
    Customer customer;

    public Investment(int accountNumber, String homeBranch, double initialDeposit, int riskLevel) {
        this.accountNumber = accountNumber;
        this.homeBranch = homeBranch;
        this.balance = initialDeposit;
        //calculate and set interest rate of investment based on risk level
        rLvl(riskLevel);
    }

    public void applyInterestRate() {
        //remove investmentCalculator.java and move methods to here
        double interestApplied = investmentCalculator.calculateInterestApplied(getBalance(), getInterestRate());
        depositFunds(interestApplied);
    }

    //set risk level interest using main.RiskLevel enum
    public void rLvl(int rl) {
        if (rl == 2) {
            this.interestRate = investmentCalculator.calculateHighRiskInterestRate();
        }
        else if (rl == 1) {
            this.interestRate = investmentCalculator.calculateMediumRiskInterestRate();
        }
        else if (rl == 0) {
            this.interestRate = investmentCalculator.calculateLowRiskInterestRate();
        }
    }

    public double getInterestRate() {
        return interestRate;
    }

    //data class refactor - move to account.java
    public void depositFunds(double amount) {
        this.balance += amount;
    }

    public void withdrawFunds(double amount) {
        this.balance -= amount;
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
