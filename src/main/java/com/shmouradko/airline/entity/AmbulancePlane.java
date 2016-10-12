package com.shmouradko.airline.entity;

/**
 * Created by Сергей on 08.10.2016.
 */
public class AmbulancePlane extends Plane {

    private int medkits;

    public Plane setMedkits(int medkits) {
        this.medkits = medkits;
        return this;
    }

    public int getMedkits() {
        return medkits;
    }

    @Override
    public String toString() {
        return "AmbulancePlane{" +
                "medkits=" + medkits +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmbulancePlane that = (AmbulancePlane) o;

        return medkits == that.medkits;

    }

    @Override
    public int hashCode() {
        return medkits;
    }
}
