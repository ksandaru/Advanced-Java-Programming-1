package com.javapractice.test1;

import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
//        1. without generics
//        List names = new ArrayList();
//        names.add("John");
//        String name1 = (String) names.get(0);
//        System.out.println("first name is:" + name1);
//        names.add("8");
//        String num = (String) names.get(1);
//        System.out.println("first int is:" + num);

//        2. with generics
        List<String> names = new ArrayList<>();
        names.add("John");
        String name1 =  names.get(0);
        System.out.println("first name is:" + name1);
        names.add("7");
        String num = names.get(1);
        System.out.println("first int is:" + num);

    }
}