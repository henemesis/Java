import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class CalcGastosFamiliares {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "CONTROLE DE GASTOS FAMILIARES");

        Double luz = Double.parseDouble(JOptionPane.showInputDialog(null, "Favor digite o valor da CONTA DE LUZ:",
                "Atenção", JOptionPane.INFORMATION_MESSAGE));
        Double totalContas = luz;

        Double agua = Double.parseDouble(JOptionPane.showInputDialog(null, "Favor digite o valor da CONTA DE ÁGUA:",
                "Atenção", JOptionPane.INFORMATION_MESSAGE));

        totalContas += agua;

        Double telefone = Double.parseDouble(JOptionPane.showInputDialog(null, "Favor digite o valor da CONTA DE " +
                        "TELEFONE:",
                "Atenção", JOptionPane.INFORMATION_MESSAGE));

        totalContas += telefone;

        Double escola = Double.parseDouble(JOptionPane.showInputDialog(null, "Favor digite o valor da MENSALIDADE " +
                        "ESCOLAR",
                "Atenção", JOptionPane.INFORMATION_MESSAGE));

        totalContas += escola;

        Double cartao = Double.parseDouble(JOptionPane.showInputDialog(null, "Favor digite o valor da MENSALIDADE " +
                        "DO CARTÃO",
                "Atenção", JOptionPane.INFORMATION_MESSAGE));

        totalContas += cartao;

        Double mercado = Double.parseDouble(JOptionPane.showInputDialog(null, "Favor digite o valor dos GASTOS COM " +
                        "SUPERMERCADO",
                "Atenção", JOptionPane.INFORMATION_MESSAGE));

        totalContas += mercado;

        JOptionPane.showMessageDialog(null, "O valor total das contas é de:\n" + totalContas + " Reais", "Atenção",
                JOptionPane.WARNING_MESSAGE);
    }
}
