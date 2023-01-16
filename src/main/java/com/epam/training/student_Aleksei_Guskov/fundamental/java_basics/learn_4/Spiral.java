package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_4;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int [][] spiral = new int [rows][];
        for (int i = 0; i < spiral.length; i++){
            spiral[i] = new int[columns];
        }
        //for (int i = 0; i < spiral.length;i++){
        //    for (int j = 0; j < spiral[i].length; j++);
        //}
        int s = 1;
        for (int i = 0; i < columns; i++){
            spiral[0][i] = s;
            s++;
        }
        if (rows>1){
        for (int j = 1; j < rows; j++){
            spiral[j][columns-1] = s;
            s++;
        }
        for (int i = columns - 2; i >= 0; i--){
            spiral[rows-1][i] = s;
            s++;
        }
        for (int j = rows - 2; j > 0; j--){
            spiral[j][0] = s;
            s++;
        }
        int i = 1;
        int j = 1;
        while (s < rows * columns) {
            while (spiral[i][j + 1] == 0) {
                spiral[i][j] = s;
                s++;
                j++;
            }
            while (spiral[i + 1][j] == 0) {
                spiral[i][j] = s;
                s++;
                i++;
            }
            while (spiral[i][j - 1] == 0) {
                spiral[i][j] = s;
                s++;
                j--;
            }
            while (spiral[i - 1][j] == 0) {
                spiral[i][j] = s;
                s++;
                i--;
            }
        }
        }for (int a = 0; a < rows; a++){
            for (int b = 0; b < columns; b++){
                if (spiral[a][b] == 0) {
                    spiral[a][b] = s;
                }
            }
        }


        return spiral;
    }
}

