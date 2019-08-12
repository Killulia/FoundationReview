package com.example.pattern;

import com.example.pattern.builder.BuildA;
import com.example.pattern.factory.Car;
import com.example.pattern.factory.CarFactory;
import com.example.pattern.singleInstance.Singleton;

public class Test {

    public static void main(String[] args) {
        /*
        单例
         */
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());
        /*
        建造者
         */
        BuildA buildA = new BuildA.Builder(1,"king").build();
        BuildA buildA1 = new BuildA.Builder()
                .setId(2)
                .setName("ramble")
                .setAddress("ccg")
                .build();
        /*
        简单工厂
         */
        Car car = CarFactory.produce("Benz");
        car.run();




    }
}
