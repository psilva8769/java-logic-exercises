package BasicJava;
import java.util.Scanner;

/*
    17. Escreva um trecho Java
    que exiba os valores de um array em
    double numa mesma linha. (?)
 */

public class Exercise_17_ArrayToDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert 4 values into an array... \n");
        double[] array = new double[4];

        for (int x=0; x < array.length; x++) { array[x] = sc.nextDouble(); }
        for (double x : array) { System.out.print(x+" | "); }
}}
