package BasicJava;
import java.util.ArrayList;
import java.util.Scanner;

/*
    9. Escreva um aplicativo em Java que recebe
    inteiro e mostra os números pares e ímpares
    (separados), de 1 até esse inteiro.
 */

public class Exercise_09_1AteX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        ArrayList odd = new ArrayList();
        ArrayList even = new ArrayList();
        int x = 1;

        while (x <= number){
            if (x % 2 == 1){
                odd.add(x);
            } else {
                even.add(x);
            }
            x+=1;
        }

        System.out.print("Odds: " + odd + "\n" + "Evens: " + even);

    }
}
