package ru.stqa.pft.sandbox;

class MyFirstProgram {
    public static void main(String[] args) {

        double length = 5;
        System.out.println("Площадь квадрата со стороной " + length + " = " + area(length));

        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b  + " = " + area(a, b));
    }
    
    public static double area(double l) {
        return l * l;
    }

    public static double area(double a, double b) {
        return a * b;
    }
}