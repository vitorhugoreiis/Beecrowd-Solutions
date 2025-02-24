import java.util.Scanner;
public class BEE1001 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int a, b;

        a = scr.nextInt();
        b = scr.nextInt();

        int x = a + b;

        System.out.println("X = " + x);

        scr.close();
    }
}
