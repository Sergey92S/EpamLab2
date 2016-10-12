package com.shmouradko.airline.scanner;

import com.shmouradko.airline.entity.Plane;
import com.shmouradko.airline.exception.EmptyFileException;
import com.shmouradko.airline.exception.WrongDataException;
import com.shmouradko.airline.factory.AbstractPlaneFactory;
import com.shmouradko.airline.report.ReportManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by Сергей on 08.10.2016.
 */
public class AirlineScanner {
    private static int line;
    private static final int FIRST_ELEMENT = 0;
    private static final String DELIMITER = " ";
    private static final String FILE_PATH = System.getProperty("user.dir")+"\\files\\data.txt";

    public static void scanFile(List<Plane> planeList) throws EmptyFileException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(FILE_PATH));
            while (scanner.hasNext()) {
                try {
                    line++;
                    List<String> dataList = new LinkedList<>(Arrays.asList(scanner.nextLine().split(DELIMITER)));
                    AbstractPlaneFactory.PlaneType.valueOf(dataList.get(FIRST_ELEMENT)).create(dataList, planeList);
                } catch (WrongDataException | IllegalArgumentException e) {
                    ReportManager.exceptionReport(line, e);
                }
            }
            if (planeList.isEmpty()) {
                throw new EmptyFileException();
            }
        } catch (FileNotFoundException e) {
            ReportManager.fileNotFoundExceptionReport(FILE_PATH, e);
            throw new RuntimeException();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

}
