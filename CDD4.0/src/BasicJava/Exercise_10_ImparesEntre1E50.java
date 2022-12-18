package BasicJava;

/*
    10. Faça um programa que imprima na tela
    apenas os números ímpares entre 1 e 50.
 */

public class Exercise_10_ImparesEntre1E50 {
    public static void main(String[] args) {
        for (int x = 0; x <= 50; x++){
            if (x % 2 == 1){
                System.out.print(x + " ");
            }
        }
    }
}
