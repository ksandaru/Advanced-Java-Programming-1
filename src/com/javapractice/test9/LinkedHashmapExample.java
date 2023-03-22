package com.javapractice.test9;


//when I use LinkedHashMap, the order will be same

import java.util.LinkedHashMap;
import java.util.Map;
//I can use 3 arguments for  LinkedHashMap<>()
//LinkedHashMap<>(INITIAL CAPACITY OF MAP, LOAD FACTOR, ACCESS ORDER )

//4 >> create size 4 LinkedhashMap
//0.75f>> 75% bigger
// false >> make it created order | true: create it as access order


public class LinkedHashmapExample {

    public static void main(String[] args){
//        LinkedHashMap<String, Integer> phoneBook2 = new LinkedHashMap<>();
//        phoneBook2.put("Kevin", 34556);
//        phoneBook2.put("Sam", 6464747);
//        phoneBook2.put("Mary", 073423);
//        phoneBook2.put("Mary", 33); // mary will be overwritten byn 2nd value
//        phoneBook2.put(null, 7788);
//        System.out.println("Kevin's phone number: "+ phoneBook2.get("Kevin"));


        LinkedHashMap<String, Integer> phoneBook2 = new LinkedHashMap<>(4, 0.75f, true);
        phoneBook2.put("Kevin", 34556);
        phoneBook2.put("Sam", 6464747);
        phoneBook2.put("Mary", 073423);
        phoneBook2.put("Mary", 33); // mary will be overwritten byn 2nd value
        phoneBook2.put(null, 7788);
        System.out.println("Kevin's phone number: "+ phoneBook2.get("Kevin"));

        System.out.println("\nList of contacts in phonebook:");
        for (Map.Entry<String,Integer> entry:
                phoneBook2.entrySet()) {
            System.out.println(entry.getKey()+ " : "+ entry.getValue());
        }
    }
//here i accesssed kevin before others.
    //then accesssed to all at once, but there Kevin is at bottom,
    // Most recently accessed items will come to bottom..
    //longest time ago modified or created  entries come to top
    //Linkedhashmaps keep track the order of items
}
