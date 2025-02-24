import java.util.Scanner;

public class BEE1009 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String vendedorName;
        double salarioFixo, totalDeVendas, totalAReceber;
        vendedorName = scr.nextLine();
        salarioFixo = scr.nextDouble();
        totalDeVendas = scr.nextDouble();
        totalAReceber = totalDeVendas * 0.15 + salarioFixo;
        System.out.printf("TOTAL = R$ %.2f%n", totalAReceber);
        scr.close();
    }
}
