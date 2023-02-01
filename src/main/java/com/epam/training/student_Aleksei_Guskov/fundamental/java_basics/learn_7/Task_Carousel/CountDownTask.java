package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_7.Task_Carousel;

public class CountDownTask implements Task{
    private int value;

    public CountDownTask(int value) {
        this.value = Math.max(value, 0);
    }

    public int getValue() {
        return this.value;
    }


    @Override
    public void execute() {
        if (value != 0) {
            this.value--;
        } else {
            isFinished();
        }
    }

    @Override
    public boolean isFinished() {
        return value == 0;
    }
}
