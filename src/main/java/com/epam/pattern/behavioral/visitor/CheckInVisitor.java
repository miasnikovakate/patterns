package com.epam.pattern.behavioral.visitor;

import com.epam.pattern.behavioral.visitor.model.Monument;
import com.epam.pattern.behavioral.visitor.model.Museum;
import com.epam.pattern.behavioral.visitor.model.Restaurant;

public class CheckInVisitor implements Visitor {

    @Override
    public void visit(Museum museum) {
        System.out.println(String.format("I'm in museum \"%s\". Ticket costs %d$.", museum.getName(), museum.getTicketPrice()));
    }

    @Override
    public void visit(Restaurant restaurant) {
        System.out.println(String.format("I'm in restaurant. A lot of delicious food in menu: %s.", restaurant.getMenu()));
    }

    @Override
    public void visit(Monument monument) {
        System.out.println(String.format("I'm near monument. Its coordinates is (%.1f, %.1f).", monument.getPositionX(), monument.getPositionY()));

    }
}
