package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_4;

import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int [cols][rows];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                transpose[j][i] = matrix[i][j];
             }
        }
        return transpose;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        int[][] matrix = {
                {1, 2},
                {7, -13} };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));

    }

}

