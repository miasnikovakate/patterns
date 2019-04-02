package com.epam.pattern.behavioral.visitor.model;

import com.epam.pattern.behavioral.visitor.Visitor;

public class Museum implements Place {

    private String name;
    private int ticketPrice;

    public Museum(String name, int ticketPrice) {
        this.name = name;
        this.ticketPrice = ticketPrice;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
