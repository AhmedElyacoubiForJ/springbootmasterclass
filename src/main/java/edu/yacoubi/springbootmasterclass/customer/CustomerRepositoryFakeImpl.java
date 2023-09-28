package edu.yacoubi.springbootmasterclass.customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

//@Repository(value = "fake")
public class CustomerRepositoryFakeImpl implements CustomerRepositoryInterface {

    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "James Bond"),
                new Customer(2L, "Jamila Amigoscode")
        );
    }
}
