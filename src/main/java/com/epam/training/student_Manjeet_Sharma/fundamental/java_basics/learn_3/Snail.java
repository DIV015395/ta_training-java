package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_3;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args) {
        int dayFeet, nightFeet, heightFeet, sumDayFeet;
        int daySum = 0;
        int sumNightFeet = 0;
        Scanner inputValue = new Scanner(System.in);
        dayFeet = inputValue.nextInt();
        nightFeet = inputValue.nextInt();
        heightFeet = inputValue.nextInt();
        if (dayFeet <= nightFeet && dayFeet < heightFeet){
            System.out.println("Impossible");
        } else {
            do {
                daySum++;
                sumDayFeet = sumNightFeet + dayFeet;
                sumNightFeet = sumDayFeet - nightFeet;
            }
            while (sumDayFeet < heightFeet);
            System.out.println(daySum);
        }

    }
}
