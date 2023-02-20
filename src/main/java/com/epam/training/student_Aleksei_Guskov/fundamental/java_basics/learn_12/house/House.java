package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_12.house;

import java.util.ArrayList;
import java.util.List;

public class House<T> {

    private final List<T> residents = new ArrayList();

    public void enter(Object resident) {
        residents.add((T) resident);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("There are following residents in the house:\n");
        for (Object resident : residents) {
            builder.append(resident.toString()).append("\n");
        }
        return builder.toString();
    }
}
