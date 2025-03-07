/*
Leia 2 valores inteiros (A e B).
Após, o programa deve mostrar uma mensagem "Sao Multiplos"
ou "Nao sao Multiplos",
 indicando se os valores lidos são múltiplos entre si.
 */
import java.util.Scanner;

public class BEE1044 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int a = scr.nextInt();
        int b = scr.nextInt();
        int resto = a % b;
        int resto1 = b % a;

        if ( resto == 0  || resto1 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }


        scr.close();
    }
}
