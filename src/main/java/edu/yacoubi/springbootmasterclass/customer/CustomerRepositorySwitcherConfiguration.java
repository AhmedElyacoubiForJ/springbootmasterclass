package edu.yacoubi.springbootmasterclass.customer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerRepositorySwitcherConfiguration {

    // we can overwrite application value properties
    // run with parameters

    @Value("${app.useCustomerRepositoryFakeImpl:false}")
    private Boolean useCustomerRepositoryFakeImpl;

    @Value("${info.company.name}")
    private String companyName;

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("Command line runner hurry up and do configurations");
            System.out.println("Company name : " + companyName);
        };
    }

    @Bean
    CustomerRepositoryInterface switchBetweenRepositories() {
        System.out.println("useCustomerRepositoryFakeImpl : " + useCustomerRepositoryFakeImpl);
//        return useCustomerRepositoryFakeImpl ?
//                new CustomerRepositoryFakeImpl() :
//                new CustomerRepositoryImpl();
        return new CustomerRepositoryFakeImpl();
    }
}
