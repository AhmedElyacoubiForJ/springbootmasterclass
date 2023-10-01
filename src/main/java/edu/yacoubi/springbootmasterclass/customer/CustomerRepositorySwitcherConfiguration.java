package edu.yacoubi.springbootmasterclass.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class CustomerRepositorySwitcherConfiguration {

    // we can overwrite application value properties
    // run with parameters

    @Value("${app.useCustomerRepositoryFakeImpl:false}")
    private Boolean useCustomerRepositoryFakeImpl;

    @Value("${info.company.name}")
    private String companyName;

    @Autowired
    private Environment environment;

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("Command line runner hurry up and do configurations");
            System.out.println("Company name injected: " + companyName);
            System.out.println();
            System.out.println("Environment : ");
            System.out.println("\t" + environment.getProperty("info.company.name"));
            System.out.println("\t" + environment.getProperty("info.app.name"));
            System.out.println("\t" + environment.getProperty("info.app.description"));
            System.out.println("\t" + environment.getProperty("info.app.version"));







            //System.out.println("Environment : " + environment);
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
