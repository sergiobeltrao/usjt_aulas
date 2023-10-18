import javax.swing.JOptionPane;

public class Main {
    
    static int menu() {
        int opcao;
        do {
            String msg = """
                         Escolha sua op\u00e7\u00e3o:
                         1 - cadastrar
                         2 - atualizar
                         3 - apagar uma pessoa
                         4 - exibir pessoas
                         0 - sair""";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(msg));
        } while (opcao < 0 || opcao > 4);
        return opcao;
    }

    public static void main (String args[]) {
        int op;
        do {
            op = menu();
            switch (op) {
                case 1 -> { 
                    String nome = JOptionPane.showInputDialog(" Digite o nome");
                    String email = JOptionPane.showInputDialog(" Digite email");
                    String fone = JOptionPane.showInputDialog(" Digite fone");
                    Pessoa p = new Pessoa(nome, fone, email);
                    if (p.cadastrar()) {
                        JOptionPane.showMessageDialog(null, " Cadastro realizado com sucesso :) ");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, " Cadastro falhou :( ");
                    }
                }
                case 2 -> {
    String nome = JOptionPane.showInputDialog("Digite o nome da pessoa a ser atualizada");
    Pessoa p = new Pessoa(nome);
    if (p.buscarPessoa()) {
        // Exibir os detalhes da pessoa atual
        JOptionPane.showMessageDialog(null, "Detalhes da pessoa:\n" + p.toString());

        // Solicitar as informações atualizadas ao usuário
        String novoNome = JOptionPane.showInputDialog("Digite o novo nome (ou deixe em branco para manter o mesmo):");
        String novoFone = JOptionPane.showInputDialog("Digite o novo telefone (ou deixe em branco para manter o mesmo):");
        String novoEmail = JOptionPane.showInputDialog("Digite o novo email (ou deixe em branco para manter o mesmo):");

        // Atualizar os campos, se forem fornecidos
        if (!novoNome.isEmpty()) {
            p.setNome(novoNome);
        }
        if (!novoFone.isEmpty()) {
            p.setFone(novoFone);
        }
        if (!novoEmail.isEmpty()) {
            p.setEmail(novoEmail);
        }

        // Chamar o método de atualização
        if (p.atualizar()) {
            JOptionPane.showMessageDialog(null, "Pessoa atualizada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao atualizar a pessoa.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Usuário não encontrado");
    }
}

                case 3 -> { 
                    String nome = JOptionPane.showInputDialog("Digite o nome da pessoa a ser apagada");
                    Pessoa p = new Pessoa(nome);
                    if (p.apagarPessoa()) {
                        JOptionPane.showMessageDialog(null, "Pessoa apagada com sucesso!");
                    } 
                    else {
                        JOptionPane.showMessageDialog(null, "Falha ao apagar a pessoa.");
                    }
                }
                case 4 -> {
                    Pessoa p = new Pessoa();
                    JOptionPane.showMessageDialog(null, p.listarPessoas());
                }
                case 0 -> JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!");
            }
        }while (op != 0);
    }
    
}