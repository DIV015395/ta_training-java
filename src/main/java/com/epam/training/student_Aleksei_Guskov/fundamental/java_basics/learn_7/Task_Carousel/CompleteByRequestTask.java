package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_7.Task_Carousel;

public class CompleteByRequestTask implements Task {
    public boolean finished = false;
    public boolean isComplete = false;

    @Override
    public void execute() {
        if (isComplete == true) {
            finished = true;
        };
    }

    @Override
    public boolean isFinished() {
        return finished;
    }

    public void complete() {
        isComplete = true;
    }
}
