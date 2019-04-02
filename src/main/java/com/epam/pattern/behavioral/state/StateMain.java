package com.epam.pattern.behavioral.state;

public class StateMain {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();

        cat.eat();
        cat.makeSound();

        cat.play();
        cat.makeSound();

        cat.pet();
        cat.makeSound();

        cat.eat();
        cat.makeSound();

        cat.pet();
        cat.makeSound();

        cat.play();
        cat.makeSound();
    }
}
