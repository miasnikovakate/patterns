package com.epam.pattern.creational.builder;

public class BuilderMain {

    public static void main(String[] args) {
        ImmutableUser.UserBuilder userBuilder = new ImmutableUser.UserBuilder("sherekhan", "password");
        ImmutableUser user = userBuilder
                .firstName("Shere")
                .lastName("Khan")
                .email("Shere.Khan@gmail.com")
                .build();

        System.out.println(user);

        userBuilder.firstName("new firstname");

        System.out.println(user);
    }
}
