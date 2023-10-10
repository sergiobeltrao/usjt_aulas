
import javax.swing.JOptionPane;

public class Main {

    static int menu() {
        String msg = "Escolha sua opção:\n1:  Cadastrar\n2: Atualizar\n3: Apagar\n4: Exibir pessoas\n0: Sair";
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return opcao;
    }

    public static void main(String args[]) {
        int op;
        do {
            op = menu();
            switch (op) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!");
            }

        } while (op != 0);
    }
}
