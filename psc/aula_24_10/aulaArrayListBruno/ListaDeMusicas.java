package psc.aula_24_10.aulaArrayListBruno;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ListaDeMusicas {
    public static void main(String[] args) {
        List<Musica> musicas = new ArrayList<>();
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite\n0 - Sair\n1 - Nova Musica\n2 - Avaliar Musica\n3 - Listar Musicas"));
            switch (opcao) {
                case 0:
                JOptionPane.showMessageDialog(null,"Obrigado, Volte Sempre :)");
                break;
                case 1:
                    String nome = JOptionPane.showInputDialog(" Digite o nome da musica:");
                    Musica musica = new Musica(nome);
                    musicas.add(musica);
                  /*   if (m.cadastrar()) {
                        JOptionPane.showMessageDialog(null, " Cadastro realizado com sucesso :) ");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, " Cadastro falhou :( ");
                    }*/
                break;
                case 2:

                break;
                case 3:

                break;
                default:
                JOptionPane.showMessageDialog(null,"Opcao Invalida :(");
            }
        }while (opcao !=0);
    }
}
