package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_4;

import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {

        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int iterations = matrix2.length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                for (int k = 0; k < iterations; k++){
                    result[i][j] += matrix1[i][k]*matrix2[k][j];
                }
            }
        }

        return result;

    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567} };

        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6} };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}

