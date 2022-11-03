package exercises;
import java.util.Scanner;

public class Ex7 {
    public static void main (String args[]){

        double firstNumber;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert a number to check its multiplication table: ");
        firstNumber = sc.nextDouble();


        for (int x = 1; x <= 10; x++){
            System.out.println(firstNumber + " x " + x + " = " + (firstNumber * x));

        }



    }
}
