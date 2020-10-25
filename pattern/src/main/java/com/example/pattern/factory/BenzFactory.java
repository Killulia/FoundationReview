package com.example.pattern.factory;

public class BenzFactory extends CarFactory {
    @Override
    public Car produce() {
        return new Benz();
    }
}
