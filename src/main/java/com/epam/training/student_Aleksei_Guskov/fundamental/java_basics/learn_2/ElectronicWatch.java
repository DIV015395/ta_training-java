package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_2;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secondsInput = scanner.nextInt();
        int hourOut = (int) Math.floor(secondsInput/3600);
        int minuteOut =  (int) Math.floor ((secondsInput - hourOut*3600)/60);
        int secondOut = (int) Math.floor ((secondsInput - hourOut*3600-minuteOut*60));
        String resultHours = (hourOut == (24)) ? "0" : ""+hourOut ;
        String resultMinutes = (minuteOut < (10)) ? "0" + minuteOut : "" + minuteOut ;
        String resultSeconds = (secondOut < (10)) ? "0" + secondOut : "" + secondOut ;
        System.out.println("" +resultHours+":"+resultMinutes+":"+resultSeconds);
    }
}
