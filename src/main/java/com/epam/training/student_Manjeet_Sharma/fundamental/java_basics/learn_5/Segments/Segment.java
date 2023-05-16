package com.epam.training.student_Manjeet_Sharma.fundamental.java_basics.learn_5.Segments;

class Segment {
    private Point start;
    private Point end;

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
        if ((start == null || end == null) ||
                (this.start.getX() == this.end.getX() &&
                        this.start.getY() == this.end.getY())) {            //проверка значений начала и конца отрезка на равность (вырожденность)
            throw new IllegalArgumentException("illegal arguments");
        }
    }

    double length() {
        return Math.sqrt(Math.pow(start.getX() - end.getX(), 2) + Math.pow(start.getY() - end.getY(), 2));
    }

    Point middle() {
        return new Point ((start.getX()+end.getX())/2,(start.getY()+ end.getY())/2);
    }

    Point intersection(Segment another) {
        if ((this.start == another.start) && (this.end == another.end)) {
            return null;
        }
        double k1, k2, b1, b2;
        if (this.end.getY() == this.start.getY()) {
            k1 = 0;
        } else {
            k1 = (this.end.getY() - this.start.getY()) / (this.end.getX() - this.start.getX());
        }
        if (another.end.getY() == another.start.getY()) {
            k2 = 0;
        } else {
            k2 = (another.end.getY() - another.start.getY()) / (another.end.getX() - another.start.getX());
        }
        if (k1 == 0 && k2 == 0) {
            return null;
        } else {
            b1 = this.start.getY() - k1 * this.start.getX();
            b2 = another.start.getY() - k2 * another.start.getX();
            double x, y, equalX1, equalX2, equalY1, equalY2, modX1, modX2, modY1, modY2;
            x = (b2 - b1) / (k1 - k2);
            y = k1 * x + b1;
            equalX1 = Math.abs(x-this.start.getX()) + Math.abs(x-this.end.getX());
            equalX2 = Math.abs(x-another.start.getX()) + Math.abs(x-another.end.getX());
            equalY1 = Math.abs(y-this.start.getY()) + Math.abs(y-this.end.getY());
            equalY2 = Math.abs(y-another.start.getY()) + Math.abs((y-another.end.getY()));
            modX1 = Math.abs(this.end.getX() - this.start.getX());
            modX2 = Math.abs(another.end.getX() - another.start.getX());
            modY1 = Math.abs(this.end.getY() - this.start.getY());
            modY2 = Math.abs((another.end.getY() - another.start.getY()));
            if (equalX1 == modX1 && equalX2 == modX2 && equalY1 == modY1 && equalY2 == modY2) {
                return new Point(x, y);
            } else {
                return null;
            }
        }
    }
}

