package BasicJava;

/*
    15. Escreva um programa que calcule a
    soma dos múltiplos de 3 e 5, no intervalo
    entre 1 e 20. No final, mostre a soma dos
    múltiplos de 3 e 5 e a soma total.
 */

public class Exercise_15_SomaDosMultiplos {
    public static void main(String[] args) {
        int sumMult = 0;
        int totalSum = 0;
        for(int x=0; x <= 20; x++){
            if (x % 3 == 0 || x % 5 == 0){
                System.out.print(x + " ");
                sumMult += x;
            }
            totalSum += x;

        }
        System.out.println("Sum of the multiples between 3 and 5 until number 20: " + sumMult);
        System.out.println("Total sum of all numbers from 1 to 20: " + totalSum);
    }
}
