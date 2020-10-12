import java.util.Scanner;

public class CalculandoBonus {

    public static void main(String[] args) {
        System.out.println("CALCULANDO O BONUS");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a expectativa de meta de faturamento: ");
        Double metaFaturamento = scanner.nextDouble();

        System.out.print("Digite o faturamento da empresa: ");
        Double faturamentoEmpresa = scanner.nextDouble();

        System.out.print("Digite a média salarial do ano passado: ");
        Double mediaSalarial = scanner.nextDouble();

        Double  oitentaPorcentoMeta =  metaFaturamento * 0.80;
        Boolean alcancouMeta = faturamentoEmpresa >= metaFaturamento;
        Boolean faturouAteOitenta = faturamentoEmpresa >= oitentaPorcentoMeta;
        Double bonusAbaixoMeta = mediaSalarial * 0.80;

        if (alcancouMeta){
            System.out.print("Parabéns você alcançou a meta estipulada, seu bônus será: " + mediaSalarial);
        } else if (faturouAteOitenta){
            System.out.print("Seu bônus será de 80% da sua media salarial. O valor é de: " + bonusAbaixoMeta);
        } else {
            System.out.println("Esse ano não haverá bônus, metas abaixo das expectativas!");
        }
        scanner.close();
    }
}
