package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_7.Figures;

class Circle extends Figure {
    double radius;
    private Point a;
    double PI = Math.PI;
    public Circle (Point a, double radius) {
        this.a = a;
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI*radius*radius;
    }

    @Override
    public String pointsToString() {
        return "(" + a.getX() +"," + a.getY()+ ")";
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[" + pointsToString() + radius+"]";
    }

    @Override
    public Point leftmostPoint() {
        double a1 = a.getX()-radius;
        Point point = new Point(a1, a.getY());
        return point;
    }
}
