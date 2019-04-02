package com.epam.pattern.behavioral.visitor.model;

import com.epam.pattern.behavioral.visitor.Visitor;

public class Monument implements Place {

    private double positionX;
    private double positionY;

    public Monument(double positionX, double positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public double getPositionX() {
        return positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
