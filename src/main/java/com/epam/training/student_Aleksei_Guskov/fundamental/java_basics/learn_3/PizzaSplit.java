package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_3;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int persons = scanner.nextInt();    //Enter the number of people
        int pieces = scanner.nextInt();     //Enter the number of pieces
        int pizzas = 1;                     //This is number of pizzas (minimum one)
        double remainder = 1;               //This is auxiliary coefficient
        while(remainder!=0) {
            remainder=(pizzas * pieces) % persons;  //We consider the remainder
            pizzas++;                               //increase the number of pizzas
        }
        System.out.println(pizzas-1);               //remove the excess

    }
}
