import java.util.Scanner;

/*
1) Leia 3 valores de ponto flutuante A, B e C
2) e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados.
3) A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:
 */
public class BEE1045 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        // LEITURA DOS VALORES
        double a = scr.nextDouble();
        double b = scr.nextDouble();
        double c = scr.nextDouble();

        // ORDENACAO EM ORDEM DECRESCENTE A >= B >= C
        double A = Math.max(a, Math.max(b,c));
        double C = Math.min(a, Math.min(b,c));
        double B = (a + b + c ) - (A + C);

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C,2)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if ( A == B || A == C || B == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        scr.close();
    }
}
