package com.epam.pattern.behavioral.state;

public interface State {
    void play(Cat cat);

    void eat(Cat cat);

    void pet(Cat cat);

    void printMood();
}
