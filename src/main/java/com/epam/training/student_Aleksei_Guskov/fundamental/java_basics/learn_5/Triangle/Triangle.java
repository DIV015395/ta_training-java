package com.epam.training.student_Aleksei_Guskov.fundamental.java_basics.learn_5.Triangle;

class Triangle {
    double length1, length2, length3;
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if ((a.getX() == b.getX() && a.getX() == c.getX() && b.getX() == c.getX()) || (a.getY() == b.getY() && a.getY() == c.getY() && b.getY() == c.getY())){      //проверяем точки координат треугольника на вырожденность
            throw new IllegalArgumentException("All points on one line");
        }
        length1 = Math.sqrt(Math.pow(a.getX()- b.getX(),2)+Math.pow(a.getY()-b.getY(),2));                              //находим длины сторон треугольнка
        length2 = Math.sqrt(Math.pow(a.getX()- c.getX(),2)+Math.pow(a.getY()-c.getY(),2));
        length3 = Math.sqrt(Math.pow(b.getX()- c.getX(),2)+Math.pow(b.getY()-c.getY(),2));
        if (length1 == length2 + length3 || length2 == length1+length3 || length3 == length1+length2){                  //проверяем на вырожденность по условиям длин стреугольника
            throw new IllegalArgumentException("The condition on the lengths of the sides is not met");
        }
        if ((a.getX() == b.getX() && a.getY() == b.getY()) || (a.getX() == c.getX() && a.getY() == c.getY()) || (b.getX() == c.getX() && b.getY() == c.getY())){    //проверяем точки вершин треугольника на аналожение
            throw new IllegalArgumentException("Two or more dots overlap");
        }
        //TODO
    }

    public double area() {
        double halfPerimeter = (length1+length2+length3)/2;                           //находим полупериметр для формулы Герона
        double s = Math.sqrt(halfPerimeter*(halfPerimeter-length1)*(halfPerimeter-length2)*(halfPerimeter-length3));    //вычисляем площадь по формуле Герона
        return s;
        //TODO
    }

    public Point centroid(){
        double centroidX = (a.getX() + b.getX() + c.getX()) / 3;                        //пределяем x координаты центроида (далее - y)
        double centroidY = (a.getY() + b.getY() + c.getY()) / 3;
        return new Point (centroidX,centroidY);
        //TODO
    }

}
