package BasicJava;

/*
    16. Para cada conjunto de
    valores abaixo, escreva o código
    Java, usando laço(s), que preencha
    um array com os valores:
    a) 10 9 8 7 6 5 4 3 2 1
    b) 0 1 4 9 16 25 36 49 64 81 100
    c) 1 2 3 4 5 10 20 30 40 50
    d) 3 4 7 12 19 28 39 52 67 84

 */

public class Exercise_16_PreencherArray {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[11];
        int[] c = new int[10];
        int[] d = new int[10];

        // A) 10 9 8 7 6 5 4 3 2 1
        int contA = 0;
        for (int x=10; x >= 1; x--) {
            a[contA] = x;
            contA++;
        }

        // B) 0 1 4 9 16 25 36 49 64 81 100
        for (int x=0; x <= 10; x++){
            b[x] = x*x;
        }

        // C) 1 2 3 4 5 10 20 30 40 50
        for (int x=0; x <= 9; x++){
            if (x+1 <= 5) {
                c[x] = x+1;
            } else {
                c[x] = (x-4)*10;
            }
        }

        // D) 3 4 7 12 19 28 39 52 67 84
        int contD = 0;
        for (int x=0; x < 10; x++){
            if (x == 0) {
                d[x] = 3;
            } else if (x == 1){
                d[x] = d[x-1] + x;
                contD+=3;
            } else {
                d[x] = d[x-1] + contD;
                contD+=2;
            }
        }

        for (int x : a) {
            System.out.print(x + " ");
        } System.out.println();

        for (int x : b) {
            System.out.print(x + " ");
        } System.out.println();

        for (int x : c) {
            System.out.print(x + " ");
        } System.out.println();

        for (int x : d) {
            System.out.print(x + " ");
        } System.out.println();

    }
}
