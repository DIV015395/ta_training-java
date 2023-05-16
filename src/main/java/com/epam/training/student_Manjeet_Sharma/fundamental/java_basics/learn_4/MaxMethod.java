package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_4;

public class MaxMethod {
    public static int max(int[] values) {
        int maxValue = values[0];
        for (int i = 0; i < values.length; i++){
            if (maxValue < values[i]) {
                maxValue = values[i];
            }
        }
        return maxValue;
    }

}

