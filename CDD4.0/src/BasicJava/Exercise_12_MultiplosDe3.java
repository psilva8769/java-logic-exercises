package BasicJava;

/*
    12. Imprima todos os múltiplos de 3, entre 1 e
    100.
 */

public class Exercise_12_MultiplosDe3 {
    public static void main(String[] args) {
        for (int x = 1; x <= 100; x++){
            if (x % 3 == 0){
                System.out.print(x + " ");
            }
        }
    }
}
