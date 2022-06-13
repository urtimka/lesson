package ru.stqa.pft.sandbox;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 6);//треугольник
        System.out.println("Площадь треугольника " + r.a + " и " + r.b + " = " + r.area());

        Square s = new Square(5); //квадрат
        System.out.println("Площадь квадрата " + s.l + " = " + s.area());


        Point a = new Point(1, 6);
        Point b = new Point(5, 9);
        System.out.println("Расстояние между двумя точками равно (вычисление функцией) " + Point.distance(a, b));
        System.out.println("Расстояние между двумя точками равно (вычисление методом) " + a.distance(b));
    }

}

