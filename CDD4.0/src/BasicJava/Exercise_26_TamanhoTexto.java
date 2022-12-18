package BasicJava;
import java.util.Scanner;

/*
    24. Faça um programa que solicite do usuário um texto e
    o programa informe o tamanho do texto.
 */

public class Exercise_26_TamanhoTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type something: ");
        String text = sc.next();

        System.out.printf("Typed text has %d characters.", text.length());

    }
}
