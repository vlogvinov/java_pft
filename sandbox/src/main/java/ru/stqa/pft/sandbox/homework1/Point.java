package ru.stqa.pft.sandbox.homework1;

import static java.lang.Math.pow;

public class Point {
    public double a;
    public double b;

    public Point(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double distance(Point p) {
        return  Math.sqrt(pow((this.a - p.a), 2) + (pow((this.b - p.b), 2)));
    }
}
