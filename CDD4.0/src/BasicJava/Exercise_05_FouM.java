package BasicJava;
import java.util.Scanner;

/*
    5. Faça um programa que
    verifique (usando if e else) se
    uma letra digitada é “F” ou “M”.
    Conforme a letra escrever:
    F- Feminino, M- Masculino.
 */

public class Exercise_05_FouM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in F or M. ");
        String choice = sc.next();

        if (choice.equalsIgnoreCase("F")) {
            System.out.print("Female");
        } else if (choice.equalsIgnoreCase("M")) {
            System.out.print("Male");
        } else {
            System.out.print("Type in either F or M!");
        }
    }
}
