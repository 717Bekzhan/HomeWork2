package dto.mapper;

import Models.Truck;
import com.google.common.base.Converter;
import dto.TruckDto;
import enums.State;

import javax.swing.table.TableStringConverter;
import java.io.*;

public class TruckDtoConverter extends Converter<TruckDto, Truck> {
    @Override
    protected Truck doForward(TruckDto truckDto) {
        Truck truck = new Truck();
        truck.setID(truckDto.getId());
        truck.setName(truckDto.getName());
        truck.setDriver(truckDto.getDriver());
        truck.setState(switch (truckDto.getState()) {
            case "base" -> State.ON_THE_BASE;
            case "road" -> State.ON_THE_ROAD;
            case "repair" -> State.ON_THE_REPAIR;
            default -> throw new IllegalStateException(
                    "invalid state"
            );
        });
        return truck;
    }

    @Override
    protected TruckDto doBackward(Truck truck) {
        return null;
    }}
