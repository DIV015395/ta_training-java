package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_4;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int [][] spiral = new int [rows][];
        for (int i = 0; i < spiral.length; i++){
            spiral[i] = new int[columns];
        }

        int spiralStep = 1;
        for (int i = 0; i < columns; i++) {
            spiral[0][i] = spiralStep;
            spiralStep++;
        }
        if (rows > 1 ){
            for (int j = 1; j < rows; j++) {
                spiral[j][columns-1] = spiralStep;
                spiralStep++;
            }
            for (int i = columns-2; i >= 0; i--) {
                spiral[rows-1][i] = spiralStep;
                spiralStep++;
            }
            for (int j = rows-2; j > 0; j--) {
                spiral[j][0] = spiralStep;
                spiralStep++;
            }
            int i = 1;
            int j = 1;
            while (spiralStep < (rows * columns)) {
                while (spiral[i][j+1] == 0) {
                    spiral[i][j] = spiralStep;
                    spiralStep++;
                    j++;
                }
                while (spiral[i+1][j] == 0) {
                    spiral[i][j] = spiralStep;
                    spiralStep++;
                    i++;
                }
                while (spiral[i][j-1] == 0) {
                    spiral[i][j] = spiralStep;
                    spiralStep++;
                    j--;
                }
                while (spiral[i-1][j] == 0) {
                    spiral[i][j] = spiralStep;
                    spiralStep++;
                    i--;
                }
            }
        }
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                if (spiral[i][j] == 0) {
                    spiral[i][j] = spiralStep;
                }
            }
        }
        return spiral;
    }
}

