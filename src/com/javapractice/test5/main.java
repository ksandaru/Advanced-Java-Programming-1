package com.javapractice.test5;
//using wildcards in generic programming

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){

        //List of buildings
        List<Building> buildings =  new ArrayList<>();
        buildings.add(new Building()); // ok
        buildings.add(new Building()); // ok
        printBuildings(buildings); //ok


//        List of offices
        List<Office> offices =  new ArrayList<>();
        buildings.add(new Office()); // ok
        buildings.add(new Office()); // ok
        printBuildings(offices);  //bad: for 1 can not provide subtype offices to buildings, for 2 it works


        //        List of houses
        List<House> houses =  new ArrayList<>();
        buildings.add(new House()); // ok
        buildings.add(new House()); // ok
        printBuildings(houses);  //bad: for 1 can not provide subtype houses to buildings,  for 2 it works

        //2.ii
        addHouseToList(houses);
        addHouseToList(buildings);
        }

//    1. strictly should give buildings as parameter
//    static void printBuildings(List<Building> buildings){
//        for (int i = 0; i < buildings.size(); i++) {
//            System.out.println(i +1 +" : " + buildings.get(i).toString());
//        }
//        System.out.println();
//
//    }

//    2.i can give any subtype as parameter, wild card ? is useful here
//    (wild card can use to specify subtypes when there is just super type
//    and also for specifying supertype when there is just only a sub type)
    static void printBuildings(List<? extends Building> buildings){
        for (int i = 0; i < buildings.size(); i++) {
            System.out.println(i +1 +" : " + buildings.get(i).toString());
        }
        System.out.println();

    }
    //    2.ii can give any subtype as parameter, wild card ? is useful here
//    if I need to buildings to the house-list I should add this wild card ? and super.


//    static void  addHouseToList(List<House> buildings){
//        buildings.add(new House());
//        System.out.println();
//    }

    //here it is...
    static void  addHouseToList(List<? super House> buildings){
        buildings.add(new House());
        System.out.println();
    }
}
