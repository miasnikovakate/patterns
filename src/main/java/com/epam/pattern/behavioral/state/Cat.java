package com.epam.pattern.behavioral.state;

public class Cat {

    private State state;

    public Cat() {
        state = new NormalState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void play() {
        System.out.println("Play action");
        state.play(this);
    }

    public void eat() {
        System.out.println("Eat action");
        state.eat(this);
    }

    public void pet() {
        System.out.println("Pet action");
        state.pet(this);
    }

    public void makeSound() {
        System.out.println("----Cat says----");
        state.printMood();
    }
}
