
import javax.swing.JOptionPane;

public class Main {

    static int menu() {
        int opcao;
        do {
            String msg = "Escolha sua opção:\n1:  Cadastrar\n2: Atualizar\n3: Apagar\n4: Exibir pessoas\n0: Sair";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(msg));
        } while (opcao < 0 || opcao > 4);
        return opcao;
    }

    public static void main(String args[]) {
        int op;
        do {
            op = menu();
            switch (op) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome: ");
                    String email = JOptionPane.showInputDialog("Digite o e-mail: ");
                    String fone = JOptionPane.showInputDialog("Digite o número de telefone: ");
                    Pessoa p = new Pessoa(nome, fone, email);
                    if (p.cadastrar()) {
                        JOptionPane.showInputDialog(null, "Cadastro realizado com sucesso");
                    } else {
                        JOptionPane.showInputDialog(null, "Cadastro falhou");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Obrigado, volte sempre (ou não)!");
            }
        } while (op != 0);
    }
}
