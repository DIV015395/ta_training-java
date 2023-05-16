package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_15;

import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        IntService helper = new IntService();
        OptionalInt result = helper.arrayOptional(values);
        if (result.isPresent()) {
            return result;
        }
        if (result.isEmpty()) {
            return result;
        }
        return null;
    }
}
