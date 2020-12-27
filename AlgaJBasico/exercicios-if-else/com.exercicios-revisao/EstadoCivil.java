import java.util.Scanner;

public class EstadoCivil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, sexo;
        int estadoCivil;
        int tempoCasada = 0;

        System.out.println("ESTADO CIVIL");

        System.out.print("Favor digitar seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Favor digitar sexo: ");
        sexo = scanner.nextLine();

        System.out.print("Favor entre com o estado civil: ");
        System.out.println(
                "\n1) Solteiro(a) " +
                "\n2) Casado(a) " +
                "\n3) Víuvo(a) ");
        estadoCivil = scanner.nextInt();

        if (sexo.equals("F") && estadoCivil == 2) {
            System.out.println("Digite por favor, seu tempo de casada: ");
            tempoCasada = scanner.nextInt();

            System.out.println("Essa pessoa do sexo feminino, possui " + tempoCasada + " ano(s) de casada!");
        }

        if(estadoCivil == 1){
            System.out.println("Essa pessoa é solteiro(a) " +
                    "\nNome: " + nome +
                    "\nSexo: " + sexo);
        } else {
            System.out.println("Essa pessoa é viúvo(a) " +
                    "\nNome: " + nome +
                    "\nSexo: " + sexo);
        }
    }
}
