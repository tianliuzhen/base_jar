package com.aaa.base_jar.test;

import java.util.ArrayList;
import java.util.List;

public class testA {
    public static void main(String[] args) {
        List<A> copy=new ArrayList <A>();
        List<A> src=new ArrayList< A>();
        //单独的属性复制
        A a=new A();
        a.setName("aa");
        //复杂的对象复制
        dto d=new dto();
        d.setName("dto_a");
        a.setDto(d);
        // list 对象复制
        List<dto> getDto=getDto();
        a.setList(getDto);
        src.add(a);
        for (int i = 0; i < src.size(); i++) {
            // 深复制
            copy.add((A)src.get(i).clone());
        }
//        copy.addAll(src); // 浅复制
        dto d2=new dto();
        d2.setName("bb");
        copy.get(0).setName("dto_b");
        copy.get(0).setDto(d2);
        copy.get(0).setList(changeDto());
        System.out.println(src.get(0).getName());
        System.out.println(src.get(0).getDto().getName());
        System.out.println(src.get(0).getList().get(0).getName());
    }
    public static List<dto> getDto(){
        List<dto> list=new ArrayList<>();
        dto d=new dto();
        d.setAge(11);
        d.setName("aa");
        list.add(d);
        return  list;
    }
    public static List<dto> changeDto(){
        List<dto> list=new ArrayList<>();
        dto d=new dto();
        d.setAge(22);
        d.setName("bb");
        list.add(d);
        return  list;
    }
}
