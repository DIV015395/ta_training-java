package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_3;

import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args){

        int billTotal = 0;
        int numberFriends = 0;
        int bill = 0;

        Scanner scanner = new Scanner(System.in);

        billTotal = scanner.nextInt();
        if (billTotal<0) {
            System.out.println("Bill total amount cannot be negative");
        } else {
            numberFriends = scanner.nextInt();
            if (numberFriends<=0) {
                System.out.println("Number of friends cannot be negative or zero");
            } else {
                bill = (int) ((billTotal/numberFriends+0.1*(billTotal/numberFriends)));
                if (bill==0 && billTotal != 0){
                    System.out.println("1");
                }else {
                    System.out.println(bill);
                }
            }
        }

    }
}
