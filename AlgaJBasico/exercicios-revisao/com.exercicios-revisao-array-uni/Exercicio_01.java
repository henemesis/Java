import java.util.Arrays;

public class Exercicio_01 {

    public static void main(String[] args) {

        System.out.println("Escrevendo laços de repetição");

        int[] primeiroCaso = new int[11];

        for (int i = 10; i >= 1; i--){
            primeiroCaso[i] = i;
            System.out.print(" " + primeiroCaso[i]);
        }
        System.out.println();
        int[] array = new int[10];

        for (int j = 0; j < array.length; j++) {
            array[j] = j + 1;
        }

        int soma = 0;
        for (int k = 0; k <= 15; k++) {
            if((k + 1) % 2 == 1){
                soma += k + 1;
                System.out.println(soma);
            }
        }

    }
}
