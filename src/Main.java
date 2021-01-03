public class Main {

    public static void main(String[] args) {
        Shapes a1,a2,a3;
        EuclideanDistanceTo e1;
        a1 = new Rectangle1();
        a2 = new Triangle1();
        a3 = new Circle1();
        e1 = new Distance();

        // Print methods
        System.out.println("Rectangle:");
        a1.Center();
        a1.Area();
        a1.Circumference();

        System.out.println();
        System.out.println("Triangle:");
        a2.Center();
        a2.Area();
        a2.Circumference();

        System.out.println();
        System.out.println("Circle:");;
        a3.Center();
        a3.Area();
        a3.Circumference();

        System.out.println();
        System.out.println("Euclidean distances:");
        e1.EuclideanDistance();

    }
}
// Abstract class for euclidean distance
abstract class EuclideanDistanceTo{
    abstract void EuclideanDistance();
}

// abstract class for shapes
abstract class Shapes{
    abstract void Center();
    abstract void Area();
    abstract void Circumference();
}

class Rectangle1 extends Shapes {
    // Length
    int X1 = 0;
    int X2 = 8;
    // Width
    int Y1 = 0;
    int Y2 = 4;

    @Override
    void Center() {
        System.out.println("Center = " + (X1 + X2 / 2) + (Y1 + Y2 / 2));
    }

    @Override
    void Area() {
        System.out.println("Area = " + (X1 + X2) * (Y1 + Y2));
    }

    @Override
    void Circumference() {
        System.out.println("Circumference = " + (2 * ((X2 - X1) + (Y2 - Y1))));
    }
}

class Triangle1 extends Shapes {
    // Base
    int X1 = 8;
    int X2 = 16;

    // Sides
    int Y1 = 4;
    int X3 = 4;

    @Override
    void Center() {
        System.out.println("Center = " + X1 + " - " + X2 + " - " + Y1 + " - " + X3);
    }

    @Override
    void Area() {
        System.out.println("Area = " + Y1 * (X2 - X1) / 2);
    }

    @Override
    void Circumference() {
        System.out.println("Circumference = " + (X2 + X1 + X3 + Y1));
    }
}

class Circle1 extends Shapes {
    // Radius
    float radius = 5;

    // Center
    int Circ1CentX = 5;
    int CircCentY = 5;

    @Override
    void Center() {
        System.out.println("Center = " + Circ1CentX + "," + CircCentY);
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

class Distance extends EuclideanDistanceTo {
    // Rectangle1 center
    int Rect1CentX = 8;
    int Rect1CentY = 4;

    // Circle1 center
    int Circ1CentX = 5;
    int Circ1CentY = 5;

    // Triangle1 center
    int TriCentX1 = 8;
    int TriCentX2 = 16;
    int TriCentY1 = 4;
    int TriCentY2 = 4;

    @Override
    void EuclideanDistance() {
        System.out.println("Euclidean distance from Triangle1 to Rectangle1 = "
                + Math.sqrt(Math.pow(TriCentX1 - TriCentX2 - TriCentY1 - TriCentY2, 2) + Math.pow(Rect1CentX - Rect1CentY, 2)));

        System.out.println("Euclidean distance from Rectangle1 to Circle1 = "
                + Math.sqrt(Math.pow(Rect1CentX - Rect1CentY, 2) + Math.pow(Circ1CentX - Circ1CentY, 2)));

        System.out.println("Euclidean distance from Triangle1 to Circle1 = "
                + Math.sqrt(Math.pow(TriCentX1 - TriCentX2 - TriCentY1 - TriCentY2, 2) + Math.pow(Circ1CentX - Circ1CentY, 2)));
    }
}