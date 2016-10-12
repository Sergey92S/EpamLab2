package com.shmouradko.airline.entity.comparator;

import com.shmouradko.airline.entity.Plane;

import java.util.Comparator;

/**
 * Created by Сергей on 08.10.2016.
 */
public class RangeComparator implements Comparator<Plane> {

    public int compare(Plane plane1, Plane plane2) {
        return plane1.getRange() - plane2.getRange();
    }

}
