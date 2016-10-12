package com.shmouradko.airline.runner;

import com.shmouradko.airline.entity.Airline;
import com.shmouradko.airline.entity.Plane;
import com.shmouradko.airline.exception.EmptyFileException;

import java.util.List;

/**
 * Created by Сергей on 08.10.2016.
 */
public class AirlineRunner {
    public static void main(String[] args) {
        List<Plane> planes = null;
        try {
            planes = Airline.initialization(planes);
            Airline.totalCarryingCapacity(planes);
            Airline.totalHoldingCapacity(planes);
            Airline.findPlaneByFuel(planes);
            Airline.sortByRange(planes);
        } catch (EmptyFileException e) {
            e.printStackTrace();
        }
    }
}
