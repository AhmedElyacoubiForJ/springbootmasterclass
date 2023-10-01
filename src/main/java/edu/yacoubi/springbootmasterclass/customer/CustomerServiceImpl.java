package edu.yacoubi.springbootmasterclass.customer;

import edu.yacoubi.springbootmasterclass.exception.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl {

    private final static Logger LOGGER =
            LoggerFactory.getLogger(CustomerServiceImpl.class);

    private final CustomerRepository repository;

    public CustomerServiceImpl(
            CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> getCustomers() {
        LOGGER.info("getCustomers() was called");
        return repository.findAll();
    }

    public Customer getCustomer(Long id) {
        return  repository.findById(id)
                .orElseThrow(
                        () -> {
                            String message = "customer with " + id + " not found";
                            NotFoundException notFoundException =
                                    new NotFoundException(message);
                            LOGGER.error("error in getting customer {}", id, notFoundException);
                            return notFoundException;
                        }
                );
    }
}
