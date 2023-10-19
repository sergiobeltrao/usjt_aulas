package psc.A1;

import java.util.Scanner;

public class LivroDeNotas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos tem a turma: ");
        int aluno = scanner.nextInt();
        double media = 0;

        int i = 1;

        while (i <= aluno) {
            System.out.println("Digite a nota do Aluno " + i);
            double notaA1, notaA2, notaA3;

            System.out.print("Nota A1: ");
            notaA1 = scanner.nextDouble();

            System.out.print("Nota A2: ");
            notaA2 = scanner.nextDouble();

            System.out.print("Nota A3: ");
            notaA3 = scanner.nextDouble();

            double mediaAluno = calcularMediaDeCadaAluno(notaA1, notaA2, notaA3);
            System.out.println("Media do Aluno " + i + ": " + mediaAluno);

            media += mediaAluno;

            i++;
        }

        double mediaGeral = calcularMediaDaTurma(aluno, media);
        System.out.println("Media da Turma: " + mediaGeral);

        scanner.close();
    }

    public static double calcularMediaDeCadaAluno(double notaA1, double notaA2, double notaA3) {
        return (notaA1 + notaA2 + notaA3) / 3;
    }

    public static double calcularMediaDaTurma(int aluno, double media) {
        return media / aluno;
    }
}