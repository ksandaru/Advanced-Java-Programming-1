package com.javapractice.test10;

public class main {

    //now I implement the greet method inside the main method
    public static void main(String[] args){
        FunctionalIntrfc functionalIntrfc = new FunctionalIntrfc() {
            @Override
            public void greet(String name) {
                System.out.println("Hello "+ name);
            }
        };
        functionalIntrfc.greet("kanishka");
    }
}
//this way, programmers can pass code around as data
//then, I will use lamda to improve this functional intrface code in task 11