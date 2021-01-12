import java.util.Arrays;

public class Exercicio_01 {

    public static void main(String[] args) {

        System.out.println("Escrevendo laços de repetição");

        int[] primeiroCaso = new int[11];

        for (int i = 10; i >= 1; i--){
            primeiroCaso[i] = i;
            System.out.print(" " + primeiroCaso[i]);
        }

    }
}
