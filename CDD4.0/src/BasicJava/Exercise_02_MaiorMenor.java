package BasicJava;
import java.util.Scanner;
/*
    2. Faça um programa que leia
    três números, verifique (usando if
    e else) e mostre o maior e o
    menor deles;
 */

public class Exercise_02_MaiorMenor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[3];

        for (int x = 0; x < numbers.length; x++){
            System.out.print("Type in number " + (x+1) + ": ");
            numbers[x] = sc.nextDouble();
        }

        if (numbers[0] > numbers[1] & numbers[0] > numbers[2]) {
            if (numbers[1] > numbers[2]) {
                System.out.print(numbers[0] + " is the greatest, while " + numbers[2] + " is the lowest.");
            } else {
                System.out.print(numbers[0] + " is the greatest, while " + numbers[1] + " is the lowest.");
            }
        }

        if (numbers[1] > numbers[0] & numbers[1] > numbers[2]) {
            if (numbers[0] > numbers[2]) {
                System.out.print(numbers[1] + " is the greatest, while " + numbers[2] + " is the lowest.");
            } else {
                System.out.print(numbers[1] + " is the greatest, while " + numbers[0] + " is the lowest.");
            }
        }

        if (numbers[2] > numbers[0] & numbers[2] > numbers[1]) {
            if (numbers[0] > numbers[1]) {
                System.out.print(numbers[2] + " is the greatest, while " + numbers[1] + " is the lowest.");
            } else {
                System.out.print(numbers[2] + " is the greatest, while " + numbers[0] + " is the lowest.");
            }
        }
    }
}
