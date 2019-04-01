package com.epam.pattern.creational.builder;

import java.util.Date;

public class User {
    private final String username;
    private final String password;
    private final String firstname;
    private final String lastname;
    private final String email;
    private final Date creationDate;

    public User(String username, String password, String firstname, String lastname, String email, Date creationDate) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.creationDate = creationDate;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
