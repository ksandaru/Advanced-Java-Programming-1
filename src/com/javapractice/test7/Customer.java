package com.javapractice.test7;

//implement Queues using linkedlists
//queues are better to control access to shared resources ex: CPU scheduling
//
public class Customer {

    private boolean hasBeenServed;
    private String name;

    public Customer( String name) {
        hasBeenServed = false;
        this.name = name;
    }

    public void serve(){
        hasBeenServed = true;
        System.out.println(name+" has been served");
    }

    @Override
    public String toString() {
        return name;
    }
}
