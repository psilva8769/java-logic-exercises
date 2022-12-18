package BasicJava;

/*
    8. Escreva um aplicativo em Java mostra todos
    os números pares de 1 até 100.
 */

public class Exercise_08_1Ate100 {
    public static void main(String[] args) {
        int x = 0;
        while (x < 100){
            if (x % 2 == 0){
                System.out.print(x + " ");
            }
            x+=1;
        }
    }
}
