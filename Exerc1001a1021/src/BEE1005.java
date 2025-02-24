import java.util.Scanner;

public class BEE1005 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        float a, b, pesoA, pesoB, media;
        a = scr.nextFloat();
        b = scr.nextFloat();
        pesoA = 3.5f;
        pesoB = 7.5f;
        media = (a * pesoA + b * pesoB) / (pesoA + pesoB);
        System.out.printf("MEDIA = %.5f%n" , media);
        scr.close();
    }
}
