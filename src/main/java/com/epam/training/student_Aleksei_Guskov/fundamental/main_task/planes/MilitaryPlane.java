package com.epam.training.student_Aleksei_Guskov.fundamental.main_task.planes;

import com.epam.training.student_Aleksei_Guskov.fundamental.main_task.models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane{

    private MilitaryType type;

    public MilitaryPlane(String model, int maxSpeed,
                         int maxFlightDistance, int maxLoadCapacity, MilitaryType type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
    }

    public MilitaryType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "MilitaryPlane{" +
                "type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object otherPlane) {
        MilitaryPlane plane = (MilitaryPlane) otherPlane;
        return super.equals(otherPlane) &&
                Objects.equals(type, plane.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
