import java.util.Scanner;

public class BEE1015 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double x1, y1, x2, y2, distancia;
        x1 = scr.nextDouble();
        y1 = scr.nextDouble();
        x2 = scr.nextDouble();
        y2 = scr.nextDouble();
        // Calcula a distância usando a fórmula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("%.4f%n", distancia);
        scr.close();
    }
}
