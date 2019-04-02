package com.epam.pattern.behavioral.state;

public class HungryState implements State {

    @Override
    public void play(Cat cat) {
        System.out.println("No! *bite*");
    }

    @Override
    public void eat(Cat cat) {
        cat.setState(new NormalState());
    }

    @Override
    public void pet(Cat cat) {
        System.out.println("Meow!");
    }

    @Override
    public void printMood() {
        System.out.println(this.getClass().getSimpleName() + " - Meow! Need food");
    }
}
