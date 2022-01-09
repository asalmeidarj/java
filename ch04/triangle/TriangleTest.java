package ch04.triangle;

public class TriangleTest {
    public static void main(String[] args) {

        Point A = new Point();
        Point B = new Point();
        Point C = new Point();

        A.setCoordenates(0, 0);
        B.setCoordenates(3, 0);
        C.setCoordenates(0, 4);

        Triangle triangle = new Triangle(A, B, C);

        double area = triangle.area();
        double perimeter = triangle.perimeter();
        Point G = triangle.baryCenter();

        System.out.println("Area: "+ area);
        System.out.print("Lados: ");
        System.out.print(triangle.AB_lenght() + "; ");
        System.out.print(triangle.AC_lenght() + "; ");
        System.out.print(triangle.BC_lenght() + "\n");
        System.out.println("perimetro: "+ perimeter);
        System.out.print("Baricentro: ");
        System.out.println("(" + G.getCoordenateX() + "; " + G.getCoordenateY() + ")");
    }
}
