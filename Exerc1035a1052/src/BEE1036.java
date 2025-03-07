/*
1) Leia 3 valores de ponto flutuante
2) e efetue o cálculo das raízes da equação de Bhaskara.
3) Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”,
4) caso haja uma divisão por 0 ou raiz de numero negativo.
 */
import java.util.Scanner;

public class BEE1036 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        double A = scr.nextDouble();
        double B = scr.nextDouble();
        double C = scr.nextDouble();

        double discriminante = Math.pow(B, 2) - 4 * A * C;;

        if (A != 0 && discriminante >= 0){
            double R1 = (-B + Math.sqrt(discriminante)) / (2*A) ;
            double R2 = (-B - Math.sqrt(discriminante)) / (2*A) ;

            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        } else {
            System.out.println("Impossivel calcular");
        }

        scr.close();
    }
}
