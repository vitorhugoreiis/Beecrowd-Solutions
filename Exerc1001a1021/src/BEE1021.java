import java.util.Scanner;

public class BEE1021 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double N = scr.nextDouble();

        // Converter o valor para centavos (integer)
        int totalCentavos = (int) Math.round(N * 100);

        // Cálculo das notas
        System.out.println("NOTAS:");
        int nota100 = totalCentavos / 10000; // R$ 100.00 = 10000 centavos
        totalCentavos = totalCentavos % 10000;

        int nota50 = totalCentavos / 5000;   // R$ 50.00 = 5000 centavos
        totalCentavos = totalCentavos % 5000;

        int nota20 = totalCentavos / 2000;   // R$ 20.00 = 2000 centavos
        totalCentavos = totalCentavos % 2000;

        int nota10 = totalCentavos / 1000;   // R$ 10.00 = 1000 centavos
        totalCentavos = totalCentavos % 1000;

        int nota5 = totalCentavos / 500;     // R$ 5.00 = 500 centavos
        totalCentavos = totalCentavos % 500;

        int nota2 = totalCentavos / 200;     // R$ 2.00 = 200 centavos
        totalCentavos = totalCentavos % 200;

        System.out.printf("%d nota(s) de R$ 100.00%n", nota100);
        System.out.printf("%d nota(s) de R$ 50.00%n", nota50);
        System.out.printf("%d nota(s) de R$ 20.00%n", nota20);
        System.out.printf("%d nota(s) de R$ 10.00%n", nota10);
        System.out.printf("%d nota(s) de R$ 5.00%n", nota5);
        System.out.printf("%d nota(s) de R$ 2.00%n", nota2);

        // Cálculo das moedas
        System.out.println("MOEDAS:");

        int moeda1 = totalCentavos / 100;  // R$ 1.00 = 100 centavos
        totalCentavos = totalCentavos % 100;

        int moeda050 = totalCentavos / 50; // R$ 0.50 = 50 centavos
        totalCentavos = totalCentavos % 50;

        int moeda025 = totalCentavos / 25; // R$ 0.25 = 25 centavos
        totalCentavos = totalCentavos % 25;

        int moeda010 = totalCentavos / 10; // R$ 0.10 = 10 centavos
        totalCentavos = totalCentavos % 10;

        int moeda005 = totalCentavos / 5;  // R$ 0.05 = 5 centavos
        totalCentavos = totalCentavos % 5;

        int moeda001 = totalCentavos;      // R$ 0.01 = 1 centavo

        System.out.printf("%d moeda(s) de R$ 1.00%n", moeda1);
        System.out.printf("%d moeda(s) de R$ 0.50%n", moeda050);
        System.out.printf("%d moeda(s) de R$ 0.25%n", moeda025);
        System.out.printf("%d moeda(s) de R$ 0.10%n", moeda010);
        System.out.printf("%d moeda(s) de R$ 0.05%n", moeda005);
        System.out.printf("%d moeda(s) de R$ 0.01%n", moeda001);

        scr.close();
    }
}
