package com.epam.pattern.behavioral.visitor.model;

import com.epam.pattern.behavioral.visitor.Visitor;

public class Restaurant implements Place{

    private String menu;

    public Restaurant(String menu) {
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
