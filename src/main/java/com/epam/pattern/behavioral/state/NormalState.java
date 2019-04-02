package com.epam.pattern.behavioral.state;

public class NormalState implements State {

    @Override
    public void play(Cat cat) {
        cat.setState(new SleepyState());
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
        System.out.println(this.getClass().getSimpleName() + " - Fine! Thanks.");
    }
}
