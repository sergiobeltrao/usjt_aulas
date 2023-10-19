package psc.A1;

import java.util.Locale;
import javax.swing.JOptionPane;

public class LivroDeNotas {
    private int numeroAlunos;
    private double[] mediasDosAlunos;

    public void calcularMediaDeCadaAluno() {
        String input = JOptionPane.showInputDialog("Digite o número de alunos: ");
        numeroAlunos = Integer.parseInt(input);
        mediasDosAlunos = new double[numeroAlunos];

        for (int aluno = 0; aluno < numeroAlunos; aluno++) {
            double notaA1 = Double.parseDouble(JOptionPane.showInputDialog("Nota A1 para o Aluno " + (aluno + 1) + ": "));
            double notaA2 = Double.parseDouble(JOptionPane.showInputDialog("Nota A2 para o Aluno " + (aluno + 1) + ": "));
            double notaA3 = Double.parseDouble(JOptionPane.showInputDialog("Nota A3 para o Aluno " + (aluno + 1) + ": "));

            double mediaAluno = (notaA1 + notaA2 + notaA3) / 3;
            mediasDosAlunos[aluno] = mediaAluno;

            JOptionPane.showMessageDialog(null, "Média do Aluno " + (aluno + 1) + ": " + String.format("%.2f", mediaAluno));
        }
    }

    public void calcularMediaDaTurma() {
        double somaMedias = 0;

        for (int aluno = 0; aluno < numeroAlunos; aluno++) {
            somaMedias += mediasDosAlunos[aluno];
        }

        double mediaTurma = somaMedias / numeroAlunos;
        JOptionPane.showMessageDialog(null, "Média da Turma: " + String.format("%.2f", mediaTurma));
    }

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        JOptionPane.showMessageDialog(null, "Separe os valores decimais por uma vírgula.");

        LivroDeNotas livroDeNotas = new LivroDeNotas();
        livroDeNotas.calcularMediaDeCadaAluno();
        livroDeNotas.calcularMediaDaTurma();
    }
}

