package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_12.residents.cats;

public class Cat {

    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat " + name;
    }
}
