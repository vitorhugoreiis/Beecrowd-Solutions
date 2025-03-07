import java.util.Scanner;

public class BEE1051 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        double renda = scr.nextDouble();
        double impostoDeRenda = 0.0;

        if (renda <= 2000.00) {
            impostoDeRenda = 0.0;
        } else {
            double restante = renda - 2000.00;

            // Faixa entre 2000.01 e 3000.00 (8%)
            if (restante <= 1000.00) {
                impostoDeRenda += restante * 0.08;
            } else {
                impostoDeRenda += 1000.00 * 0.08; // maximo 80
                restante -= 1000.00; // subtrai os 1k tributado

                // Faixa entre 3000.01 e 4500.00 (18%)
                if (restante <= 1500.00) {
                    impostoDeRenda += restante * 0.18;
                } else {
                    impostoDeRenda += 1500.00 * 0.18; // maximo 270
                    restante -= 1500.00; // subtrai 1k500 tributado

                    // Faixa acima de 4500.00 (28%)
                    impostoDeRenda += restante * 0.28;
                }
            }
        }
        if (impostoDeRenda == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", impostoDeRenda);
        }
        scr.close();
    }
}
