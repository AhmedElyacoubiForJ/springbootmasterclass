package edu.yacoubi.springbootmasterclass.customer;

import java.util.Collections;
import java.util.List;

// @Repository
// @Primary these annotation is not necessary.
// It will be treated through CustomerRepositorySwitcherConfiguration
public class CustomerRepositoryImpl implements CustomerRepositoryInterface {
    @Override
    public List<Customer> getCustomers() {
        // TODO connect to real db
        return Collections.singletonList(
                new Customer(1L, "TODO implement real db", "password", "email@gmx.de")
        );
    }
}
