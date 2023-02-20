package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_12.residents.cats;

public class Kitten extends Cat {

    public Kitten(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Kitten " + name;
    }
}
