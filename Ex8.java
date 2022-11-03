package exercises;
import java.util.Scanner;


public class Ex15 {
    public static void main (String args[]) {

        double one, two, three;
        String rep;

        Scanner sc = new Scanner(System.in);

        System.out.print("Insert first number: ");
        one = sc.nextDouble();

        System.out.print("Insert second number: ");
        two = sc.nextDouble();

        System.out.println("Actual arrangement:\nFirst number: " + one + "\n" + "Second number: " + two);
        System.out.println("Do you wish to swap the first with the second variable? [Y/N]");
        rep = sc.next();

        while (!rep.equalsIgnoreCase("Y") || !rep.equalsIgnoreCase("N")) {
            if (rep.equalsIgnoreCase("y")) {
                three = one;

                one = two;
                two = three;
                System.out.print("Swap sucessful! Actual arrangement:\nFirst number: " + one + "\nSecond number: " + two);
                System.exit(1);

            } else if (rep.equalsIgnoreCase("n")) {
                System.out.print("As you wish.");
                System.exit(1);
            } else {
                System.out.print("TYPE IN 'Y' OR 'N' !!\n");
            };

            System.out.println("Do you wish to swap the first with the second variable? [Y/N]");
            rep = sc.next();

        }
    }
}
