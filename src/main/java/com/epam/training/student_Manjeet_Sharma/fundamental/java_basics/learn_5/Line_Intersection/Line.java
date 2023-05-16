package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_5.Line_Intersection;

public class Line {
    int k;
    int b;
    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }
    public Point intersection(Line other) {
        if (this.k == other.k) {
            return null;
        }
        if (this.b == other.b) {
            int x = 0;
            int y = this.b;
            return new Point(x,y);
        } else {
            int x = (other.b - this.b) / (this.k - other.k);
            int y = (this.k * x) + this.b;
            return new Point(x, y);
        }
    }
}
