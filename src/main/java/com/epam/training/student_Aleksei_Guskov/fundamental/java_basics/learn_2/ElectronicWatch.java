package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_2;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        //int topBorder = 86401;
        //int botBorder = 0;
        int hourOut = (int) Math.floor(seconds/3600); //determine the number of hours
        int minuteOut =  (int) Math.floor ((seconds - hourOut*3600)/60); //determine the number of minutes
        int secondOut = (int) Math.floor ((seconds - hourOut*3600-minuteOut*60)); //determine the number of seconds
        String resultHours = (hourOut == (24)) ? "0" : ""+hourOut ; //set parameters for displaying hours
        String resultMinutes = (minuteOut < (10)) ? "0"+minuteOut : ""+minuteOut ; //set parameters for displaying minutes
        String resultSeconds = (secondOut < (10)) ? "0"+secondOut : ""+secondOut ; //set parameters for displaying seconds
        //String result = (seconds > topBorder | seconds < botBorder) ? "There are no such numbers in the day!" : "" +resultHours+":"+resultMinutes+":"+resultSeconds ;
        String result = "" +resultHours+":"+resultMinutes+":"+resultSeconds ; //Total!
        System.out.println(result);//And out on display!
    }
}
