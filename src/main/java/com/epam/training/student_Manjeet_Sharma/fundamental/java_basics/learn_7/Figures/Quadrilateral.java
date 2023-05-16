package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_7.Figures;

class Quadrilateral extends Figure {
    double length1, length2, length3, length4, length5;
    private Point a, b, c, d;

    public Quadrilateral (Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        length1 = Math.sqrt(Math.pow(a.getX()-b.getX(),2) + Math.pow(a.getY()-b.getY(),2));                              //находим длины сторон четырехугольника и одной диагонали
        length2 = Math.sqrt(Math.pow(a.getX()-d.getX(),2) + Math.pow(a.getY()-d.getY(),2));
        length3 = Math.sqrt(Math.pow(b.getX()-c.getX(),2) + Math.pow(b.getY()-c.getY(),2));
        length4 = Math.sqrt(Math.pow(c.getX()-d.getX(),2) + Math.pow(c.getY()-d.getY(),2));
        length5 = Math.sqrt(Math.pow(a.getX()-c.getX(),2) + Math.pow(a.getY()-c.getY(),2));
    }

    @Override
    public double area() {
        double halfPerimeter1 = (length1+length3+length5)/2;
        double halfPerimeter2 = (length2+length4+length5)/2;
        double s1 = Math.sqrt(halfPerimeter1*(halfPerimeter1-length1)*(halfPerimeter1-length3)*(halfPerimeter1-length5));
        double s2 = Math.sqrt(halfPerimeter2*(halfPerimeter2-length2)*(halfPerimeter2-length4)*(halfPerimeter2-length5));
        return s1+s2;
    }

    @Override
    public String pointsToString() {
        return "(" + a.getX() + "," + a.getY() + ")(" +
                b.getX() + "," + b.getY() + ")(" +
                c.getX() + "," + c.getY() + ")(" +
                d.getX() + "," + d.getY() + ")";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Point leftmostPoint() {
        if (a.getX() <= b.getX() && a.getX() <= c.getX() && a.getX() <= d.getX()) {
            return a;
        }
        if (b.getX() <= a.getX() && b.getX() <= c.getX() && b.getX() <= d.getX()) {
            return b;
        }
        if (c.getX() <= a.getX() && c.getX() <= b.getX() && c.getX() <= d.getX()) {
            return c;
        } else {
            return d;
        }
    }
}
