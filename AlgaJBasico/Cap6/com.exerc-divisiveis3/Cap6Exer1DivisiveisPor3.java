import java.lang.reflect.Array;
import java.util.Arrays;

public class Cap6Exer1DivisiveisPor3 {
//    Exercício

    public static void main(String[] args) {

        Integer [] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        Integer divisivelPor3 = 0;
        Integer [] retorno = new Integer[20];

        System.out.print("Da lista acima, são divisíveis por três: {");
        for (int i = 0; i < numeros.length ; i++) {
            Integer numero = numeros[i];
            divisivelPor3 = numero % 3;


            if (divisivelPor3.equals(0)){
                System.out.print(" " + numero);
            }
        }
        System.out.print(" }");

    }
}
