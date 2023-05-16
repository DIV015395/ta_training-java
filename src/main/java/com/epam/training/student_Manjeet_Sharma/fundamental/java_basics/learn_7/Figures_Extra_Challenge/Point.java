package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_7.Figures_Extra_Challenge;

import java.util.Objects;

class Point {
    private double x;
    private double y;

    public Point(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
    public boolean like (Point b) {
        if (b == null) return false;
        double distanceX = Math.abs(this.x - b.x);
        double distanceY = Math.abs(this.y - b.y);
        if (distanceX > 0.001 || distanceY >0.001) return false;
        return true;
    }
    public boolean likeA (Point a1){
        if (a1 == null) return false;
        double distanceX = Math.abs(this.x - a1.x);
        double distanceY = Math.abs(this.y - a1.y);
        if (distanceX > 0.001 || distanceY >0.001) return false;
        return true;
    }
    public boolean likeB (Point b1){
        if (b1 == null) return false;
        double distanceX = Math.abs(this.x - b1.x);
        double distanceY = Math.abs(this.y - b1.y);
        if (distanceX > 0.001 || distanceY >0.001) return false;
        return true;
    }
    public boolean likeC (Point c1){
        if (c1 == null) return false;
        double distanceX = Math.abs(this.x - c1.x);
        double distanceY = Math.abs(this.y - c1.y);
        if (distanceX > 0.001 || distanceY >0.001) return false;
        return true;
    }
    public boolean likeD (Point d1){
        if (d1 == null) return false;
        double distanceX = Math.abs(this.x - d1.x);
        double distanceY = Math.abs(this.y - d1.y);
        if (distanceX > 0.001 || distanceY >0.001) return false;
        return true;
    }
}
