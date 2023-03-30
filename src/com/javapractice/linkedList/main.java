package com.javapractice.linkedList;

//linkedlist search complexity > linear
//insert/delete complexity>> constant

//use for music lists, gps navigations
import java.util.LinkedList;

public class main {
    public static void main(String[] args){
        //create stack from a linkedlist(push, pop)
        LinkedList<String> stack = new LinkedList<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

        //create queue from a linkedlist(offer, poll)
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("W");
        queue.offer("X");
        queue.offer("Y");
        queue.offer("Z");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);

        //insert-delete middle items
        queue.add(1, "XX");
        System.out.println(queue);
        queue.remove(2);
        System.out.println(queue);

    }
}
