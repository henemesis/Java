import java.util.Scanner;
//Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. Serão dois parâmetros
// para receber um para receber a nota de português e outro para receber as de matemática. A prova, no total, vale 200
// pontos - 100 para cada matéria. A nota mínima total para passar é igual ou maior que 150. Entretanto, o candidato não
// pode tirar menos do que 60 pontos em qualquer uma das duas matérias, ou seja, se tirar 59 em português e 100 em matemática
// (totalizando uma nota maior do que o total necessário que é 150) ele não conseguirá a vaga.
//No final mostre para o candidato se ele conseguiu ou não.


public class Cap5Exe1Verificacao {

    public static void main(String[] args) {

        System.out.println("CALCULANDO A NOTA PARA CORTE CONCURSO");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da prova de Português: ");
        Double notaPortugues = scanner.nextDouble();

        System.out.print("Digite a nota da prova de Matemática: ");
        Double notaMatematica = scanner.nextDouble();

        Double total = notaPortugues + notaMatematica;
        String notaInferior = "";

        if (notaMatematica <= 60){
            notaInferior = "Nota abaixo de 60 em Matemática";
        } else if (notaPortugues <= 60) {
            notaInferior = "Nota abaixo de 60 em Português";
        }

        System.out.println( "Suas notas foram:");
        System.out.println("Português: " + notaPortugues);
        System.out.println("Matemática: " + notaMatematica);
        System.out.println("Total: " + total);

        if ( total >= 150 && notaMatematica >= 60 && notaPortugues >= 60 ){
            System.out.println("Parabéns você foi classificado! ");
        } else if (total < 150){
            System.out.println("Você não foi classificado! Nota abaixo de 150");
        } else if (total <= 150 || notaMatematica <= 60 || notaPortugues <= 60){
            System.out.println("Você não foi classificado! " + notaInferior);
        }
    }

}
