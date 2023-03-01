package com.epam.training.student_Aleksei_Guskov.fundamental.main_task.Planes;

import com.epam.training.student_Aleksei_Guskov.fundamental.main_task.models.ClassificationLevel;
import com.epam.training.student_Aleksei_Guskov.fundamental.main_task.models.ExperimentalTypes;

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
        return super.equals(otherPlane);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + model + '\'' +
                ", classification level='" + classificationLevel + '\'' +
                '}';
    }
}