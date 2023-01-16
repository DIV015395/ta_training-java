package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_4;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
    }

    public static int sum(int[] array){
        int sum = 0;
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                int a = array[i] % 2;
                if (a == 0) {
                    sum += array[i];
                }
            }
            return sum;
        } else {
            sum = 0;
            return sum;
        }
        //put your code here

        //throw new UnsupportedOperationException();
    }
}
