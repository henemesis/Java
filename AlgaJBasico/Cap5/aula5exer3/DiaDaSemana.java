package aula5exer3;

import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {
        System.out.println("BEM VINDO AO DIAS DA SEMANA");

        System.out.println("Por favor escolha um dos dias a seguir");
        Scanner scanner = new Scanner(System.in);
        System.out.print("1 - Domingo\n" +
                "2 - Segunda\n" +
                "3 - Terça\n" +
                "4 - Quarta\n" +
                "5 - Quinta\n" +
                "6 - Sexta\n" +
                "7 - Sábado\n"+
                "Dia escolhido: ");

        Integer diaEscolhido = scanner.nextInt();

        switch (diaEscolhido){
            case 1:
                System.out.println(" O dia escolhido foi o DOMINGO");
                break;
            case 2:
                System.out.println(" O dia escolhido foi o SEGUNDA");
                break;
            case 3:
                System.out.println(" O dia escolhido foi o TERÇA");
                break;
            case 4:
                System.out.println(" O dia escolhido foi o QUARTA");
                break;
            case 5:
                System.out.println(" O dia escolhido foi o QUINTA");
                break;
            case 6:
                System.out.println(" O dia escolhido foi o SEXTA");
                break;
            case 7:
                System.out.println(" O dia escolhido foi o SÁBADO");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }

        scanner.close();

    }
}
