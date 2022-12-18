package BasicJava;

import java.util.Scanner;

/*
    22. Faça um programa que concatenar 2 Textos digitados
    pelo usuário.
 */


public class Exercise_23_ConcatenarString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type something: ");
        String string_one = sc.next();
        System.out.print("Type something again: ");
        String string_two = sc.next();

        System.out.print(string_one + string_two);

    }
}
