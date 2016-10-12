package com.shmouradko.airline.entity;

import com.shmouradko.airline.entity.comparator.RangeComparator;
import com.shmouradko.airline.exception.EmptyFileException;
import com.shmouradko.airline.report.ReportManager;
import com.shmouradko.airline.scanner.AirlineScanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Сергей on 08.10.2016.
 */
public class Airline {
    private static int totalHoldingCapacity;
    private static int totalCarryingCapacity;
    private static final int DEFAULT_VALUE = 0;
    private static final int MIN_VALUE = 400;
    private static final int MAX_VALUE = 1000;

    public static List<Plane> initialization(List<Plane> planeList) throws EmptyFileException {
        planeList = new ArrayList<>();
        AirlineScanner.scanFile(planeList);
        ReportManager.initializationReport();
        return planeList;
    }

    public static void sortByRange(List<Plane> planes) {
        Collections.sort(planes, new RangeComparator());
        ReportManager.sortByRangeReport(planes);
    }

    public static int findPlaneByFuel(List<Plane> planes) {
        List<Plane> result = new ArrayList<>();
        for (Plane p : planes) {
            if (p.getFuel() >= MIN_VALUE && p.getFuel() <= MAX_VALUE) {
                result.add(p);
            }
        }
        ReportManager.findPlaneByFuelReport(result, MIN_VALUE, MAX_VALUE);
        return result.size();
    }

    public static int totalHoldingCapacity(List<Plane> planes) {
        totalHoldingCapacity = DEFAULT_VALUE;
        for (Plane p : planes) {
            totalHoldingCapacity = p.getHoldingCapacity() + totalHoldingCapacity;
        }
        ReportManager.totalHoldingCapacityReport(totalHoldingCapacity);
        return totalHoldingCapacity;
    }

    public static int totalCarryingCapacity(List<Plane> planes) {
        totalCarryingCapacity = DEFAULT_VALUE;
        for (Plane p : planes) {
            totalCarryingCapacity = p.getCarryingCapacity() + totalCarryingCapacity;
        }
        ReportManager.totalCarryingCapacityReport(totalCarryingCapacity);
        return totalCarryingCapacity;
    }

}
