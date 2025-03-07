import java.util.Scanner;

public class BEE1049 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String word1 = scr.nextLine();
        String word2 = scr.nextLine();
        String word3 = scr.nextLine();

        if (word1.equalsIgnoreCase("vertebrado") ) {
            if (word2.equalsIgnoreCase("ave")) {
                if (word3.equalsIgnoreCase("carnivoro")){
                    System.out.println("aguia");
                } else if (word3.equalsIgnoreCase("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (word2.equalsIgnoreCase("mamifero")) {
                if (word3.equalsIgnoreCase("onivoro")){
                    System.out.println("homem");
                } else if (word3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (word1.equalsIgnoreCase("invertebrado")){
            if (word2.equalsIgnoreCase("inseto")){
                if (word3.equalsIgnoreCase("hematofago")){
                    System.out.println("pulga");
                } else if (word3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (word2.equalsIgnoreCase("anelideo")){
                if (word3.equalsIgnoreCase("hematofago")){
                    System.out.println("sanguessuga");
                } else if (word3.equalsIgnoreCase("onivoro")){
                    System.out.println("minhoca");
                }
            }
        } else {
            System.out.println("Ocorreu um erro!! Repita as palavras");
        }
        scr.close();
    }
}
