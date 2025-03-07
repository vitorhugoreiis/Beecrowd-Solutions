import java.util.Scanner;

public class BEE1043 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        double a = scr.nextDouble();
        double b = scr.nextDouble();
        double c = scr.nextDouble();
        double perimetro = a + b + c;
        double area = (a + b) * c/2;

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else  {
            System.out.printf("Area = %.1f%n", area);
        }

        scr.close();
    }
}
