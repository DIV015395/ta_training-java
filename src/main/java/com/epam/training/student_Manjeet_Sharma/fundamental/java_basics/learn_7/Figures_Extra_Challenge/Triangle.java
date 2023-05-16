package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_7.Figures_Extra_Challenge;

public class Triangle extends Figure{
    Point a, b, c;
    public Triangle (Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (a == null || b == null || c == null) throw new IllegalArgumentException("Point is null");

        double length1 = Math.sqrt(Math.pow(a.getX()- b.getX(),2)+Math.pow(a.getY()-b.getY(),2));                       //находим длины сторон треугольнка
        double length2 = Math.sqrt(Math.pow(a.getX()- c.getX(),2)+Math.pow(a.getY()-c.getY(),2));
        double length3 = Math.sqrt(Math.pow(b.getX()- c.getX(),2)+Math.pow(b.getY()-c.getY(),2));

        if (length1 == length2 + length3 || length2 == length1+length3 || length3 == length1+length2){                  //проверяем на вырожденность по условиям длин треугольника
            throw new IllegalArgumentException("The condition on the lengths of the sides is not met");
        }
        if ((a.getX() == b.getX() && a.getY() == b.getY()) || (a.getX() == c.getX() && a.getY() == c.getY()) || (b.getX() == c.getX() && b.getY() == c.getY())){    //проверяем точки вершин треугольника на наложение
            throw new IllegalArgumentException("Two or more dots overlap");
        }
        double halfPerimeter = ((length1)+(length2)+(length3))/2;                           //находим полупериметр для формулы Герона
        double s = Math.sqrt(halfPerimeter*(halfPerimeter-length1)*(halfPerimeter-length2)*(halfPerimeter-length3));    //вычисляем площадь по формуле Герона
        if (s <= 0.001) throw new IllegalArgumentException("Area is null");
    }
    @Override
    public Point centroid() {
        double centroidX = (a.getX() + b.getX() + c.getX()) / 3;                        //определяем x координаты центроида
        double centroidY = (a.getY() + b.getY() + c.getY()) / 3;                        //определяем y координаты центроида
        return new Point (centroidX,centroidY);
    }

    @Override
    public boolean isTheSame(Figure figure) {
        return false;
    }
}
