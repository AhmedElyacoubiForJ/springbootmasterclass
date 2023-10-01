package edu.yacoubi.springbootmasterclass.customer;

import edu.yacoubi.springbootmasterclass.infoapp.InfoApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class CustomerConfiguration {

    // we can overwrite application value properties
    // run with parameters

    @Value("${app.useCustomerRepositoryFakeImpl:false}")
    private Boolean useCustomerRepositoryFakeImpl;

    @Value("${info.company.name}")
    private String companyName;

    @Autowired
    private Environment environment;

    @Bean
    CommandLineRunner commandLineRunner(InfoApp infoApp) {
        return args -> {
            System.out.println("Command line runner hurry up and do configurations");
            System.out.println("Company name injected: " + companyName);
            System.out.println();

            System.out.println("Environment : ");
            System.out.println("\t" + environment.getProperty("info.company.name"));
            System.out.println("\t" + environment.getProperty("info.app.name"));
            System.out.println("\t" + environment.getProperty("info.app.description"));
            System.out.println("\t" + environment.getProperty("info.app.version"));

            System.out.println();
            System.out.println("InfoApp configuration class : ");
            System.out.println(infoApp);
            System.out.println("\t" + infoApp.getName());
            System.out.println("\t" + infoApp.getDescription());
            System.out.println("\t" + infoApp.getVersion());

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
