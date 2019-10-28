package com.aaa.base_jar.test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * description: 描述
 *
 * @author 田留振(liuzhen.tian @ haoxiaec.com)
 * @version 1.0
 * @date 2019/8/31
 */
public class test {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        List<dto> list=new ArrayList<>();
        dto d=new dto();
        d.setAge(11);
        d.setName("name");
        list.add(d);
      /*  dto d2=new dto();
        d2.setAge(12);
        d2.setName("name2");
        list.add(d2);*/
        List<dto> list2=deepCopy(list);
          change(list);
        for (dto dto : list2) {
            System.out.println(dto.getName());
        }
    }
    public static void change(List<dto> dtos){
        System.out.println("--------");
        List<dto> dtosw=new ArrayList<>();
        dtos.get(0).setName("tom");
        dtos.get(0).setAge(100);
        for (dto dto : dtosw) {

        }
    }
    public static <T> List<T> deepCopy(List<T> src) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(byteOut);
        out.writeObject(src);

        ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
        ObjectInputStream in = new ObjectInputStream(byteIn);
        @SuppressWarnings("unchecked")
        List<T> dest = (List<T>) in.readObject();
        return dest;
    }

}
