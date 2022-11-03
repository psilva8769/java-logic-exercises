package exercises;
import java.util.Scanner;

public class Ex12 {
    public static void main (String args[]) {

        double one, two, three, average;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert first number: ");
        one = sc.nextDouble();

        System.out.print("Insert second number: ");
        two = sc.nextDouble();

        System.out.print("Insert third number: ");
        three = sc.nextDouble();

        average = (one + two + three) / 3;

        System.out.print("The average between these numbers is " + average + ".");

    }
}
