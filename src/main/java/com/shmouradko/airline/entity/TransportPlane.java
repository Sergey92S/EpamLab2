package com.shmouradko.airline.entity;

/**
 * Created by Сергей on 09.10.2016.
 */
public class TransportPlane extends Plane {
    private int cargo;

    public int getCargo() {
        return cargo;
    }

    public Plane setCargo(int cargo) {
        this.cargo = cargo;
        return this;
    }

    @Override
    public String toString() {
        return "TransportPlane{" +
                "cargo=" + cargo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TransportPlane that = (TransportPlane) o;

        return cargo == that.cargo;

    }

    @Override
    public int hashCode() {
        return cargo;
    }
}
