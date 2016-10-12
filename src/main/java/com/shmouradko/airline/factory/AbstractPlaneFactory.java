package com.shmouradko.airline.factory;

import com.shmouradko.airline.entity.Plane;
import com.shmouradko.airline.exception.WrongDataException;

import java.util.List;

/**
 * Created by Сергей on 12.10.2016.
 */
public abstract class AbstractPlaneFactory {
    private static final int SECOND_ELEMENT = 0;
    private static final int THIRD_ELEMENT = 1;
    private static final int FORTH_ELEMENT = 2;
    private static final int FIFTH_ELEMENT = 3;
    private static final int SIXTH_ELEMENT = 4;

    public enum PlaneType {
        PASSENGER {
            {
                this.factory = new PassengerPlaneFactory();
            }
        },
        AMBULANCE {
            {
                this.factory = new AmbulancePlaneFactory();
            }
        },
        FIREFIGHT {
            {
                this.factory = new FirefightPlaneFactory();
            }
        },
        TRANSPORT {
            {
                this.factory = new TransportPlaneFactory();
            }
        };

        AbstractPlaneFactory factory;

        public void create(List<String> dataList, List<Plane> planeList) throws WrongDataException {
            factory.initSpecialFields(dataList, planeList);
        }

    }

    public abstract void validation(List<String> dataList) throws WrongDataException;

    public abstract void initSpecialFields(List<String> dataList, List<Plane> planeList) throws WrongDataException;

    public void initFields(List<String> dataList, List<Plane> planeList, Plane plane) {
        planeList.add(plane.setPlaneId(Long.parseLong(dataList.get(SECOND_ELEMENT))).setHoldingCapacity(Integer.parseInt(dataList.get(THIRD_ELEMENT))).setCarryingCapacity(Integer.parseInt(dataList.get(FORTH_ELEMENT))).setRange(Integer.parseInt(dataList.get(FIFTH_ELEMENT))).setFuel(Integer.parseInt(dataList.get(SIXTH_ELEMENT))));
    }


}
