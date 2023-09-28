package edu.yacoubi.springbootmasterclass.customer;

import java.util.Arrays;
import java.util.List;

//@Repository(value = "fake")
public class CustomerRepositoryFakeImpl implements CustomerRepositoryInterface {

    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "James Bond", "password123"),
                new Customer(2L, "Jamila Amigoscode", "123password")
        );
    }
}
