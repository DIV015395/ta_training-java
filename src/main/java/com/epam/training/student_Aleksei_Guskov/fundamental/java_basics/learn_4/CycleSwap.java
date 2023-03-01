package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_4;

public class CycleSwap {
    static void cycleSwap(int[] array) {
        //array = new int[]{};
        int[] newArray = new int[array.length];
        System.arraycopy(array,0,newArray,0,array.length);
        if (array.length != 0) {
            System.arraycopy(newArray, 0, array, 1, array.length - 1);
            System.arraycopy(newArray, array.length - 1, array, 0, 1);
        } else {
            array=newArray;
        }

    }

    static void cycleSwap(int[] array, int shift) {
        int[] newArray = new int[array.length];
        System.arraycopy(array,0,newArray,0,array.length);
        if (array.length!=0) {
            System.arraycopy(newArray, 0, array, shift, array.length - shift);
            System.arraycopy(newArray, array.length - shift, array, 0, shift);
        } else {
            array=newArray;
        }
    }
}
