package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_4;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));

    }

    public static int[] removeLocalMaxima(int[] array) {
        int[] array2 = new int[array.length];
        int indexExpected = 0;
        for (int i = 0; i<1;i++){
            if (array[0]<=array[1]){
                array2[0]=1;
                indexExpected++;
            } else {
                array2[0]=0;
            }
        }
        for (int i = 1; i<array.length-1;i++){
            if (array[i]<=array[i-1]||array[i]<=array[i+1]){
                array2[i]=1;
                indexExpected++;
            } else {
                array2[i]=0;
            }
        }
        for (int i=array.length-1;i<array.length;i++){
            if (array[i]<=array[i-1]){
                array2[i]=1;
                indexExpected++;
            } else {
                array2[i]=0;
            }
        }
        int[] expected = new int[indexExpected];
        int j=0;
        for (int i = 0; i<array.length;i++) {
            if (array2[i]==1){
                expected[j]=array[i];
                j++;
            }
        }
        return expected;
        //throw new UnsupportedOperationException();
    }
}


