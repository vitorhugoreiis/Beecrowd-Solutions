import java.util.Scanner;

public class BEE1007 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a, b, c, d, diferenca;
        a = scr.nextInt();
        b = scr.nextInt();
        c = scr.nextInt();
        d = scr.nextInt();
        diferenca = (a*b-c*d);
        System.out.println("DIFERNCA = " + diferenca);
        scr.close();
    }
}
