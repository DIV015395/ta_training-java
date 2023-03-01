package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_4;

import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] firstMatrix, int[][] secondMatrix) {

        int rows = firstMatrix.length;
        int cols = secondMatrix[0].length;
        int iterations = secondMatrix.length;

        int[][] multiplyResult = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < iterations; k++) {
                    multiplyResult[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        return multiplyResult;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

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

