import java.util.Scanner;

public class BEE1004 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int A, B, PROD;

        A = scr.nextInt();
        B = scr.nextInt();

        PROD = A * B;

        System.out.println("PROD = " + PROD);


        scr.close();
    }
}
