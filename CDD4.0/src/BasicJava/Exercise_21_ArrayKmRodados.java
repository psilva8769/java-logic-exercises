package BasicJava;

/*
    20. Sabendo que o consumo de um veículo é de 8km por
    litro, e sabendo que um motorista rodou no primeiro
    dia 105km, no segundo dia 200km, no terceiro dia
    55km, no quarto dia rodou 170km e no quinto dia.
    faça um programa que guarde esses valores num
    array e depois, lendo o array, mostra a média diária
    de km rodados e de consumo por dia. mostre também
    o total de km rodados e de combustível consumido.
 */
public class Exercise_21_ArrayKmRodados {
    public static void main(String[] args) {
        int[] ranKm = {105, 200, 55, 170};
        double totalRanKm = 0;

        for (int x : ranKm){
            totalRanKm += x;
        }
        System.out.printf("Average KMs ran daily: %.2f" +
                "\nAverage fuel used daily: %.2f liters" +
                "\nTotal KMs ran: %.2f" +
                "\nTotal fuel used: %.2f liters", totalRanKm/5, ((totalRanKm/5)/8), totalRanKm, (totalRanKm/8));
    }
}
