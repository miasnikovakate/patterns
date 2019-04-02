package com.epam.pattern.behavioral.state;

public class SleepyState implements State {

    @Override
    public void play(Cat cat) {
        System.out.println("*no reaction*");
    }

    @Override
    public void eat(Cat cat) {
        cat.setState(new SleepyState());
    }

    @Override
    public void pet(Cat cat) {
        cat.setState(new HungryState());
    }

    @Override
    public void printMood() {
        System.out.println(this.getClass().getSimpleName() + " - Don't disturb");
    }
}
