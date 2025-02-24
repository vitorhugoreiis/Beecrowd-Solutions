import java.util.Scanner;

public class BEE1008 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int numFunc, horasTrabalhadas;
        double valorPorHora, salario;
        numFunc = scr.nextInt();
        horasTrabalhadas = scr.nextInt();
        valorPorHora = scr.nextDouble();
        salario = horasTrabalhadas * valorPorHora;
        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", numFunc,salario);
        scr.close();
    }
}
