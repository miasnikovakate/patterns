package com.epam.pattern.behavioral.visitor;

import com.epam.pattern.behavioral.visitor.model.Monument;
import com.epam.pattern.behavioral.visitor.model.Museum;
import com.epam.pattern.behavioral.visitor.model.Place;
import com.epam.pattern.behavioral.visitor.model.Restaurant;

public interface Visitor {
    void visit(Museum museum);
    void visit(Restaurant restaurant);
    void visit(Monument monument);
    default void visit(Place place){
        System.out.println("I'm plaaaaaace");
    }
}
