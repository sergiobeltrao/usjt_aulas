import javax.swing.JOptionPane;

public class boletim2 {
    public static void main(String[] args) {
       
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1:"));

        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2:"));

        double media = (nota1 + nota2) / 2;

        if (media == 10) {
            JOptionPane.showMessageDialog(null, "Parabéns: " + media);
        }
        else if (media >= 7) {
            JOptionPane.showMessageDialog(null, "Aprovado: " + media);
        }    
        else if (media >= 4) {
            JOptionPane.showMessageDialog(null, "Recuperação: " + media);
        }
        else {
            JOptionPane.showMessageDialog(null, "Reprovado: " + media);
        }
    }
}