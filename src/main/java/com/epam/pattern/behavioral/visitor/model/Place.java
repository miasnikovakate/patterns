package com.epam.pattern.behavioral.visitor.model;

import com.epam.pattern.behavioral.visitor.Visitor;

public interface Place {

    void accept(Visitor visitor);
}
