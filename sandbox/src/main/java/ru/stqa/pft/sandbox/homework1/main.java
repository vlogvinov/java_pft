package ru.stqa.pft.sandbox.homework1;

import static java.lang.Math.pow;

public class main {
    public static void main(String[] args) {
        Point p1 = new Point(3, -4);
        Point p2 = new Point(6, 0);

        System.out.println(distance(p1, p2));

    }

    public static double distance(Point p1, Point p2) {
        double distance = Math.sqrt(pow((p2.a - p1.a), 2) + (pow((p2.b - p1.b), 2)));
        return distance;
    }

}
