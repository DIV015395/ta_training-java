package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_5.Line_Intersection;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d;%d)", x, y);
    }
}
