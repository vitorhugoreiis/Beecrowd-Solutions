/*
1) Você deve fazer um programa que leia um valor qualquer
2) e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra.
3) Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000

 */
import java.util.Scanner;

public class BEE1037 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        double anyValue;
        anyValue = scr.nextDouble();

        if (anyValue <= 25.00 && anyValue >= 0.00) {
            System.out.println("Range [0,25]\n" + anyValue);
        } else if (anyValue >= 25.01 && anyValue <= 50.00) {
            System.out.println("Range (25,50]\n" + anyValue);
        } else if (anyValue >= 50.01 && anyValue <= 75.00) {
            System.out.println("Range (50,75]\n" + anyValue);
        } else if (anyValue >= 75.01 && anyValue <= 100.00) {
            System.out.println("Range (75,100]\n" + anyValue);
        } else {
            System.out.println("Out of range");
        }

        scr.close();
    }
}