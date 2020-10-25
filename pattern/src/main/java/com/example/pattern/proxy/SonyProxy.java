package com.example.pattern.proxy;

public class SonyProxy implements Sony {

    Sony sony;

    public SonyProxy(Sony sony) {
        this.sony = sony;
    }

    @Override
    public void buySony() {
        System.out.println("SONY代理接单");
        sony.buySony();
        System.out.println("SONY代理订单完成");
    }
}
