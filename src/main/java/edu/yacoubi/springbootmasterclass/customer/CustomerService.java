package edu.yacoubi.springbootmasterclass.customer;

import org.springframework.stereotype.Component;

@Component
public class CustomerService {
    public Customer getCustomer() {
        return new Customer(1L, "Joe");
    }
}
