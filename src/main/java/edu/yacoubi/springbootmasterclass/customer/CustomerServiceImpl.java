package edu.yacoubi.springbootmasterclass.customer;

import edu.yacoubi.springbootmasterclass.exception.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl {
    private final CustomerRepository repository;

    public CustomerServiceImpl(
            CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> getCustomers() {
        return repository.findAll();
    }

    public Customer getCustomer(Long id) {
        return  repository.findById(id)
                .orElseThrow(
                        () -> new NotFoundException("customer with " + id + " not found")
                );
    }
}
