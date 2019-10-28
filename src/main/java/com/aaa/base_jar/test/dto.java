package com.aaa.base_jar.test;


import java.io.Serializable;

class dto implements Cloneable,Serializable{

    private String name="";
    private Integer age=0;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
