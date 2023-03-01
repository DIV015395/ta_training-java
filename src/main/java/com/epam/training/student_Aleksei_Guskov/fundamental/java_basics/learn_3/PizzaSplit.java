package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_3;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valueOfPersons = scanner.nextInt();
        int valueOfPieces = scanner.nextInt();
        int valueOfPizzas = 1;
        double remainder = 1;
        while(remainder!=0) {
            remainder=(valueOfPizzas * valueOfPieces) % valueOfPersons;
            valueOfPizzas++;
        }
        System.out.println(valueOfPizzas-1);

    }
}
