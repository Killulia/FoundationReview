package com.example.pattern;

import com.example.pattern.builder.BuildA;
import com.example.pattern.factory.BenzFactory;
import com.example.pattern.proxy.Apple;
import com.example.pattern.proxy.Person;
import com.example.pattern.proxy.ProxyHandler;
import com.example.pattern.proxy.Sony;
import com.example.pattern.proxy.SonyProxy;
import com.example.pattern.singleInstance.Singleton;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        proxy();
    }

    /*
    代理
     */
    private static void proxy() {
        //静态代理
        Person person = new Person();
        SonyProxy sonyProxy = new SonyProxy(person);
//        sonyProxy.buySony();

        //动态代理(为实现了SONY和Apple的类进行代理即Person)
        ProxyHandler proxyHandler = new ProxyHandler(person);
        Sony sony = (Sony) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Sony.class}, proxyHandler);
        sony.buySony();
        Apple apple = (Apple) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Apple.class}, proxyHandler);
        apple.buyApple();

    }

    /*
    工厂
     */
    private static void factory() {
        //简单工厂
//        Car car = CarFactory.produce("Benz");
//        car.run();
        //正常工厂
        BenzFactory benzFactory = new BenzFactory();
        benzFactory.produce().run();
    }

    /*
     建造者
     */
    private static void builder() {
        BuildA buildA = new BuildA.Builder(1, "king").build();
        BuildA buildA1 = new BuildA.Builder()
                .setId(2)
                .setName("ramble")
                .setAddress("ccg")
                .build();
    }

    /*
    单例
     */
    private static void singleInstance() {

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());
    }
}
