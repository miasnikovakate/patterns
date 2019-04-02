package com.epam.pattern.creational.singleton;


public class SingletonMain {

    public static void main(String[] args) {
        try {
            SinglentonOnDemand.getInstance().printHello();
        } catch (Throwable e) {
            System.out.println("Something wrong: " + e);
        }
        SinglentonOnDemand.getInstance().printHello();
    }
}
