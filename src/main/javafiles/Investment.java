package main.javafiles;

public class Investment {

    double balance;
    int accountNumber;
    String homeBranch;
    InvestmentCalculator investmentCalculator;
    double interestRate;
    Customer customer;

    public Investment(int accountNumber, String homeBranch, double initialDeposit, RiskLevel riskLevel) {
        this.accountNumber = accountNumber;
        this.homeBranch = homeBranch;
        this.balance = initialDeposit;
        investmentCalculator = new InvestmentCalculator();
        setInterestRateBasedOnRiskLevel(riskLevel);
    }

    public void applyInterestRate() {
        //remove investmentCalculator.java and move methods to here
        double interestApplied = investmentCalculator.calculateInterestApplied(getBalance(), getInterestRate());
        depositFunds(interestApplied);
    }

    public void setInterestRateBasedOnRiskLevel(RiskLevel riskLevel) {
        if (riskLevel == RiskLevel.High) {
            this.interestRate = investmentCalculator.calculateHighRiskInterestRate();
        }
        else if (riskLevel == RiskLevel.Medium) {
            this.interestRate = investmentCalculator.calculateMediumRiskInterestRate();
        }
        else if (riskLevel == RiskLevel.Low) {
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
