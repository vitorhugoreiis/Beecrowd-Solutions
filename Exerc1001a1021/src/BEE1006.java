import java.util.Scanner;

public class BEE1006 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        double A, B, C, Media;

        A = scr.nextDouble();
        B = scr.nextDouble();
        C = scr.nextDouble();

        Media = (A * 2 + B * 3 + C * 5) / 10.0;
        System.out.printf("Media = %.1f%n", Media);

        scr.close();
    }
}
