package edu.yacoubi.springbootmasterclass.customer;

import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class CustomerRepositoryImpl implements CustomerRepositoryInterface {
    @Override
    public List<Customer> getCustomers() {
        // TODO connect to real db
        return Collections.emptyList();
    }
}
