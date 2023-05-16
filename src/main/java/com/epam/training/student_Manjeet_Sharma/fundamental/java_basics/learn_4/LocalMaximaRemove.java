package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_4;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));

    }

    public static int[] removeLocalMaxima(int[] array) {
        int[] newArray = new int[array.length];
        int indexExpected = 0;
        for (int i = 0; i < 1; i++){
            if (array[0] <= array[1]) {
                newArray[0] = 1;
                indexExpected++;
            } else {
                newArray[0] = 0;
            }
        }
        for (int i = 1; i < array.length-1; i++){
            if (array[i] <= array[i-1] || array[i] <= array[i+1]) {
                newArray[i] = 1;
                indexExpected++;
            } else {
                newArray[i] = 0;
            }
        }
        for (int i = array.length-1; i < array.length; i++) {
            if (array[i] <= array[i-1]) {
                newArray[i] = 1;
                indexExpected++;
            } else {
                newArray[i] = 0;
            }
        }
        int[] expected = new int[indexExpected];
        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (newArray[i] == 1){
                expected[newIndex] = array[i];
                newIndex++;
            }
        }
        return expected;
    }
}


