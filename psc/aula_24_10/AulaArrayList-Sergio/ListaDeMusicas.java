import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ListaDeMusicas {

    public static void main(String[] args) {
        List<Musica> musicas = new ArrayList<>();
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite\n0 - Sair\n1 - Criar nova música\n2 - Avaliar música\n3 - Listar músicas"));
            switch (opcao) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Obrigado, volte sempre.");
                    break;
                case 1:
                    // Pedir o nome da nova música
                    String nome = JOptionPane.showInputDialog("Digite o nome da música");
                    // Construir um objeto música
                    Musica musica = new Musica(nome);
                    // Adicionar a nova música à lista (new ArrayList)
                    musicas.add(musica);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");

            }
        } while (opcao != 0);
    }
}