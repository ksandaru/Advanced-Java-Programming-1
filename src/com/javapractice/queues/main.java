package com.javapractice.queues;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class main {

    //Queue = FIFO >> A line of people
    //process the items in a linear order
    //Real world: first come first serve billing machine for ticketing
    //printer queue (order of print jobs)
    //keyboard buffer (display in order of clicks)
    //we use queues in LinkedList and Priority Queues
public static void main(String[] args){
    Queue<String> queue = new LinkedList<>();
    queue.offer("Alison");
    queue.offer("Bob");
    queue.offer("Clark");
    queue.offer("Dikmen");
    System.out.println(queue);


    queue.poll();
    System.out.println(queue);


}

}
