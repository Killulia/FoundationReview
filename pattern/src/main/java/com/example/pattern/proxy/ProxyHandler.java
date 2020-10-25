package com.example.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {

    private Object object;

    public ProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        System.out.println("动态代理开始");
        Object result = method.invoke(object,objects);
        System.out.println("动态代理结束");
        return result;
    }
}
