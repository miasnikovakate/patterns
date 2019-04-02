package com.epam.pattern.creational.singleton;

public final class SingletonDoubleCheckLocking {
    private static volatile SingletonDoubleCheckLocking instance;

    private SingletonDoubleCheckLocking() {
    }

    public static SingletonDoubleCheckLocking getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheckLocking.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheckLocking();
                }
            }
        }
        return instance;
    }
}