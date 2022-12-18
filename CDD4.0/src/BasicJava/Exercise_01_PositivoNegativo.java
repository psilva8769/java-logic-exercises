package BasicJava;
import java.util.Scanner;

/*
    1. Faça um programa que peça um
    valor e mostre na tela se o valor
    é positivo ou negativo
*/

public class Exercise_01_PositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type in a number: ");
        double number = sc.nextDouble();

        if (number > 0) {
            System.out.print("Typed number is positive.");
        } else if (number < 0) {
            System.out.print("Typed number is negative.");
        } else {
            System.out.print("Typed number is null.");
        }
    }
}
