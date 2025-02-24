import java.util.Scanner;

public class BEE1011 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double raio, volume;
        double pi = 3.14159;
        raio = scr.nextDouble();
        volume = (4/3.0) * pi * Math.pow(raio,3);
        System.out.printf("VOLUME = %.3f%n", volume);
        scr.close();
    }
}
