package com.javapractice.task12;

public class Square {
    int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public  int calculateArea(){
        return sideLength *sideLength;
    }
}
