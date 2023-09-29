package edu.yacoubi.springbootmasterclass.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

// when we specified  a class as a component
// spring create an object with scope singleton design pattern
//@Component

// Service is also a component
// but is more specific for the application structure
// respectively architecture to annotate this class as a Service

@Service
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

    public Customer getCustomer(Long id) {
        return  getCustomers().stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst()
                .orElseThrow(
                        () -> new IllegalStateException("customer with " + id + " not found")
                );
    }
}
