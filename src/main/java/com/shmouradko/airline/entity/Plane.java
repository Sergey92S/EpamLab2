package com.shmouradko.airline.entity;

/**
 * Created by Сергей on 08.10.2016.
 */
public abstract class Plane {
    private long planeId;
    private int holdingCapacity;
    private int carryingCapacity;
    private int range;
    private int fuel;

    public long getPlaneId() {
        return planeId;
    }

    public int getHoldingCapacity() {
        return holdingCapacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public int getRange() {
        return range;
    }

    public int getFuel() {
        return fuel;
    }

    public Plane setPlaneId(long planeId) {
        this.planeId = planeId;
        return this;
    }

    public Plane setHoldingCapacity(int holdingCapacity) {
        this.holdingCapacity = holdingCapacity;
        return this;
    }

    public Plane setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
        return this;
    }

    public Plane setRange(int range) {
        this.range = range;
        return this;
    }

    public Plane setFuel(int fuel) {
        this.fuel = fuel;
        return this;
    }
}
