package Models;

import enums.State;

public class Truck {
    private int ID;
    private String name;
    String driver1;
    State state;
    Driver driver;

    public Truck() {
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

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }public static Truck makeTruck (int ID,String name,String driver1,State state) {
        Truck truck = new Truck();
        truck.ID=ID;
        truck.driver1=driver1;
        truck.name=name;
        truck.state=state;
        return truck;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", driver1='" + driver1 + '\'' +
                ", state=" + state +
                ", driver=" + driver +
                '}';
    }
}
