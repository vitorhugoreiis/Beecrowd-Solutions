/*
1) Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno.
2) Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas
3) mostre esta média acompanhada pela mensagem "Media: "
4) e esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.".
5) Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.".
6) Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".
    1)No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno.
    2)Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada
    3)Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2).
    4) imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos).
    5) Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem "Media final: " seguido da média final para esse aluno.
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BEE1040 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        BigDecimal n1 = BigDecimal.valueOf(scr.nextDouble());
        BigDecimal n2 = BigDecimal.valueOf(scr.nextDouble());
        BigDecimal n3 = BigDecimal.valueOf(scr.nextDouble());
        BigDecimal n4 = BigDecimal.valueOf(scr.nextDouble());

        BigDecimal p1 = new BigDecimal("0.2");
        BigDecimal p2 = new BigDecimal("0.3");
        BigDecimal p3 = new BigDecimal("0.4");
        BigDecimal p4 = new BigDecimal("0.1");

        BigDecimal media = n1.multiply(p1)
                .add(n2.multiply(p2))
                .add(n3.multiply(p3))
                .add(n4.multiply(p4));

        media = media.setScale(1, RoundingMode.DOWN);

        System.out.printf("Media: %.1f%n", media.doubleValue());

        if (media.compareTo(BigDecimal.valueOf(7.0)) >= 0){
            System.out.println("Aluno aprovado.");
        } else if (media.compareTo(BigDecimal.valueOf(5.0)) < 0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            BigDecimal notaExame = BigDecimal.valueOf(scr.nextDouble());

            notaExame = notaExame.setScale(1,RoundingMode.DOWN);
            System.out.printf("Nota do exame: %.1f%n", notaExame.doubleValue());

            BigDecimal mediaFinal = media.add(notaExame)
                    .divide(BigDecimal.valueOf(2),1, RoundingMode.DOWN);

            if(media.compareTo(BigDecimal.valueOf(5.0)) >= 0){
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", mediaFinal.doubleValue());
        }
        scr.close();
    }
}

