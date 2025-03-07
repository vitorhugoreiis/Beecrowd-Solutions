import java.util.Scanner;

public class BEE1042 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();

        // Encontrando o menor valor
        int menor = Math.min(a, Math.min(b, c));
        // Encontrando o maior valor
        int maior = Math.max(a, Math.max(b, c));
        // Encontrando o valor intermediário
        int meio = a + b + c - menor - maior;

        // Imprimindo em ordem crescente
        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);

        // Linha em branco
        System.out.println();

        // Imprimindo na ordem original
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        scr.close();
    }
}
