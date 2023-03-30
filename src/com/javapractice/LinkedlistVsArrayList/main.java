package com.javapractice.LinkedlistVsArrayList;

// sometimes it will take less time for araylist to delete or insert item from middle, it depends on array size and
//the number of shifting elements, if the removing or inserting location is near to end or start,
//then also it will take less time..
//(the time sometimes depend on implementation and hardware performance also)
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class main {

    public static void main(String[] args){
        //define an ArrayList and a LinkedList
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        //insert items for arraylist
        long start1 = System.currentTimeMillis();
        for(int i = 0; i < 100 ; i++){
            arrayList.add("x"+i);
        }
        long end1 = System.currentTimeMillis();

        //duration1
        long duration1 = end1 - start1;
        System.out.println("Time taken for arraylist insert: " + duration1 + " milliseconds");


        //insert items for linkedlist
        long start2 = System.currentTimeMillis();
        for(int j = 0; j < 100; j++){
            linkedList.add("y"+j);
        }
        long end2 = System.currentTimeMillis();

        //duration2
        long duration2 = end2 - start2;
        System.out.println("Time taken for linkedlist insert : " + duration2 + " milliseconds");



        //insert to middle of arraylist
        long start3 = System.nanoTime();
        arrayList.add(30, "hello");
        long end3 = System.nanoTime();

        //duration3
        long duration3 = end3 - start3;
        System.out.println("Time taken for arraylist to insert for 30th : " + duration3 + " nanoseconds");

        //insert to middle of linkedlist
        long start4 = System.nanoTime();
        linkedList.add(30,"hello");
        long end4 = System.nanoTime();

        //duration4
        long duration4 = end4 - start4;
        System.out.println("Time taken for linkedlist to insert for 30th : " + duration4 + " nanoseconds");

        //delete from middle arraylist
        long start5 = System.nanoTime();
        arrayList.remove("hello");
        long end5 = System.nanoTime();

        //duration5
        long duration5 = end5 - start5;
        System.out.println("Time taken for arraylist delete 60th : " + duration5 + " nanoseconds");

        //delete from middle linkdlist
        long start6 = System.nanoTime();
        linkedList.remove("hello");
        long end6 = System.nanoTime();

        //duration6
        long duration6 = end6 - start6;
        System.out.println("Time taken for linkedlist delete 60th : " + duration6 + " nanoseconds");


        //get from arraylist
        long start7 = System.nanoTime();
        arrayList.get(0);
        long end7 = System.nanoTime();

        //duration7
        long duration7 = end7 - start7;
        System.out.println("Time taken for arraylist get first elemnt : " + duration7 + " nanoseconds");

        //get from linkdlist
        long start8 = System.nanoTime();
        linkedList.get(0);
        long end8 = System.nanoTime();

        //duration8
        long duration8 = end8 - start8;
        System.out.println("Time taken for linkedlist get first elemnt : " + duration8 + " nanoseconds");

    }

}
