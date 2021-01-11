import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        System.out.println("Par ou Impar");
        System.out.print("Favor entre com um número: ");
        numero = scanner.nextInt();

        boolean par = (numero % 2 == 0);

        if (par){
            System.out.println("O numero em questão é par");
        } else {
            System.out.println("O numero em questão é ímpar");
        }


    }
}
