package main.javafiles;

public class Customer {
    CustomerData customerData;
    Chequings chequings = null;
    Savings savings = null;
    Investment investment = null;


    public Customer(int customerId, String fName, String lName, String address, String postalCode, String phoneNumber, String email,
                    String gender, int creditCardScore) {
       customerData = new CustomerData(customerId, fName, lName, address, postalCode, phoneNumber, email, gender, creditCardScore);

    }

    public double accountsTotal() {
        double total = 0;
        if (chequings != null) {
            total += chequings.getBalance();
        }
        if (savings != null) {
            total += savings.getBalance();
        }
        if (investment != null) {
            total += investment.getBalance();
        }
        return total;
    }

    public Chequings createChequings(double balance, int accountNumber, String homeBranch) {
        if (chequings == null) {
            chequings = new Chequings(balance, accountNumber, homeBranch, this);
        }
        return chequings;
    }

    public Chequings getChequings() {
        return this.chequings;
    }

    public Savings createSavings(double balance, int accountNumber, String homeBranch) {
        if ( savings == null) {
            savings = new Savings(balance, accountNumber, homeBranch, this);
        }
        return savings;
    }

    public Savings getSavings() {
        return this.savings;
    }

    public Investment createInvestment(double balance, int accountNumber, String homeBranch, RiskLevel riskLevel) {
        if (investment == null) {
            investment = new Investment(accountNumber, homeBranch, balance, riskLevel);
        }
        return investment;
    }

    public Investment getInvestment() {
        return this.investment;
    }

}
