import java.util.Arrays;
import java.util.Scanner;

public class Cap7Exer1Cad {

	public static void main(String[] args) {

		System.out.println("BEM VINDO AO PROGRAMA TAREFAS");
		Scanner scanner = new Scanner(System.in);
		String[] atividade = new String[5];

		for (int i = 0; i < atividade.length; i++) {
			System.out.println("Por favor digite a " + (i + 1) + " primeira atividade a ser realizada: ");
			atividade[i] = scanner.next();
			System.out.println();

		}

		System.out.print("Suas atividades são: " + Arrays.toString(atividade));

		scanner.close();
	}
}
