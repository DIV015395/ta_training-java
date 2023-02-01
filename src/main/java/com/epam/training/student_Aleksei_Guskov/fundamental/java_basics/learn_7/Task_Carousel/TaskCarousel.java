package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_7.Task_Carousel;

import java.util.ArrayList;
import java.util.List;
public class TaskCarousel {
    private int capacity;
    public List <Task> tasks;
    public int counter = -1;

    public TaskCarousel(int capacity) {
        this.capacity = capacity;
        this.tasks = new ArrayList<>();
    }

    public boolean addTask(Task task) {
        int value = 1;
        if (task instanceof CountDownTask) value = ((CountDownTask) task).getValue();
        if (task.isFinished() || isFull() || value == 0) {
            return false;
        } else {
            return tasks.add(task);
        }
    }

    public boolean execute() {
        if (!isEmpty()) {
            counter++;
            if (counter == tasks.size()) counter = 0;
            Task task = tasks.get(counter);
            task.execute();
            if (task.isFinished()) {
                tasks.remove(task);
                counter--;
            }
            return true;
        }
        return false;
    }

    public boolean isFull() {
        return tasks.size() == capacity;
    }

    public boolean isEmpty() {
        return tasks.size() == 0;
    }

}
