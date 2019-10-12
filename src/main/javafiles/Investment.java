package main.javafiles;

import java.util.Random;

public class Investment {

    double balance;
    int accountNumber;
    String homeBranch;
    double interestRate;
    Customer customer;

    public Investment(int accountNumber, String homeBranch, double initialDeposit, RiskLevel riskLevel) {
        this.accountNumber = accountNumber;
        this.homeBranch = homeBranch;
        this.balance = initialDeposit;
        setInterestRateBasedOnRiskLevel(riskLevel);
    }

    public void applyInterestRate() {
        //remove investmentCalculator.java and move methods to here
        double interestApplied = calculateInterestApplied(getBalance(), getInterestRate());
        depositFunds(interestApplied);
    }

    public void setInterestRateBasedOnRiskLevel(RiskLevel riskLevel) {
        if (riskLevel == RiskLevel.High) {
            this.interestRate = calculateHighRiskInterestRate();
        }
        else if (riskLevel == RiskLevel.Medium) {
            this.interestRate = calculateMediumRiskInterestRate();
        }
        else if (riskLevel == RiskLevel.Low) {
            this.interestRate = calculateLowRiskInterestRate();
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

    public double calculateInterestApplied(double balance, double interestRate) {
        return (balance * interestRate);
    }

    public double calculateLowRiskInterestRate() {
        Random randomNum = new Random();
        return (randomNum.nextDouble() - 0.5) * 5;
    }

    public double calculateMediumRiskInterestRate() {
        Random randomNum = new Random();
        return (randomNum.nextDouble() - 0.5) * 10;
    }

    public double calculateHighRiskInterestRate() {
        Random randomNum = new Random();
        return (randomNum.nextDouble() - 0.5) * 20;
    }

}
