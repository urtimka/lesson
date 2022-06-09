import org.w3c.dom.css.Rect;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        Rectangle r = new Rectangle(4,6);//треугольник
        System.out.println("Площадь треугольника " + r.a + " и " + r.b + " = " + area(r));


        Square s = new Square(5); //квадрат
        System.out.println("Площадь квадрата " + s.l + " = " + area(s));
    }

    public static void hello(String x){
        System.out.println("Hello " + x +"!!");
    }

    public static double area(Square s){
        return s.l * s.l;
    }
    public static double area(Rectangle r){
        return r.a * r.b;
    }
}