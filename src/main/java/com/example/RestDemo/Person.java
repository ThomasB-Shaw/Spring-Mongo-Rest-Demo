package com.example.RestDemo;

import org.springframework.data.annotation.Id;

public class Person {

    @Id private String id;

    private String firstName;
    private String lastName;
    // Getter First Name
    public String getFirstName() {
        return firstName;
    }
    // Setter First Name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    // Getter Last Name
    public String getLastName() {
        return lastName;
    }
    // Setter Last Name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
