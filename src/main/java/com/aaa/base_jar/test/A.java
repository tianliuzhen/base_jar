package com.aaa.base_jar.test;

import java.util.List;

public class A implements Cloneable {
    public String name;

    public List<dto> list;

    public List<com.aaa.base_jar.test.dto> getList() {
        return list;
    }

    public void setList(List<com.aaa.base_jar.test.dto> list) {
        this.list = list;
    }

    public com.aaa.base_jar.test.dto getDto() {
        return dto;
    }

    public void setDto(com.aaa.base_jar.test.dto dto) {
        this.dto = dto;
    }

    public dto dto;

    public A(){
        name=new String();
    }

    public Object clone() {
        A o = null;
        try {
            o = (A) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

