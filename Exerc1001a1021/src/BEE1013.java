import java.util.Scanner;

import static java.lang.Math.abs;

public class BEE1013 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a, b, c, MaiorAB, maior;
        a = scr.nextInt();
        b = scr.nextInt();
        c = scr.nextInt();
        MaiorAB = (a+b+abs(a-b)) / 2;
        maior = (MaiorAB + c + abs(MaiorAB - c)) / 2;
        System.out.println(maior + " eh o maior");
        scr.close();
    }
}
