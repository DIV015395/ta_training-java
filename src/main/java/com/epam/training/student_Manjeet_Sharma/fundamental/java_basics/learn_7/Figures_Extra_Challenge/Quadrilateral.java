package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_7.Figures_Extra_Challenge;

public class Quadrilateral extends  Figure {
    private Point a, b, c, d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

        if (a == null || b == null || c == null || d == null) throw new IllegalArgumentException("Point is null");
        double lengthAB = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));                       //находим длины сторон четырехугольника
        double lengthBC = Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2));
        double lengthCD = Math.sqrt(Math.pow(c.getX() - d.getX(), 2) + Math.pow(c.getY() - d.getY(), 2));
        double lengthDA = Math.sqrt(Math.pow(d.getX() - a.getX(), 2) + Math.pow(d.getY() - a.getY(), 2));
        double lengthAC = Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2));                      //находим длины диагоналей
        double lengthBD = Math.sqrt(Math.pow(b.getX() - d.getX(), 2) + Math.pow(b.getY() - d.getY(), 2));

        double halfPerimeter1 = (lengthAB + lengthDA + lengthBD) / 2;
        double halfPerimeter2 = (lengthBC + lengthCD + lengthBD) / 2;
        double halfPerimeter3 = (lengthAB + lengthBC + lengthAC) / 2;
        double halfPerimeter4 = (lengthDA + lengthCD + lengthAC) / 2;
        double s1 = Math.sqrt(halfPerimeter1 * (halfPerimeter1 - lengthAB) * (halfPerimeter1 - lengthDA) * (halfPerimeter1 - lengthBD));
        double s2 = Math.sqrt(halfPerimeter2 * (halfPerimeter2 - lengthBC) * (halfPerimeter2 - lengthCD) * (halfPerimeter2 - lengthBD));
        double s3 = Math.sqrt(halfPerimeter3 * (halfPerimeter3 - lengthAB) * (halfPerimeter3 - lengthBC) * (halfPerimeter3 - lengthAC));
        double s4 = Math.sqrt(halfPerimeter4 * (halfPerimeter4 - lengthDA) * (halfPerimeter4 - lengthCD) * (halfPerimeter4 - lengthAC));

        if (s1 <= 0.001 || s2 <= 0.001 || s3 <= 0.001 || s4 <= 0.001)
            throw new IllegalArgumentException("area is invalid");

        double k1, k2, b1, b2;
        if (c.getY() == a.getY()) k1 = 0;
        else k1 = (c.getY() - a.getY()) / (c.getX() - a.getX());
        if (b.getY() == d.getY()) k2 = 0;
        else k2 = (d.getY() - b.getY()) / (d.getX() - b.getX());
        if (k1 == 0 && k2 == 0) throw new IllegalArgumentException("invalid Quadrilateral");
        if (k1 == k2) throw new IllegalArgumentException("invalid Quadrilateral");
        b1 = a.getY() - k1 * a.getX();
        b2 = b.getY() - k2 * b.getX();
        double x, y1, y2;
        x = (b2 - b1) / (k1 - k2);
        y1 = k1 * x + b1;
        y2 = k2 * x + b2;
        if (Math.abs(y1 - y2) >= 0.0000001) throw new IllegalArgumentException("not intersection");
        if (a.getX() <= x && c.getX() <= x) throw new IllegalArgumentException("bad intersection");
        if ((lengthAC+lengthBD)<(lengthBC+lengthDA)) throw new IllegalArgumentException("bad born");
    }

    @Override
    public Point centroid() {
        double middleX1 = (a.getX()+b.getX()+c.getX()) / 3;         //ABC
        double middleY1 = (a.getY()+b.getY()+c.getY()) / 3;
        double middleX2 = (a.getX()+d.getX()+c.getX()) / 3;         //ADC
        double middleY2 = (a.getY()+d.getY()+c.getY()) / 3;
        double middleX3 = (a.getX()+b.getX()+d.getX()) / 3;         //BAD
        double middleY3 = (a.getY()+b.getY()+d.getY()) / 3;
        double middleX4 = (b.getX()+c.getX()+d.getX()) / 3;         //BCD
        double middleY4 = (b.getY()+c.getY()+d.getY()) / 3;
        double k1, k2, b1, b2;
        if (middleY1 == middleY2) k1 = 0;
        else k1 = (middleY1 - middleY2) / (middleX1 - middleX2);
        if (middleY3 == middleY4) k2 = 0;
        else k2 = (middleY3 - middleY4) / (middleX3 - middleX4);
        b1 = middleY1 - k1 * middleX1;
        b2 = middleY3 - k2 * middleX3;
        double x, y1;
        x = (b2 - b1) / (k1 - k2);
        y1 = k1 * x + b1;

        return new Point(x,y1);
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if (!(figure instanceof Quadrilateral)) {
            return false;
        }
        if (!((Quadrilateral) figure).a.likeA(this.a) && !((Quadrilateral) figure).a.likeB(this.b) && !((Quadrilateral) figure).a.likeC(this.c) && !((Quadrilateral) figure).a.likeD(this.d)) {
            return false;
        }
        if (!((Quadrilateral) figure).b.likeA(this.a) && !((Quadrilateral) figure).b.likeB(this.b) && !((Quadrilateral) figure).b.likeC(this.c) && !((Quadrilateral) figure).b.likeD(this.d)) {
            return false;
        }
        if (!((Quadrilateral) figure).c.likeA(this.a) && !((Quadrilateral) figure).c.likeB(this.b) && !((Quadrilateral) figure).c.likeC(this.c) && !((Quadrilateral) figure).c.likeD(this.d)) {
            return false;
        }
        if (!((Quadrilateral) figure).d.likeA(this.a) && !((Quadrilateral) figure).d.likeB(this.b) && !((Quadrilateral) figure).d.likeC(this.c) && !((Quadrilateral) figure).d.likeD(this.d)) {
            return false;
        }
        return true;
    }
}
