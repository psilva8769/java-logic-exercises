package exercises;
import java.util.Scanner;


public class Ex13 {
    public static void main (String args[]){

        double width, height, area, perimeter;
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert width: ");
        width = sc.nextDouble();

        System.out.print("Insert height: ");
        height = sc.nextDouble();

        area = width * height;
        perimeter = 2 * (width + height);

        System.out.print("Area equals to " + area + "\nAnd Perimeter equals to " + perimeter + ".");




    }


}
