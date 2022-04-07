package com.company;

import java.util.Arrays;

public class Driver {
    private int ID;
    private String name;
    Driver[]drivers={};

    public Driver() {
    }

    public Driver(int ID, String name) {
        this.ID = ID;
        this.name = name;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver[] getDrivers() {
        return drivers;
    }

    public void setDrivers(Driver[] drivers) {
        this.drivers = drivers;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", drivers=" + Arrays.toString(drivers) +
                '}';
    }
}
