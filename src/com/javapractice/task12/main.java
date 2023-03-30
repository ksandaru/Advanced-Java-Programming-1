package com.javapractice.task12;
//I use method reference here
public class main {
    public static void main(String[] args){

        Square square = new Square(20);

//         1. use of lamda, not good
//        Shapes shapes = (Square square1) ->{
//            return square1.calculateArea();
//        };


        //2. use method reference,good
        Shapes shapes = Square::calculateArea;

        System.out.println("Area is: "+shapes.getArea(square)); //common line

    }

}
