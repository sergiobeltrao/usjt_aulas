package psc.aula_09_19;

import static javax.swing.JOptionPane.showInputDialog;;
public class TesteLivroDeNotas {
    public static void main(String[] args) {
        String nomeDisciplina = showInputDialog("Digite o nome da disciplina");
        LivroDeNotas livro = new LivroDeNotas();
        livro.exibirMensagem(nomeDisciplina);
        System.out.println("Até logo");
    }
}
