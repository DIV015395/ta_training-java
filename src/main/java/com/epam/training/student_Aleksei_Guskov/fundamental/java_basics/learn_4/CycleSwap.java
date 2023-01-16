package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_4;

public class CycleSwap {
    static void cycleSwap(int[] array) {
        //array = new int[]{};
        int[] array2 = new int[array.length];
        System.arraycopy(array,0,array2,0,array.length);
        if (array.length!=0) {
            System.arraycopy(array2, 0, array, 1, array.length - 1);
            System.arraycopy(array2, array.length - 1, array, 0, 1);
        } else {
            array=array2;
        }

    }

    static void cycleSwap(int[] array, int shift) {
        int[] array2 = new int[array.length];
        System.arraycopy(array,0,array2,0,array.length);
        if (array.length!=0) {
            System.arraycopy(array2, 0, array, shift, array.length - shift);
            System.arraycopy(array2, array.length - shift, array, 0, shift);
        } else {
            array=array2;
        }
    }
}
