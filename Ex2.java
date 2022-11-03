package exercises;
import java.util.Scanner;

public class Ex3 {
    public static void main (String args[]){

        double firstNumber, secondNumber, result;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert first number: ");
        firstNumber = sc.nextDouble();

        System.out.print("Insert second number: ");
        secondNumber = sc.nextDouble();

        result = firstNumber/secondNumber;

        System.out.println("The division of " + firstNumber + " by " + secondNumber + " equals to " + result + ".");





    }
}
