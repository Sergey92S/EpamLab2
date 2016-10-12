package com.shmouradko.airline;

import com.shmouradko.airline.entity.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Сергей on 13.10.2016.
 */
@RunWith(value = Parameterized.class)
public class AirlineTest {

    private Plane plane1;
    private Plane plane2;
    private Plane plane3;
    private int expectedPlaneTrue;
    private int expectedPlaneFalse;
    private int expectedHoldingCapacityTrue;
    private int expectedHoldingCapacityFalse;
    private int expectedCarryingCapacityTrue;
    private int expectedCarryingCapacityFalse;
    private List<Plane> planeList;

    public AirlineTest(Plane plane1, Plane plane2, Plane plane3, int expectedPlaneTrue, int expectedPlaneFalse, int expectedHoldingCapacityTrue, int expectedHoldingCapacityFalse, int expectedCarryingCapacityTrue, int expectedCarryingCapacityFalse) {
        this.plane1 = plane1;
        this.plane2 = plane2;
        this.plane3 = plane3;
        this.expectedPlaneTrue = expectedPlaneTrue;
        this.expectedPlaneFalse = expectedPlaneFalse;
        this.expectedHoldingCapacityTrue = expectedHoldingCapacityTrue;
        this.expectedHoldingCapacityFalse = expectedHoldingCapacityFalse;
        this.expectedCarryingCapacityTrue = expectedCarryingCapacityTrue;
        this.expectedCarryingCapacityFalse = expectedCarryingCapacityFalse;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new AmbulancePlane().setPlaneId(1).setHoldingCapacity(10000).setCarryingCapacity(50000).setRange(7000).setFuel(900), new FirefightPlane().setPlaneId(2).setHoldingCapacity(10000).setCarryingCapacity(50000).setRange(9000).setFuel(900), new PassengerPlane().setPlaneId(3).setHoldingCapacity(10000).setCarryingCapacity(50000).setRange(2000).setFuel(700), 3, 0, 30000, 0, 150000, 0},
                {new AmbulancePlane().setPlaneId(1).setHoldingCapacity(50000).setCarryingCapacity(10000).setRange(7000).setFuel(2000), new TransportPlane().setPlaneId(2).setHoldingCapacity(50000).setCarryingCapacity(10000).setRange(7000).setFuel(700), new PassengerPlane().setPlaneId(3).setHoldingCapacity(50000).setCarryingCapacity(10000).setRange(2000).setFuel(100), 1, 0, 150000, 0, 30000, 0}
        });
    }

    @Before
    public void initTriangle() {
        planeList = new ArrayList<>();
        planeList.add(plane1);
        planeList.add(plane2);
        planeList.add(plane3);
    }

    @Test
    public void findPlaneByFuelTestTrue(){
        assertTrue(Airline.findPlaneByFuel(planeList) == expectedPlaneTrue);
    }

    @Test
    public void findPlaneByFuelTestFalse(){
        assertFalse(Airline.findPlaneByFuel(planeList) == expectedPlaneFalse);
    }

    @Test
    public void totalHoldingCapacityTestTrue(){
        assertTrue(Airline.totalHoldingCapacity(planeList) == expectedHoldingCapacityTrue);
    }

    @Test
    public void totalHoldingCapacityTestFalse(){
        assertFalse(Airline.totalHoldingCapacity(planeList) == expectedHoldingCapacityFalse);
    }

    @Test
    public void totalCarryingCapacityTestTrue(){
        assertTrue(Airline.totalCarryingCapacity(planeList) == expectedCarryingCapacityTrue);
    }

    @Test
    public void totalCarryingCapacityTestFalse(){
        assertFalse(Airline.totalCarryingCapacity(planeList) == expectedCarryingCapacityFalse);
    }

    @After
    public void clearTriangle() {
        planeList = null;
    }

}