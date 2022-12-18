package BasicJava;
import java.util.Scanner;

/*
    3. Faça um Programa que leia
    um número e exiba o dia
    correspondente da semana. (1-
    Domingo , 2- Segunda, etc.) se
    digitar outro valor deve aparecer
    “valor inválido)
 */

public class Exercise_03_DiaDaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type in a number: ");
        int day = sc.nextInt();

        if(day > 0 && day < 8) {
            switch (day) {
                case 1:
                    System.out.print("Sunday");
                    break;
                case 2:
                    System.out.print("Monday");
                    break;
                case 3:
                    System.out.print("Tuesday");
                    break;
                case 4:
                    System.out.print("Wednesday");
                    break;
                case 5:
                    System.out.print("Thursday");
                    break;
                case 6:
                    System.out.print("Friday");
                    break;
                case 7:
                    System.out.print("Saturday");
                    break;
            }
        } else {
            System.out.print("Type in a value between 1 and 7.");
        }
    }
}
