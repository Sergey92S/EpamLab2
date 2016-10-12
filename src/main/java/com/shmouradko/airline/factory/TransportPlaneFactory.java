package com.shmouradko.airline.factory;

import com.shmouradko.airline.entity.Plane;
import com.shmouradko.airline.entity.TransportPlane;
import com.shmouradko.airline.exception.WrongDataException;

import java.util.List;

/**
 * Created by Сергей on 12.10.2016.
 */
public class TransportPlaneFactory extends AbstractPlaneFactory {
    private static final int SEVENTH_ELEMENT = 5;
    private static final int NUMBER_OF_DATA_IN_LINE = 6;
    private static final String DIGITAL_REG_EXP = "^-?\\d+$";

    public void validation(List<String> dataList) throws WrongDataException {
        dataList.remove(0);
        if (dataList.size() != NUMBER_OF_DATA_IN_LINE) {
            throw new WrongDataException();
        }
        for (String data : dataList) {
            if (data.isEmpty()) {
                throw new WrongDataException();
            }
            if (!data.matches(DIGITAL_REG_EXP)) {
                throw new WrongDataException();
            }
        }
    }

    public void initSpecialFields(List<String> dataList, List<Plane> planeList) throws WrongDataException {
        validation(dataList);
        initFields(dataList, planeList, new TransportPlane().setCargo(Integer.parseInt(dataList.get(SEVENTH_ELEMENT))));
    }

}
