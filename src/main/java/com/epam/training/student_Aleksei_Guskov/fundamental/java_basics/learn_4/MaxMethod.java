package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_4;

import java.util.Arrays;


public class MaxMethod {
    public static int max(int[] values) {
        Arrays.sort(values);                                //First variant realization
        int max = values[values.length-1];
    //    int max = values[0];                              //Second variant realization
    //    for (int i=0;i<values.length;i++){
    //        if(max<values[i]){
    //            max=values[i];
    //        }
    //    }
        return max;
        //throw new UnsupportedOperationException();
    }

}

