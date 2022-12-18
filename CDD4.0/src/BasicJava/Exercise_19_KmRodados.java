package BasicJava;

/*
    19. Faça um programa que guarde, num array, a
    quantidade de Km rodados por um motorista de
    caminhão, diariamente, sabendo que ele viajou 14
    dias. Solicite este valor do motorista, que deve digitar
    no teclado os valores rodados por dia. após isso deve
    ser calculado a média da primeira semana e a média
    da segunda semana, bem com a média dos 14 dias.
 */

import java.util.Scanner;

public class Exercise_19_KmRodados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] ranKilometers = new double[14];
        double average[] = new double[3];

        for (int x=0; x < ranKilometers.length; x++){
            System.out.format("Ran KMs for day %d: ", (x+1));
            ranKilometers[x] = sc.nextDouble();
            if (x < 7){
                average[0] += ranKilometers[x];
                System.out.print(average[0]);
            } else {
                average[1] += ranKilometers[x];
                System.out.print(average[1]);
            }
            average[2] += ranKilometers[x];
            System.out.print(average[2]);
        }
        System.out.printf("Average KMs ran for week %d: %.2f\nAverage KMs ran for week %d: %.2f\n" +
                "Average KMs total: %.2f", 1, (average[0]/7), 2, (average[1]/7), (average[2]/14));
    }
}
