import java.util.Scanner;

public class BEE1048 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        double salario = scr.nextDouble();

        if (salario <= 400.00) {
            double novoSalario = (salario * 0.15) + salario;
            double reajuste = salario * 0.15;
            System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 15 %%%n", novoSalario, reajuste);
        } else if ( salario >= 400.01 && salario <= 800.00) {
            double novoSalario = (salario * 0.12) + salario;
            double reajuste = salario * 0.12;
            System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 12 %%%n", novoSalario, reajuste);
        } else if (salario >= 800.01 && salario <= 1200.00) {
            double novoSalario = (salario * 0.10) + salario;
            double reajuste = salario * 0.10;
            System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 10 %%%n", novoSalario, reajuste);
        } else if (salario >= 1200.01 && salario <= 2000.00) {
            double novoSalario = (salario * 0.07) + salario;
            double reajuste = salario * 0.07;
            System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 7 %%%n", novoSalario, reajuste);
        } else {
            double novoSalario = (salario * 0.04) + salario;
            double reajuste = salario * 0.04;
            System.out.printf("Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: 4 %%%n", novoSalario, reajuste);
        }
        scr.close();
    }
}
