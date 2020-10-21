package com.example.pattern;

public class Apples {
    String color;
    int weight;

    Apples(String color, int weight) {
        super();
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apples{" +
                "颜'" + color + '\'' +
                ", 重：" + weight +
                '}';
    }

}
