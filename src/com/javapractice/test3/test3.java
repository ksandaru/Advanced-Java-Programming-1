package com.javapractice.test3;

public class test3 {

    public static void main(String[] args){
//        ---- For 1 and 2-----
//        printShoppingList("Iphone XS", "iphone 13pro max");
//        printShoppingList("Iphone XS", "iphone 13pro max");

//        For 3
//        String[] items = {"bread", "Cake", "chocolate", "pastry", "noodles"};
//        printShoppingList(items);

//        For 4
        printShoppingList("bread", "Cake", "chocolate", "pastry", "noodles");
    }


//    1. can be only 2 arguments, should overload to increase argmnts
//    public static void printShoppingList(String string1, String string2){
//        System.out.println("Shoppping List");
//        System.out.println("1. "+ string1);
//        System.out.println("2. "+ string2);
//    }



//    2. overloaded the method, then 3 number of arguments (not good)
//    public static void printShoppingList(String string1, String string2, String string3){
//        System.out.println("Shoppping List");
//        System.out.println("1. "+ string1);
//        System.out.println("2. "+ string2);
//        System.out.println("3. "+ string3);
//    }



    //    3. then can have variable number of arguments (good)
//    public static void printShoppingList(String[] strings){
//        System.out.println("Shoppping List");
//        for (int i = 0; i < strings.length; i++) {
//            System.out.println(i+1+" :"+ strings[i]);
//        }
//        System.out.println();
//    }

//    4. better solution to have var args (functionally 3 and 4 methods are same)
public static void printShoppingList(String... strings){
    System.out.println("Shoppping List");
    for (int i = 0; i < strings.length; i++) {
        System.out.println(i+1+" :"+ strings[i]);
    }
    System.out.println();
}
}
