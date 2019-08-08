package com.example.pattern;

public class BuildA {

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

    public BuildA(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public static class Builder{

        private int id ;
        private String name;

        public int getId() {
            return id;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public BuildA build(){
            if (id==0 || name==null){

            }

            return new BuildA(this);
        }
    }


}
