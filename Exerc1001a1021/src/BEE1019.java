import java.util.Scanner;

public class BEE1019 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int totalSegundos,horas, minutos, segundos;
        totalSegundos = scr.nextInt();
        horas = totalSegundos / 3600; // Hours
        minutos = (totalSegundos % 3600) / 60; // Minutes
        segundos = totalSegundos % 60; // Reamining seconds

        System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
        scr.close();
    }
}
