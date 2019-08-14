package com.example.pattern.proxy;

public class Person implements Sony,Apple{
    @Override
    public void buySony() {
        System.out.println("person充值信仰");
    }

    @Override
    public void buyApple() {
        System.out.println("person买苹果");
    }
}
