package BasicJava;

/*
    21. Dado um array que tenha 7 posições, representando
    os dias da semana, e que na segunda você ganhou
    R$220,00, terça você ganhou R$120,00, na quarta
    você ganhou R$450,00, na quinta R$650,00, e na
    sexta R$300,00, no sábado vc faturou R$1050,00 e no
    domingo foi seu dia de folga. coloque esses valores
    num array e depois, usando um laço de repetição,
    some todos os valores e mostre quanto você ganhou
    nesta semana e qual a média diária.
 */
public class Exercise_22_MediaSalario {
    public static void main(String[] args) {
        float[] array = {120, 220, 450, 650, 300, 1050, 0};
        float average = 0;
        for (float x : array){
            average += x;
        }

        System.out.printf("The total is: %.2f\nThe average is: %.2f", average, (average/7));
    }
}
