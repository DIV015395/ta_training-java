package com.epam.training.student_Aleksei_Guskov.fundamental.main_task.Planes;

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
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object otherPlane) {
        PassengerPlane plane = (PassengerPlane) otherPlane;
        return super.equals(otherPlane) &&
                Objects.equals(passengersCapacity, plane.passengersCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCapacity);
    }
}