/*
1) Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano.
2) A seguir, determine qual o quadrante ao qual pertence o ponto
3) ou se está sobre um dos eixos cartesianos
4) ou na origem (x = y = 0).

 */
import java.util.Scanner;

public class BEE1041 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        double x = scr.nextDouble();
        double y = scr.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if ( x < 0 && y > 0) {
            System.out.println("Q2");
        } else if ( x < 0 && y < 0){
            System.out.println("Q3");
        } else if ( x > 0 && y < 0) {
            System.out.println("Q4");
        } else if ( x == 0 && y == 0) {
            System.out.println("Origem");
        } else if ( x == 0 && y != 0){
            System.out.println("Eixo Y");
        } else if ( x != 0 && y == 0){
            System.out.println("Eixo X");
        }

        scr.close();
    }
}