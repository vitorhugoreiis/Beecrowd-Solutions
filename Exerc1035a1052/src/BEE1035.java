/*
 A seguir,
 1) se B for maior do que C
 2) e se D for maior do que A,
 3) e a soma de C com D for maior que a soma de A e B
 4) e se C e D, ambos, forem positivos
 5) e se a variável A for par
 */
import java.util.Scanner;

public class BEE1035 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int a, b, c, d;

        a = scr.nextInt();
        b = scr.nextInt();
        c = scr.nextInt();
        d = scr.nextInt();
        // 1  2   3   4   5
        if (b > c && d > a && (c + d > a + b) && (c > 0 && d > 0 ) && (a % 2 == 0)){
            System.out.println("Valores aceitos");
        } else{
            System.out.println("Valores nao aceitos");
        }

        scr.close();
    }
}