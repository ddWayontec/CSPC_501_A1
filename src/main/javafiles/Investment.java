package main.javafiles;

import java.util.Random;

public class Investment extends Account {

    double interestRate;

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
