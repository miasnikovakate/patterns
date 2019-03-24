package com.epam.pattern;

import com.epam.pattern.creational.builder.ImmutableUser;

public class App {

    public static void main(String[] args) {
        ImmutableUser.UserBuilder userBuilder = new ImmutableUser.UserBuilder("shekhar", "password");
        ImmutableUser user = userBuilder
                .firstName("shekhar")
                .lastName("gulati")
                .email("shekhargulati84@gmail.com")
                .build();

        System.out.println(user);

        userBuilder.firstName("new firstname");

        System.out.println(user);
    }
}
