package BasicJava;
import java.util.Scanner;

/*
    13. Escreva um programa em que, dada uma
    variável x com algum valor inteiro, temos
    um novo x de acordo com a seguinte
    regra:
    Se x é par, x = x / 2 ;
    Se x é impar, x = 3 * x + 1 ;
    Imprime x ;
 */

public class Exercise_13_ConversorDeX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type in an integer number: ");
        int x = sc.nextInt();

        if (x == 0) {
            System.out.print("Null");
        } else if (x % 2 == 0) {
            System.out.print(x / 2);
        } else {
            System.out.print(3 * x + 1);
        }
    }
}