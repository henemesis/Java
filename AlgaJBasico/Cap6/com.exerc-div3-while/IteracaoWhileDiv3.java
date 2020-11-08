import sun.rmi.server.InactiveGroupException;

import java.util.Arrays;

public class IteracaoWhileDiv3 {

    public static void main(String [] args){
        Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

        int i = 0;
        int j = 0;
        Integer divisivelPor3 = 0;
        Integer numero = 0;
        Integer [] armazena = new Integer[21];
        Integer [] resultado = new Integer[21];

        System.out.print("Aqueles que são divisíveis por 3: [");
        while (i < numeros.length) {
            numero = numeros[i];
            divisivelPor3 = numero % 3;

            if (divisivelPor3.equals(0)) {
                System.out.print(" " + numero);
            }
            i++;
        }
        System.out.print(" ]");
    }
}
