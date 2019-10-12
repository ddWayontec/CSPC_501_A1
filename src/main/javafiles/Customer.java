package main.javafiles;

public class Customer {
    String fName;
    String lName;
    String address;
    String postalCode;
    String phoneNumber;
    String email;
    String gender;
    int customerId;
    int creditCardScore;
    Chequings chequings = null;
    Savings savings = null;
    Investment investment = null;


    public Customer(int customerId, String fName, String lName, String address, String postalCode, String phoneNumber, String email,
                    String gender, int creditCardScore) {
        this.customerId = customerId;
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.creditCardScore = creditCardScore;
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

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfName() {
        return fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getlName() {
        return lName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setCreditCardScore(int creditCardScore) {
        this.creditCardScore = creditCardScore;
    }

    public int getCreditCardScore() {
        return creditCardScore;
    }

}
