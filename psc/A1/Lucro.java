package psc.A1;


import javax.swing.JOptionPane;
import java.util.Locale;

public class Lucro {
    private int numeroClientes;
    private double valorTotalGasto;

    public void calcularMediaGastoPorCliente() {
        String input = JOptionPane.showInputDialog("Digite o número de clientes:");
        numeroClientes = Integer.parseInt(input);

        if (numeroClientes <= 0) {
            JOptionPane.showMessageDialog(null, "O número mínimo de clientes é 1.");
        } else {
            for (int i = 1; i <= numeroClientes; i++) {
                double valorBebida = Double.parseDouble(JOptionPane.showInputDialog("Cliente " + i + ". Digite o valor gasto em bebidas:"));
                double valorComida = Double.parseDouble(JOptionPane.showInputDialog("Cliente " + i + ". Digite o valor gasto em comidas:"));
                double valorGasto = valorBebida + valorComida;
                valorTotalGasto += valorGasto;
                double mediaDoCliente = valorGasto / 2;
                JOptionPane.showMessageDialog(null, "Média de gasto pelo cliente " + i + ": R$ " + String.format("%.2f", mediaDoCliente));
            }
        }
    }

    public void calcularMediaGeral() {
        if (numeroClientes > 0) {
            double mediaGastoPorCliente = valorTotalGasto / numeroClientes;
            JOptionPane.showMessageDialog(null, "Média geral de gastos por cliente: R$ " + String.format("%.2f", mediaGastoPorCliente));
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        JOptionPane.showMessageDialog(null, "Separe os valores decimais por uma vírgula.");

        Lucro sistema = new Lucro();
        sistema.calcularMediaGastoPorCliente();
        sistema.calcularMediaGeral();
    }
}