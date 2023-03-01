package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_4;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] expected = new boolean[array.length];
        Arrays.fill(expected, false);
        for (int i = 0; i < array.length-2; i++) {
            int sum = (array[i] + array[i+1]);
            if (sum == array[i+2]) {
                expected[i+2] = true;
            } else {
                expected[i+2] = false;
            }
        }
        return expected;
    }
}

