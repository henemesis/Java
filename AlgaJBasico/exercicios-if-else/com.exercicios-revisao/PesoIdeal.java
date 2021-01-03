import java.util.Scanner;

public class PesoIdeal {

    public static void main(String[] args) {

        System.out.println("CALCULANDO PESO IDEAL");
        Scanner scanner = new Scanner(System.in);
        double pesoIdeal = 0.0;

        System.out.print("Qual o sexo (m/f)? ");
        String sexo = scanner.nextLine();

        System.out.print("Qual a altura? ");
        double altura = scanner.nextDouble();

        if (sexo.equalsIgnoreCase("m")) {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Para alguém do sexo MASCULINO, com " + altura + " de altura, o peso ideal " +
                    "será de: " + pesoIdeal);
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Para alguém do sexo FEMININO, com " + altura + " de altura, o peso ideal " +
                    "será de: " + pesoIdeal);
        }
       scanner.close();
    }
}
