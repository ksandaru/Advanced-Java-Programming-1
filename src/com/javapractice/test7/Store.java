package com.javapractice.test7;

import java.util.LinkedList;
//queue first in first out...(use for resource allocation and de allocation)
public class Store {
    public static void main(String[] args){
        LinkedList<Customer> queue = new LinkedList<>();
        queue.add(new Customer("Sally"));
        queue.add(new Customer("Ben"));
        queue.add(new Customer("Emma"));
        queue.add(new Customer("Fred"));
        System.out.println(queue);
        serveCustomer(queue); //first serve first out: sally is served and remove sally
        System.out.println(queue);
    }

    static void serveCustomer(LinkedList<Customer> queue){
        Customer c = queue.poll();
        c.serve();
    }
}
