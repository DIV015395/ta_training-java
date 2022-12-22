package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_3;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args) {
        int dayFeet = 0;
        int nightFeet = 0;
        int heightFeet = 0;
        int daySum = 0;
        int sumDayFeet = 0;
        int sumNightFeet = 0;
        Scanner scanner = new Scanner(System.in);
        dayFeet = scanner.nextInt();
        nightFeet = scanner.nextInt();
        heightFeet = scanner.nextInt();
        if (dayFeet<=nightFeet && dayFeet<heightFeet){
            System.out.println("Impossible");
        } else {
            do {
                daySum++;
                sumDayFeet=sumNightFeet+dayFeet;
                sumNightFeet=sumDayFeet-nightFeet;
            }
            while (sumDayFeet<heightFeet);
            System.out.println(daySum);
        }

    }
}
