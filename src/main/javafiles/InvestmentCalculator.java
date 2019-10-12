package main.javafiles;

import java.util.Random;

public class InvestmentCalculator {


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
