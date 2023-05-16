package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_12.house;

import com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_12.residents.cats.Cat;
import com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_12.residents.cats.Kitten;
import com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_12.residents.dogs.Dog;
import com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_12.residents.dogs.Puppy;

public class Main {

    public static void main(String[] args) {
        Dog rex = new Dog("Rax");
        Puppy randy = new Puppy("Randy");
        Cat barbos = new Cat("Barbos");
        Kitten murzik = new Kitten("Murzik");

        House dogHouse = new House();
        dogHouse.enter(rex);
        dogHouse.enter(randy);
        System.out.println(dogHouse);

        House catHouse = new House();
        catHouse.enter(barbos);
        catHouse.enter(murzik);
        System.out.println(catHouse);
    }
}
