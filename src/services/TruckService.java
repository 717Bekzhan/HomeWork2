package services;

import Models.Truck;
import repositories.TruckRepository;

import java.io.FileNotFoundException;
import java.util.List;

public class TruckService {
    private TruckRepository truckRepository;

    public TruckService () throws FileNotFoundException{
        truckRepository=new TruckRepository();

    }public List<Truck>findAllTrucks(){
        return truckRepository.getAllTrucks();
    }
}
