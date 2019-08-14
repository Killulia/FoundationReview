package com.example.pattern.factory;

public abstract class CarFactory {

    /*
    简单工厂
     */
//    public static Car produce(String brand) {
//        Car car = null;
//        switch (brand) {
//            case "Benz":
//                car =  new Benz();
//            break;
//            case "Audi":
//                car =  new Audi();
//            break;
//            case "Bmw":
//                car =  new Bmw();
//            break;
//        }
//
//        return car;
//
//    }
    public abstract Car produce();


}
