package BasicJava;
import java.util.Scanner;

/*
    7. Escreva um programa que pergunte ao usuário quantos
    alunos tem na sala dele. Em seguida, através de um laço
    while, pede ao usuário para que entre com as notas de
    todos os alunos da sala, um por vez.
    Por fim, o programa mostra a média,
    aritmética, da turma.
 */

public class Exercise_07_MediaAlunoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students are there? ");
        int students = sc.nextInt();
        int x = 0;
        float classAverage = 0;

        while (x < students ){
            System.out.printf("Type the average note for student " + (x+1) + ": ");
            classAverage += sc.nextFloat();
            x+=1;
        }

        System.out.print("The class average is " + classAverage/students);
    }
}
