public class Main {

    public static void main(String[] args) {
        Shapes a1,a2,a3;
        a1 = new Rectangle();
        a2 = new Triangle();
        a3 = new Circle();

        a1.Center();
        a1.Area();
        a1.Circumference();

        System.out.println();

        a2.Center();
        a2.Area();
        a2.Circumference();

        System.out.println();

        a3.Center();
        a3.Area();
        a3.Circumference();

    }
}

abstract class Shapes{
    abstract void Center();
    abstract void Area();
    abstract void Circumference();
}

class Rectangle extends Shapes{

    int length = 8;
    int width = 3;

    @Override
    void Center() {
        System.out.println("Center = " + (length / 2) + (width / 2));
    }

    @Override
    void Area() {
        System.out.println("Area = " + (length * width));
    }

    @Override
    void Circumference() {
        System.out.println("Circumference = " + (2 * (length+width)));
    }
}

class Triangle extends Shapes{

    int a = 8;
    int b = 5;
    int c = 8;


    @Override
    void Center() {
        System.out.println("Center = " + (a) + "," + (b) + "," + (c));
    }

    @Override
    void Area() {
        System.out.println("Area = " + (a * b) / 2);
    }

    @Override
    void Circumference() {
        System.out.println("Circumference = " + (a + b + c));    }
}

class Circle extends Shapes{

    float radius = 5;

    @Override
    void Center() {
        System.out.println("Center = " + (radius + radius) / 2);
    }

    @Override
    void Area() {
        System.out.println("Area = " + (Math.PI * Math.pow(radius, 2)));
    }

    @Override
    void Circumference() {
        System.out.println("Circumference = " + (2 * radius * Math.PI));
    }
}
