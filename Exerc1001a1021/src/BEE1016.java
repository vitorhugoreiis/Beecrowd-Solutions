import java.util.Scanner;

public class BEE1016 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int distanciaKM, minutos;
        distanciaKM = scr.nextInt();
        minutos = distanciaKM * 2;
        System.out.println( minutos + " minutos");
        scr.close();
    }
}
