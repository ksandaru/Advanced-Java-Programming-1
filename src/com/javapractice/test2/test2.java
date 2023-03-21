package com.javapractice.test2;

import java.util.ArrayList;
import java.util.List;

public class test2 {
    static Character[] charArray = {'h','e','l','l','o'};
    static Integer[] intArray = {1,2,3,4,5};
    static Boolean[] boolArray = {true, false, true};

//   1. before generic type
//    public static List arrayTolist(Object[] array, List<Object> list ){
//        for (Object object:
//             array) {
//            list.add(object);
//        }
//        return list;
//    }



//    2.after generics
        public static <T> List<T> arrayTolist(T[] array, List<T> list ){
        for (T object:
             array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args){
        List<Character> charList= arrayTolist(charArray, new ArrayList<>());
        List<Integer> intList= arrayTolist(intArray, new ArrayList<>());
        List<Boolean> boolList= arrayTolist(boolArray, new ArrayList<>());
        System.out.println(charList);
        System.out.println(intList);
        System.out.println(boolList);

    }

}
