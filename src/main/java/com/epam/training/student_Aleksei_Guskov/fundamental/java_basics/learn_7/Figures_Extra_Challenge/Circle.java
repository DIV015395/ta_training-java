package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_7.Figures_Extra_Challenge;

public class Circle extends Figure{
    private Point a, a1;
    private double radius, radius1;
    public Circle (Point a, double radius) {
        this.a = a;
        this.radius = radius;
        if (radius <= 0 || a == null) throw new IllegalArgumentException("Point or radius is null");
    }

    @Override
    public Point centroid() {
        return a;
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if (!(figure instanceof Circle)) {
            return false;
        }

        if (!((Circle) figure).a.like(this.a)) {
            return false;
        }
        double distanceRad = Math.abs(this.radius - ((Circle) figure).radius);
        if (distanceRad > 0.001) return false;

        return true;
    }
}
