package main.javafiles;

public class CustomerData {
    int customerId;
    String fName;
    String lName;
    String address;
    String postalCode;
    String phoneNumber;
    String email;
    String gender;
    int creditCardScore;

    public CustomerData(int customerId, String fName, String lName, String address, String postalCode, String phoneNumber, String email,
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
