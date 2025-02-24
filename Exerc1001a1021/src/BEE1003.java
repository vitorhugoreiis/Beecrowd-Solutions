import java.util.Scanner;

public class BEE1003 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int A, B, soma;
        A = scr.nextInt();
        B = scr.nextInt();
        soma = A + B;
        System.out.println("SOMA = "+soma);
        scr.close();
    }
}
