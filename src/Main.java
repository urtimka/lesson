public class Main {
    public static void main(String[] args) {
        hello("world");

        double li = 5;
        System.out.println("Площадь квадрата "+li+"="+area(li));
    }
    public static void hello(String x){
        System.out.println("Hello " + x+"!!");
    }

    public static double area(double l){
        return l*l;
    }
}