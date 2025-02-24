import java.util.Scanner;

public class BEE1002 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        double n = 3.14159;
        double raio;
        double area;

        raio = scr.nextDouble();

        area = n * Math.pow(raio,2);
        System.out.printf("A = %.4f%n", area);

        scr.close();
    }
}
