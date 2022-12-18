package BasicJava;
import java.util.Scanner;

/*
    4. Faça um programa que solicite duas
    notas de um aluno, calcule a
    média dele e mostre na tela.
 */

public class Exercise_04_MediaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type in your first note: ");
        double nota1 = sc.nextDouble();

        System.out.print("Type in your second note: ");
        double nota2 = sc.nextDouble();

        System.out.print("The average between both your notes equals to " + (nota1+nota2) / 2);
    }
}
