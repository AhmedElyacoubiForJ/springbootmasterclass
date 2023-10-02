package edu.yacoubi.springbootmasterclass.customer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
// is a unit test and not an integration test
@DataJpaTest //to use customer repository without mocking
class CustomerServiceImplTest {

    @Autowired
    private CustomerRepository customerRepository;

    private CustomerServiceImpl underTest;

    @BeforeEach
    void setUp() {
        underTest = new CustomerServiceImpl(customerRepository);
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void itShouldGetCustomers() {
        // Given
        Customer jamila = new Customer(
                1L,
                "Jamila",
                "hello",
                "jamila@gmx.de"
        );
        Customer ali = new Customer(
                2L,
                "Ali",
                "hello",
                "ali@gmx.de"
        );
        customerRepository.saveAll(Arrays.asList(jamila,ali));

        // When
        List<Customer> customers = underTest.getCustomers();

        // Then
        assertEquals(2, customers.size());
    }

    @Test
    void itShouldGetCustomer() {
        // Given
        Customer jamila = new Customer(
                1L,
                "Jamila",
                "hello",
                "jamila@gmx.de"
        );
        customerRepository.save(jamila);

        // When
        Customer actual = underTest.getCustomer(1L);

        // Then
        assertEquals(1L, actual.getId());
        assertEquals("Jamila", actual.getName());
        assertEquals("hello", actual.getPassword());
        assertEquals("jamila@gmx.de", actual.getEmail());

    }
}