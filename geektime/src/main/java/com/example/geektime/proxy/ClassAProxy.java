package com.example.geektime.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ClassAProxy implements InvocationHandler {

    private Object object;

    public ClassAProxy(Object object) {
        this.object = object;
    }

    //核心部分
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        System.out.println("before");

        Object result = method.invoke(object, objects);

        System.out.println("after");

        return result;
    }
}
