package main.javafiles.test;

import main.javafiles.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class junitTests {

    @Before
    public void setup() {

    }

    @Test
    public void createCustomerWithChequingShouldSucceed() {
        Customer customer = new Customer(1, "John", "Doe", "101 Ave",
                "t1t1t1", "4031011001", "johndoe@gmail.com", "m", 636);
        customer.createChequings(500, 1, "downtown");
        assertEquals(500, customer.getChequings().getBalance(), 0);
        assertEquals(500, customer.accountsTotal(), 0);
    }
}
