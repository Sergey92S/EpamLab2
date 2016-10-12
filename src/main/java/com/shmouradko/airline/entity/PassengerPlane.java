package com.shmouradko.airline.entity;

/**
 * Created by Сергей on 09.10.2016.
 */
public class PassengerPlane extends Plane {
    private int passengers;

    public int getPassengers() {
        return passengers;
    }

    public Plane setPassengers(int passengers) {
        this.passengers = passengers;
        return this;
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                "passengers=" + passengers +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PassengerPlane that = (PassengerPlane) o;

        return passengers == that.passengers;

    }

    @Override
    public int hashCode() {
        return passengers;
    }
}
