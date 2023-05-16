package com.epam.training.student_Manjeet_Sharma.fundamental.main_task.planes;

import java.util.Objects;

public class PassengerPlane extends Plane {

    private int passengersCapacity;

    public PassengerPlane(String model, int maxSpeed,
                          int maxFlightDistance, int maxLoadCapacity, int passengersCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                "passengersCapacity=" + passengersCapacity +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object other) {
        PassengerPlane plane = (PassengerPlane) other;
        return super.equals(other) &&
                Objects.equals(passengersCapacity, plane.passengersCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCapacity);
    }
}