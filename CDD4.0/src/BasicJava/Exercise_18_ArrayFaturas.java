package BasicJava;

import java.util.Scanner;

/*
    18. Faça um programa que receba o valor das faturas, de
    energia, mensais de um cliente, coloque cada uma
    delas num array chamado faturas. Após isso, mostre
    a média mensal do cliente.
 */
public class Exercise_18_ArrayFaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double average = 0;
        double bill;

        for (int x=0; x < 12; x++){
            System.out.print("Insert month " + (x+1) + " bill: ");
            bill = sc.nextDouble();
            average += bill;
        }

        System.out.print("Your average monthly bill costs " + average/12 +".");
    }
}
