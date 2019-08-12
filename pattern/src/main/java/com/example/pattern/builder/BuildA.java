package com.example.pattern.builder;

/**
 * 所有属性加final防止被修改，并且不提供修改方法，保证类的不可变性
 */
public class BuildA {

    /*
    必填属性
     */
    private final int id;
    private final String name;

    /*
    可选属性
     */
    private final String gender;
    private final String address;
    private final boolean isOk;
    private final String phone;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public boolean isOk() {
        return isOk;
    }

    public String getPhone() {
        return phone;
    }

    /*
    加protected使其构造方法只能被自身或子类调用
     */
    protected BuildA(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.gender = builder.gender;
        this.address = builder.address;
        this.isOk = builder.isOk;
        this.phone = builder.phone;
    }


    public static class Builder{
        /*
        方式一：必填项，加final，ide会提示必须赋值或在构造方法初始化，这样创建时就必须传值,必这种方式的Builder在创建时必须传值;
        方式二：如果想用不传值的，去掉Builder内的final,并要在build内对必填项做非空验证，抛异常
         */

        //第一种
//        private final int id ;
//        private final String name;

        //第二种
        private  int id ;
        private  String name;

        private String gender = "";
        private String address = "";
        private boolean isOk  = false;
        private String phone  = "";

        public Builder() {
        }

        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setOk(boolean ok) {
            isOk = ok;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }


        public BuildA build(){
            if (id==0 || name==null) throw new IllegalStateException("id or name is null");
            return new BuildA(this);
        }
    }


}
