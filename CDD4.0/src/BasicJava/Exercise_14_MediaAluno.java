package BasicJava;
import java.util.Scanner;

/*
    14. Escreva um programa que solicite a
    quantidade de alunos de uma sala e
    depois solicite a uma nota para cada
    aluno, imprimindo no final a média da
    sala.
 */

public class Exercise_14_MediaAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students are there? ");
        int students = sc.nextInt();
        float classAverage = 0;

        for (int x=0; x < students; x++){
            System.out.printf("Type the average note for student " + (x+1) + ": ");
            classAverage += sc.nextFloat();
        }

        System.out.print("The class average is " + classAverage/students);
    }
}
