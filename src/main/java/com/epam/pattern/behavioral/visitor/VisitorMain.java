package com.epam.pattern.behavioral.visitor;

import com.epam.pattern.behavioral.visitor.model.Monument;
import com.epam.pattern.behavioral.visitor.model.Museum;
import com.epam.pattern.behavioral.visitor.model.Place;
import com.epam.pattern.behavioral.visitor.model.Restaurant;

import java.util.Arrays;
import java.util.List;

public class VisitorMain {

    public static void main(String[] args) {
        final List<Place> places = Arrays.asList(
                new Restaurant("soup - 1$; bread - 0.5$"),
                new Museum("Some strange things", 5),
                new Monument(10, 3),
                new Museum("Some lovely things", 10)
        );

        Visitor visitor = new CheckInVisitor();

        for (Place place : places) {
            place.accept(visitor);
        }
    }

}
