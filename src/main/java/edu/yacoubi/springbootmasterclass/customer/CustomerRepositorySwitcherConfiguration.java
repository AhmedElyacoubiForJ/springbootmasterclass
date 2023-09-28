package edu.yacoubi.springbootmasterclass.customer;

import ch.qos.logback.core.net.SyslogConstants;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            System.out.println("Command line runner hurry up and do configurations");
        };
    }
}
