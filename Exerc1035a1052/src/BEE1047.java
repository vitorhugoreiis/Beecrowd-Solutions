/*
1) Leia a hora inicial,
2) minuto inicial,
3) hora final
4) e minuto final de um jogo.
5) A seguir calcule a duração do jogo.
Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.
 */
import java.util.Scanner;

public class BEE1047 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        int horaInicial, minutoInicial, horaFinal, minutoFinal, duracao;
        horaInicial = scr.nextInt();
        minutoInicial = scr.nextInt();
        horaFinal = scr.nextInt();
        minutoFinal = scr.nextInt();

        int horaInicialConversion = horaInicial * 60 + minutoInicial;
        int horaFinalConversion = horaFinal * 60 + minutoFinal;

        if (horaFinalConversion == horaInicialConversion) {
            // Caso 1 : início e fim são iguais
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");
        } else if ( horaFinalConversion > horaInicialConversion){
            // Caso 2: jogo termina no mesmo dia
            duracao = horaFinalConversion - horaInicialConversion;
            int horas = duracao / 60;
            int minutos = duracao % 60;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", horas, minutos);
        } else {
            // Caso 3: onde o jogo passa da meia-noite
            duracao = (horaFinalConversion + 1440) - horaInicialConversion;
            int horas = duracao / 60;
            int minutos = duracao % 60;
            System.out.printf("O JOGO DUROU %d HORAS(S) E %d MINUTO(S)%n", horas, minutos);
        }
        scr.close();
    }
}
