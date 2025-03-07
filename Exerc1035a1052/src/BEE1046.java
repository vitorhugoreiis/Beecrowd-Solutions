import java.util.Scanner;

/*
1) Leia a hora inicial
2) e a hora final de um jogo.
3) A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia
4) e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */
public class BEE1046 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;
        horaInicial = scr.nextInt();
        horaFinal = scr.nextInt();

        if (horaInicial >= horaFinal) {
            duracao = (24 + horaFinal) - horaInicial;
        } else {
            duracao = horaFinal - horaInicial;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)", duracao);

        scr.close();
    }
}
