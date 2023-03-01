package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_15;

import java.util.Arrays;
import java.util.OptionalInt;

public class IntService {
    public int arrMax(int[] values) {
        Arrays.sort(values);
        return values[values.length-1];
    }
    public OptionalInt arrayOptional(int[] values) {
        OptionalInt result;
        if(values != null && values.length > 0) {
            int arr = arrMax(values);
            result = OptionalInt.of(arr);
        } else {
            result = OptionalInt.empty();
        }
        return result;
    }
}
