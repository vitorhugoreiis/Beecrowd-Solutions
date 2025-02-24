import java.util.Scanner;

public class BEE1018 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int N, resto, nota100, nota50, nota20, nota10, nota5, nota2, nota1;
        N = scr.nextInt();
        System.out.println(N);
        // Inicializa a variável "resto" com o valor total lido
        resto = N;
        // Calcula a quantidade de cédulas de cada tipo e atualiza o restante
        nota100 = resto / 100;
        resto = resto % 100;

        nota50 = resto / 50;
        resto = resto % 50;

        nota20 = resto / 20;
        resto = resto % 20;

        nota10 = resto / 10;
        resto = resto % 10;

        nota5 = resto / 5;
        resto = resto % 5;

        nota2 = resto / 2;
        resto = resto % 2;

        nota1 = resto; // o que restou serao as cedulas de 1

        System.out.printf("%d nota(s) de R$ 100,00%n", nota100);
        System.out.printf("%d nota(s) de R$ 50,00%n", nota50);
        System.out.printf("%d nota(s) de R$ 20,00%n", nota20);
        System.out.printf("%d nota(s) de R$ 10,00%n", nota10);
        System.out.printf("%d nota(s) de R$ 5,00%n", nota5);
        System.out.printf("%d nota(s) de R$ 2,00%n", nota2);
        System.out.printf("%d nota(s) de R$ 1,00%n", nota1);

        scr.close();
    }
}
