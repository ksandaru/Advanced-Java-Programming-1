package com.javapractice.test4;
//principle can not be used with subtypes of lists
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args){
        Building building = new Building();
        Office office = new Office();
        build(building);
        build(office); //because office is a subtype of the building


        //when there are list of buildings, it can not be used list of offices. so can not pass list of offices
        //to printBuildings() method..
        List<Building> buildings =  new ArrayList<>();
        buildings.add(new Building()); // ok
        buildings.add(new Building()); // ok
        buildings.add(new Building()); // ok
        buildings.add(new Office()); // ok, because office is a subtype of building
        printBuildings(buildings); //ok


        List<Office> offices =  new ArrayList<>();
        buildings.add(new Office()); // ok
        buildings.add(new Office()); // ok
        buildings.add(new Office()); // ok
        buildings.add(new Office()); // ok, because office is a subtype of building
        printBuildings(offices); //bad,  because can not take List<Office> is subtype of  List<Building>


        }
        static void build(Building building){
            System.out.println("constructing a new " + building.toString());
    }
    static void printBuildings(List<Building> buildings){
        for (int i = 0; i < buildings.size(); i++) {
            System.out.println(i +1 +" : " + buildings.get(i).toString());
        }

    }
}
