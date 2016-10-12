package com.shmouradko.airline.entity;

/**
 * Created by Сергей on 09.10.2016.
 */
public class FirefightPlane extends Plane {

    private int water;

    public int getWater() {
        return water;
    }

    public Plane setWater(int water) {
        this.water = water;
        return this;
    }

    @Override
    public String toString() {
        return "FirefightPlane{" +
                "water=" + water +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FirefightPlane that = (FirefightPlane) o;

        return water == that.water;

    }

    @Override
    public int hashCode() {
        return water;
    }
}
