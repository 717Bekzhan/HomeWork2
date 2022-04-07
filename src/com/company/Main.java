package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;



public class Main {
    public static final GsonBuilder builder = new GsonBuilder();
    public static final Gson gson = builder.setPrettyPrinting().create();
    public static final Path PATH =Paths.get("./src/truck.json");
    public static void main(String[] args) {
        Truck[] truck = new Truck[]{
                Truck.makeTruck(1, "Volvo", " ", State.ON_THE_BASE),
                Truck.makeTruck(2, "Daf", "", State.ON_THE_BASE),
                Truck.makeTruck(3, "Renault", "", State.ON_THE_BASE)
        };
        String json = gson.toJson(truck);
        System.out.println(json);
        Truck truck1 = new Truck();
        

    }

    public static void writeTrucks(String obj) {
        try {
            Path write = Paths.get(String.valueOf(PATH));
            Files.writeString(write, obj, StandardOpenOption.WRITE, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
