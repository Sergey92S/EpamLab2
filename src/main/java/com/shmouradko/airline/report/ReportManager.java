package com.shmouradko.airline.report;

import com.shmouradko.airline.entity.Plane;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

/**
 * Created by Сергей on 09.10.2016.
 */
public class ReportManager {
    static Logger logger = LogManager.getLogger();

    public static void exceptionReport(int line, Exception e) {
        logger.log(Level.ERROR, "Data at line " + line + " is incorrect", e);
    }

    public static void fileNotFoundExceptionReport(String path, Exception e) {
        logger.log(Level.ERROR, "File not found in path = " + path + "", e);
    }

    public static void initializationReport() {
        logger.info("Initialization complete!");
    }

    public static void sortByRangeReport(List<Plane> planes) {
        logger.info("Sorted planes by the range:");
        for (Plane plane : planes) {
            logger.info("Plane with ID = {} has range = {}", plane.getPlaneId(), plane.getRange());
        }
    }

    public static void findPlaneByFuelReport(List<Plane> planes, int minFuel, int maxFuel) {
        logger.info("Plane's ids which are in the fuel diapason between {} and {}", minFuel, maxFuel);
        for (Plane plane : planes) {
            logger.info("Plane with ID = {} and has fuel = {}", plane.getPlaneId(), plane.getFuel());
        }
    }

    public static void totalHoldingCapacityReport(int totalHoldingCapacity) {
        logger.info("Total holding capacity is {}", totalHoldingCapacity);
    }

    public static void totalCarryingCapacityReport(int totalCarryingCapacity) {
        logger.info("Total carrying capacity is {}", totalCarryingCapacity);
    }

}
