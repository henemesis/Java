import java.util.Scanner;

public class IgualDiferente {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int c = 0;
        System.out.println(" CHECANDO VALORES! ");

        System.out.print(" Favor entrar com o primeiro valor: ");
        int a = scanner.nextInt();
        System.out.print(" Favor entrar com o segundo valor: ");
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("Os valores são iguais e será realizada a soma" +
                    " destes");
            c = a + b;
            System.out.println("Valor de A: " + a);
            System.out.println("Valor de B: " + b);
            System.out.println("O valor da variável C será: " + c);
        } else {
            System.out.println("Os valores são diferentes e será realizada a " +
                    "multiplicação destes");
            c = a * b;
            System.out.println("Valor de A: " + a);
            System.out.println("Valor de B: " + b);
            System.out.println("O valor da variável C será: " + c);
        }

        scanner.close();
    }
}
