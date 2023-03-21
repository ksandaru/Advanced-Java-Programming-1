package com.javapractice.test5;

//wildcard is an unknown type
public class Building {

    public int numberOfRooms = 7;

    @Override
    public String toString() {
        return "Building";
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
