package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_12.residents.dogs;

public class Dog {

    protected String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog " + name;
    }
}
