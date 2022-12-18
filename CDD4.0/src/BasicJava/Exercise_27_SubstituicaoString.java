package BasicJava;

/*
    25. Faça um programa que substitua todos o (Minúsculo)
    por O (maiúsculo) do texto abaixo. “o rato roeu a
    roupa do rei de roma”
 */

public class Exercise_27_SubstituicaoString {
    public static void main(String[] args) {
        String text = "o rato roeu a roupa do rei de roma";
        String newText = text.replace("o", "O");
        System.out.print(newText);
    }
}
