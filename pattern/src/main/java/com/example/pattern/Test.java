package com.example.pattern;

public class Test {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());
        BuildA buildA = new BuildA.Builder().setId(1).build();
        BuildB buildB = new BuildB(1, "king");



    }
}
