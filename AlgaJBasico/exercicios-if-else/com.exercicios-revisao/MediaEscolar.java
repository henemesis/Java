import java.util.Scanner;

public class MediaEscolar {

    public static void main(String[] args) {

        System.out.println("CALCULANDO A MÉDIA");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Estudantes listados" +
                "\n12)Jonata;" +
                "\n21)Joarez.\n");

        System.out.print("Digite o número de identificação do estudante: ");
        int identificacao = scanner.nextInt();

        double jonataNota1 = 55;
        double jonataNota2 = 75;
        double jonataNota3 = 15;
        double jonataMe = 12;
        double mfJonata = (jonataNota1 + (jonataNota2 * 2) + (jonataNota3 * 3) + jonataMe) / 7;

        double joarezNota1 = 100;
        double joarezNota2 = 90;
        double joarezNota3 = 75;
        double joarezMe = 90;
        double mfJoarez = (joarezNota1 + (joarezNota2 * 2) + (joarezNota3 * 3) + joarezMe) / 7;

        if (identificacao == 12) {
            System.out.println("12) Jonata -- Notas" +
                    "\nNota 1: " + jonataNota1 +
                    "\nNota 2: " + jonataNota2 +
                    "\nNota 3: " + jonataNota3 +
                    "\nMédia final de Jonata: " + mfJonata + "\n");

            if (mfJonata >= 90) {
                System.out.println("Jonata foi aprovado com média A");
            } else if (mfJonata >= 75 && mfJonata < 90) {
                System.out.println("Jonata foi aprovado com média B");
            } else if (mfJonata >= 60 && mfJonata < 75) {
                System.out.println("Jonata foi aprovado com média C");
            } else if (mfJonata >= 40 && mfJonata < 60) {
                System.out.println("Jonata foi reprovado com média D");
            } else {
                System.out.println("Jonata foi reprovado com média E");
            }

        } else if (identificacao == 21) {
            System.out.println("21) Joarez -- Notas" +
                    "\nNota 1: " + joarezNota1 +
                    "\nNota 2: " + joarezNota2 +
                    "\nNota 3: " + joarezNota3 +
                    "\nMédia final de Joarez: " + mfJoarez + "\n");

            if (mfJonata >= 90) {
                System.out.println("Joarez foi aprovado com média A");
            } else if (mfJoarez >= 75 && mfJoarez < 90) {
                System.out.println("Joarez foi aprovado com média B");
            } else if (mfJoarez >= 60 && mfJoarez < 75) {
                System.out.println("Joarez foi aprovado com média C");
            } else if (mfJoarez >= 40 && mfJoarez < 60) {
                System.out.println("Joarez foi reprovado com média D");
            } else {
                System.out.println("Joarez foi reprovado com média E");
            }
        } else {
            System.out.println("Identificação de aluno inválida!");
        }
    scanner.close();
    }
}
