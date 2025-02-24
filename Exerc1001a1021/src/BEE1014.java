import java.util.Scanner;

public class BEE1014 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int distanciaTotalKM;
        double combustivelGasto, resultado;
        distanciaTotalKM = scr.nextInt();
        combustivelGasto = scr.nextDouble();
        resultado = distanciaTotalKM / combustivelGasto;
        System.out.printf("%.3f km/l%n", resultado );
        scr.close();
    }
}
