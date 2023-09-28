package edu.yacoubi.springbootmasterclass.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerService {

    private final CustomerRepositoryInterface repository;

    public CustomerService(
            //@Qualifier("fake")
            CustomerRepositoryInterface repository) {
        this.repository = repository;
    }

    public List<Customer> getCustomers() {
        return repository.getCustomers();
    }
}
