import java.util.Scanner;

public class BEE1020 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int idade, anos, meses, dias, resto;
        idade = scr.nextInt();

        anos = idade / 365;
        resto = idade % 365;
        meses = resto / 30;
        dias = resto % 30;

        System.out.printf("%d ano(s)%n%d mes(es)%n%d dia(s)%n", anos, meses, dias);

        scr.close();
    }
}
