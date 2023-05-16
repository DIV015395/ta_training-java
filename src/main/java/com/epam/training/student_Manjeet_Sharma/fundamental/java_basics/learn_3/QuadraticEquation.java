package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_3;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant = b*b-4*a*c;
        if (discriminant > 0) {
            double firstX = (-b + sqrt(discriminant))/(2*a);
            double secondX = (-b - sqrt(discriminant))/(2*a);
            System.out.println(firstX +" "+ secondX);
        } else if (discriminant == 0) {
            double x = -b/(a*2);
            if (x == -0.0) {
                System.out.println("0.0");
            } else {
                System.out.println(x);
            }
        } else {
            System.out.println("no roots");
        }
    }

}
