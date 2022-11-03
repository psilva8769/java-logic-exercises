package exercises;
import java.util.Scanner;

public class Ex6 {
    public static void main (String args[]){

        double sum, subtraction, div, mult, module, firstNumber, secondNumber;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert first number: ");
        firstNumber = sc.nextDouble();

        System.out.print("Insert second number: ");
        secondNumber = sc.nextDouble();

        sum = firstNumber + secondNumber;
        subtraction = firstNumber - secondNumber;
        div = firstNumber / secondNumber;
        mult = firstNumber * secondNumber;
        module = firstNumber % secondNumber;

        System.out.print(firstNumber + " + " + secondNumber + " = " + sum
        + "\n" + firstNumber + " - " + secondNumber + " = " + subtraction
        + "\n" + firstNumber + " / " + secondNumber + " = " + div
        + "\n" + firstNumber + " * " + secondNumber + " = " + mult
        + "\n" + firstNumber + " % " + secondNumber + " = " + module);



    }
}
