import java.util.Scanner;

public class BEE1012 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double A,B,C;
        double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        A = scr.nextDouble();
        B = scr.nextDouble();
        C = scr.nextDouble();
        areaTriangulo = (A * C) / 2;
        System.out.printf("TRIANGULO = %.3f%n", areaTriangulo);
        areaCirculo = 3.14159 * Math.pow(C,2);
        System.out.printf("CIRCULO = %.3f%n", areaCirculo);
        areaTrapezio = ((A + B) * C) / 2;
        System.out.printf("TRAPEZIO = %.3f%n", areaTrapezio);
        areaQuadrado = Math.pow(B,2);
        System.out.printf("QUADRADO = %.3f%n", areaQuadrado);
        areaRetangulo = A * B;
        System.out.printf("RETANGULO = %.3f%n", areaRetangulo);
        scr.close();
    }
}
