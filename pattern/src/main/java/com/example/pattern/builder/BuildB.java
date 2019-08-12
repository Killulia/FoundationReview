package com.example.pattern.builder;

public class BuildB {
    /*
   必填属性
    */
    private int id;
    private String name;

    /*
    可选属性
     */
    private String gender;
    private String address;
    private boolean isOk;
    private String phone;

    public BuildB(int id, String name) {

        this(id, name, "male");
    }

    public BuildB(int id, String name, String gender) {
        this(id, name, "male","ccg");
    }

    public BuildB(int id, String name, String gender, String address) {
        this(id, name, "male","ccg",false);
    }

    public BuildB(int id, String name, String gender, String address, boolean isOk) {
        this(id, name, "male","ccg",false,"123456798");
    }

    public BuildB(int id, String name, String gender, String address, boolean isOk, String phone) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.isOk = isOk;
        this.phone = phone;
    }
}
