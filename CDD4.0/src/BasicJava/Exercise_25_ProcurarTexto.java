package BasicJava;
import java.util.Scanner;

/*
    23. Faça um programa que solicite que o usuário digite
    uma palavra e procure dentro do texto abaixo.
    Texto base “Por isso, você é indesculpável quando julga os outros,
    não  importando quem você é. Pois, naquilo que julga o outro, você está
    condenando a si mesmo, porque pratica as mesmas coisas que condena.”
 */



public class Exercise_25_ProcurarTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = "Por isso, você é indesculpável quando julga os outros,\n" +
                "    não  importando quem você é. Pois, naquilo que julga o outro, você está\n" +
                "    condenando a si mesmo, porque pratica as mesmas coisas que condena.";

        System.out.print("Type a word to search in the text: ");
        String text = sc.next();
        if (texto.contains(text)) {
            System.out.print("Existes");
        } else {
            System.out.print("Doesn't exist.");
        }


    }
}
