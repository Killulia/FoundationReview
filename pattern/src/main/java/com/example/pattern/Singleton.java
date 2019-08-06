package com.example.pattern;

public class Singleton {

    private static Singleton instance;

    private Singleton() { }

    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    @Override
    public int hashCode() {
        return 9999;
    }
}
