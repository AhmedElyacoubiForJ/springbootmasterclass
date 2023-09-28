package edu.yacoubi.springbootmasterclass.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerRepositorySwitcherConfiguration {

    @Value("${app.useCustomerRepositoryFakeImpl:false}")
    private Boolean useCustomerRepositoryFakeImpl;

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("Command line runner hurry up and do configurations");
        };
    }

    @Bean
    CustomerRepositoryInterface switchBetweenRepositories() {
        System.out.println("useCustomerRepositoryFakeImpl : " + useCustomerRepositoryFakeImpl);
        return useCustomerRepositoryFakeImpl ?
                new CustomerRepositoryFakeImpl() :
                new CustomerRepositoryImpl();
    }
}
