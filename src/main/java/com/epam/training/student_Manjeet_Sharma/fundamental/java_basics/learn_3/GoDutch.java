package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_3;

import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args){

        int billTotal, valueOfFriends, bill;

        Scanner inputValue = new Scanner(System.in);

        billTotal = inputValue.nextInt();
        if (billTotal < 0) {
            System.out.println("Bill total amount cannot be negative");
        } else {
            valueOfFriends = inputValue.nextInt();
            if (valueOfFriends <= 0) {
                System.out.println("Number of friends cannot be negative or zero");
            } else {
                bill = (int) ((billTotal/valueOfFriends+0.1*(billTotal/valueOfFriends)));
                if (bill == 0 && billTotal != 0){
                    System.out.println("1");
                }else {
                    System.out.println(bill);
                }
            }
        }
    }
}
