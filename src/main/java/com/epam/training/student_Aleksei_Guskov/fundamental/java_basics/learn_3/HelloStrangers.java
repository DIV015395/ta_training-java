package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_3;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int person;
        String names="";
                if (amount<0){
            System.out.println("Seriously? Why so negative?");
        } else if (amount==0){
            System.out.println("Oh, it looks like there is no one here");
        } else {
           for (person=0;person<=amount;person++){
               String name = scanner.nextLine();
               if (person==0) {
               } else {names = names+("Hello, " + name + "\n");
               }
           }
           System.out.println(names);
        }
    }
}
