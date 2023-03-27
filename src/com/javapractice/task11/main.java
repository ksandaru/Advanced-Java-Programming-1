package com.javapractice.task11;

import com.javapractice.test10.FunctionalIntrfc;


public class main {
    public static void main(String[] args){
        //without lamda: anonymous func as task10
        FunctionalIntrfc functionalIntrfc1 = new FunctionalIntrfc() {
            @Override
            public void greet(String name) {
                System.out.println("Hello "+ name);
            }
        };
        functionalIntrfc1.greet("kanishka");


        //with lamda: new object and function using lamda
        FunctionalIntrfc functionalIntrfcwithLamda2 = (String name) -> {
            System.out.println("Hello "+ name);
        };
        functionalIntrfcwithLamda2.greet("kanishka");

        //MessagePrinter implementation
        MessagePrinter msgprint = () ->{
            System.out.println("message printed!!");
        };
        msgprint.printMessage();

    }
}
