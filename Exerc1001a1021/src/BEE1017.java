import java.util.Scanner;

public class BEE1017 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int tempoGastoHoras, velocidadeMedia;
        double distanciaPercorrida, litrosNecessarios;
        tempoGastoHoras = scr.nextInt();
        velocidadeMedia = scr.nextInt();
        distanciaPercorrida = tempoGastoHoras * velocidadeMedia;
        litrosNecessarios = distanciaPercorrida / 12;
        System.out.printf("%.3f%n",litrosNecessarios);
        scr.close();
    }
}
