package com.epam.training.student_Aleksei_Guskov.fundamental.main_task.Planes;

import com.epam.training.student_Aleksei_Guskov.fundamental.main_task.models.ClassificationLevel;
import com.epam.training.student_Aleksei_Guskov.fundamental.main_task.models.ExperimentalTypes;
import java.util.Objects;

public class ExperimentalPlane extends Plane{

    private ExperimentalTypes type;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed,
                             int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes type,
                             ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }


    @Override
    public boolean equals(Object otherPlane) {
        ExperimentalPlane plane = (ExperimentalPlane) otherPlane;
        return super.equals(otherPlane) &&
                Objects.equals(type, plane.type) &&
                Objects.equals(classificationLevel, plane.classificationLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, classificationLevel);
    }

    @Override
    public String toString() {
        return "ExperimentalPlane{" +
                "type=" + type +
                ", classificationLevel=" + classificationLevel +
                ", model='" + model + '\'' +
                "} " + super.toString();
    }
}
