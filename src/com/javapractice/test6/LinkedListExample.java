package com.javapractice.test6;

import java.util.LinkedList;
//useful to insert or remove many items from middle of a list >> Linkedlist
//To get elements from a list easily faster >> ArrayList
//linked list take more memory than array lists.(have references to next and prev values)
// For most cases better choice is arraylist
public class LinkedListExample {

    public static void main( String[] args){
        LinkedList<String> myList = new LinkedList();
        myList.add("A");
        myList.add("B");
        myList.add(1, "C");
        System.out.println(myList);
        myList.remove(0);
        myList.remove("C");
        System.out.println(myList);

    }
}
