package main.javafiles.test;

import main.javafiles.Customer;
import main.javafiles.RiskLevel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class junitTests {

    @Before
    public void setup() {

    }

    @Test
    public void createCustomerWithChequingsShouldSucceed() {
        Customer customer = new Customer(1, "John", "Doe", "101 Ave",
                "t1t1t1", "4031011001", "johndoe@gmail.com", "m", 636);
        customer.createChequings(500, 1, "downtown");

        assertEquals(500, customer.getChequings().getBalance(), 0);
        assertEquals(500, customer.accountsTotal(), 0);
    }

    @Test
    public void createCustomerWithSavingsShouldSucceed() {
        Customer customer = new Customer(1, "John", "Doe", "101 Ave",
                "t1t1t1", "4031011001", "johndoe@gmail.com", "m", 636);
        customer.createSavings(500, 1, "downtown");

        assertEquals(500, customer.getSavings().getBalance(), 0);
        assertEquals(500, customer.accountsTotal(), 0);
    }

    @Test
    public void createCustomerWithAllAccountsShouldSucceed() {
        Customer customer = new Customer(1, "John", "Doe", "101 Ave",
                "t1t1t1", "4031011001", "johndoe@gmail.com", "m", 636);
        customer.createInvestment(500, 1, "downtown", RiskLevel.High);
        customer.createChequings(500, 1, "downtown");
        customer.createSavings(500, 1, "downtown");
        assertEquals(1500, customer.accountsTotal(), 0);
    }

    @Test
    public void createCustomerWithInvestmentShouldSucceed() {
        Customer customer = new Customer(1, "John", "Doe", "101 Ave",
                "t1t1t1", "4031011001", "johndoe@gmail.com", "m", 636);
        customer.createInvestment(500, 1, "downtown", RiskLevel.Medium);
        assertEquals(500, customer.getInvestment().getBalance(), 0);
        assertEquals(500, customer.accountsTotal(), 0);
    }

    @Test
    public void createCustomerGetDataShouldSucceed() {
        Customer customer = new Customer(1, "John", "Doe", "101 Ave",
                "t1t1t1", "4031011001", "johndoe@gmail.com", "m", 636);

        assertEquals("John", customer.getfName());
        assertEquals(636, customer.getCreditCardScore());
    }
}
