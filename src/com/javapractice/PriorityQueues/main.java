package com.javapractice.PriorityQueues;


import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//FIFO data structure>> but serve elements according to priority order(higher to lower)

//default: ascending
//Collections.reverseOrder() for descending
public class main {

    public static void main(String[] args){

        //doule
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(5.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while (!queue.isEmpty()){
            System.out.println(queue.poll()); //default ascending order
        }


        //string
        Queue<String> queue1 = new PriorityQueue<>(Collections.reverseOrder());
        queue1.offer("D");
        queue1.offer("C");
        queue1.offer("B");
        queue1.offer("A");
        queue1.offer("X");

        while (!queue1.isEmpty()){
            System.out.println(queue1.poll()); //default ascending order
        }
    }




}

