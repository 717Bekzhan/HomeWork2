package repositories;

import Models.Truck;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import dto.TruckDto;
import dto.mapper.TruckDtoConverter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TruckRepository {
    Map<Integer, Truck> map = new HashMap<>();

    public TruckRepository() throws FileNotFoundException {
        Gson gson = new Gson();
        JsonReader jsonReader = new JsonReader(new FileReader("src/truck.json"));

        TruckDto[] trucks = gson.fromJson(jsonReader, TruckDto[].class);

        TruckDtoConverter truckDtoConverter = new TruckDtoConverter();

        for (TruckDto truckDto : trucks) {
            map.put(truckDto.getId(), truckDtoConverter.convert(truckDto));
        }

    }

    public List<Truck> getAllTrucks() {
        return map.values().stream().toList();

    }
}
