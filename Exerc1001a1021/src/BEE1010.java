import java.util.Scanner;

public class BEE1010 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int codPeca1, codPeca2, numPeca1, numPeca2;
        double precoPeca1, precoPeca2;
        codPeca1 = scr.nextInt();
        numPeca1 = scr.nextInt();
        precoPeca1 = scr.nextDouble();
        codPeca2 = scr.nextInt();
        numPeca2 = scr.nextInt();
        precoPeca2 = scr.nextDouble();
        System.out.printf("VALOR A PAGAR: R$ %.2f%n" ,((precoPeca1 * numPeca1) + (precoPeca2 * numPeca2)));
        scr.close();
    }
}
