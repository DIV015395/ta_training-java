package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_4;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
    }

    public static int sum(int[] array){
        int sumEvenValues = 0;
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                int valueOfHalfArrays = array[i] % 2;
                if (valueOfHalfArrays == 0) {
                    sumEvenValues += array[i];
                }
            }
            return sumEvenValues;
        } else {
            sumEvenValues = 0;
            return sumEvenValues;
        }
    }
}
