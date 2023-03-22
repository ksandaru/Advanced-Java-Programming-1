package com.javapractice.test8;

import java.util.HashMap;

//store pair of values together..
//ex: phonebook>>> name is the key, phone number is the value
//hash maps are not ordered..store by content, not position
//do not allow for duplicate keys
//key can be null
//can use to search for a value
public class HashmapExample {
    public static void main(String[] args){
        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Kevin", 0774236);
        phoneBook.put("Sam", 6464747);
        phoneBook.put("Mary", 073423);
        phoneBook.put("Mary", 33); // mary will be overwritten byn 2nd value
        phoneBook.put(null, 7788);
        System.out.println(phoneBook);


        //search and remove
        if (phoneBook.containsKey("Kevin")) {
            phoneBook.remove("Kevin");
        }
        System.out.println(phoneBook);
        phoneBook.clear();
        System.out.println(phoneBook);

    }
}

//in these HashMaps , no guarantee to get back the values in same order i saved them.
//when I use LinkedHashMap, the order will be same