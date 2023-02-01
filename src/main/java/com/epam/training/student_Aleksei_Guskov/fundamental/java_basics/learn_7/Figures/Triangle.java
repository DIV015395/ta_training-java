package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_7.Figures;

class Triangle extends Figure {
    double length1, length2, length3;
    private Point a, b, c;
    public Triangle (Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        length1 = Math.sqrt(Math.pow(a.getX()- b.getX(),2)+Math.pow(a.getY()-b.getY(),2));                              //находим длины сторон треугольнка
        length2 = Math.sqrt(Math.pow(a.getX()- c.getX(),2)+Math.pow(a.getY()-c.getY(),2));
        length3 = Math.sqrt(Math.pow(b.getX()- c.getX(),2)+Math.pow(b.getY()-c.getY(),2));
    }

    @Override
    public double area() {
        double halfPerimeter = (length1+length2+length3)/2;                           //находим полупериметр для формулы Герона
        double s = Math.sqrt(halfPerimeter*(halfPerimeter-length1)*(halfPerimeter-length2)*(halfPerimeter-length3));    //вычисляем площадь по формуле Герона
        return s;
    }
    @Override
    public String pointsToString() {
        return "(" +a.getX()+ "," +a.getY()+")(" +b.getX()+ "," +b.getY()+ ")(" +c.getX()+ "," +c.getY() + ")";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Point leftmostPoint() {
        if (a.getX() <= b.getX() && a.getX() <= c.getX()) return a;
        if (b.getX() <= a.getX() && b.getX() <= c.getX()) return b;
        else return c;
    }
}
