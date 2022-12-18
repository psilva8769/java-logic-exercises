package BasicJava;
import java.util.Scanner;

/*
    6. Faça um programa que faça 5 perguntas para
    uma pessoa sobre um crime. As perguntas são:
    “Telefonou para a vítima? “
    “Esteve no local do crime?”
    “Mora perto da vítima? “
    “Devia para a vítima? “
    “Já trabalhou com a vítima? “
    O programa deve no final emitir uma
    classificação sobre a participação da pessoa no
    crime. Se a pessoa responder positivamente a 2
    questões ela deve ser classificada como
    “Suspeita”, entre 3 e 4 como “Cúmplice” e 5
    como “Assassino“. Caso contrário, ela será
    classificada como “Inocente“.
 */

public class Exercise_06_Crime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;

        System.out.print("Called the victim? [Y/N] ");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("Y")) {
            cont += 1;
        } else {
            System.out.print("Hm ");
        }

        System.out.print("Were you at the crime scene? [Y/N] ");
        answer = sc.next();
        if (answer.equalsIgnoreCase("Y")) {
            cont += 1;
        } else {
            System.out.print("Alright... ");
        }

        System.out.print("Lives near the victim? [Y/N] ");
        answer = sc.next();
        if (answer.equalsIgnoreCase("Y")) {
            cont += 1;
        } else {
            System.out.print("Proceed ");
        }

        System.out.print("Owed the victim? [Y/N] ");
        answer = sc.next();
        if (answer.equalsIgnoreCase("Y")) {
            cont += 1;
        } else {
            System.out.print("Hm... ");
        }

        System.out.print("Ever worked with the victim? [Y/N] ");
        answer = sc.next();
        if (answer.equalsIgnoreCase("Y")) {
            cont += 1;
        } else {
            System.out.print("Alright, that's it. ");
        }


        if (cont == 2) {
            System.out.print("You are suspect.");
        } else if (cont > 2 && cont < 5) {
            System.out.print("You're an accomplice!");
        } else if (cont >= 5){
            System.out.print("YOU'RE THE MURDERER!!");
        } else {
            System.out.print("Ok, you're innocent.");
        }

    }
}
