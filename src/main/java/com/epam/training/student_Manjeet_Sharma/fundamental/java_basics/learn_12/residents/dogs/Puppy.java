package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_12.residents.dogs;

public class Puppy extends Dog {

    public Puppy(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Puppy " + name;
    }
}
