package edu.yacoubi.springbootmasterclass.customer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class Customer {

    private final Long id;

    @NotBlank(message = "name cannot be empty")
    private final String name;

    @NotBlank(message = "password cannot be empty")
    @JsonProperty(
            access = JsonProperty.Access.WRITE_ONLY
    )
    private final String password;

    @NotBlank(message = "email cannot be empty")
    @Email // we can add also some regexp
    private final String email;

    Customer(Long id,
             String name,
             String password,
             String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    @JsonProperty("customer_id")
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
