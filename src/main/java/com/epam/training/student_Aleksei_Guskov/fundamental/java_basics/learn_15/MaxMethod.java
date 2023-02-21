package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_15;

import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        IntService helper = new IntService();
        OptionalInt result = helper.arrOpt(values);
        if (result.isPresent()) return result;
        if (result.isEmpty()) return result;
        return null;
    }
}
