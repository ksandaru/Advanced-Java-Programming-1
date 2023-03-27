package com.javapractice.test10;


//lamda is the implementation of a functional interface
//functional interface has only one abstract method

@FunctionalInterface
public interface FunctionalIntrfc {
    public abstract void greet(String name);

//    public abstract void hey(); >> dont write multiple methods

}
//now I implement the greet method inside the main method in main class

