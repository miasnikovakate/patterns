package com.epam.pattern.creational.singleton;

public final class SinglentonOnDemand {
    private SinglentonOnDemand() {
    }

    private static class SingletonHolder {
        private static final SinglentonOnDemand INSTANCE = new SinglentonOnDemand();
    }

    public static SinglentonOnDemand getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void printHello(){
        System.out.println("Hello!");
    }
}