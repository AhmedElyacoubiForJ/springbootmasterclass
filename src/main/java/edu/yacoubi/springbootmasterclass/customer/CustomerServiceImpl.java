package edu.yacoubi.springbootmasterclass.customer;

import edu.yacoubi.springbootmasterclass.exception.NotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class CustomerServiceImpl {

    private final CustomerRepository repository;

    public List<Customer> getCustomers() {
        log.info("getCustomers() was called");
        return repository.findAll();
    }

    public Customer getCustomer(Long id) {
        return  repository.findById(id)
                .orElseThrow(
                        () -> {
                            String message = "customer with " + id + " not found";
                            NotFoundException notFoundException =
                                    new NotFoundException(message);
                            log.error("error in getting customer {}", id, notFoundException);
                            return notFoundException;
                        }
                );
    }
}
