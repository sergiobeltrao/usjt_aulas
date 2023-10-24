package psc.aula_10_23;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int t = scanner.nextInt();
        int[] v = new int[t];
        System.out.println("Digite " + t + " valores: ");

        for (int i = 0; i < v.length; i++) {
            System.out.print("Posicao " + i + ": ");
            v[i] = scanner.nextInt();
        }

        System.out.println("Sua lista ficou: ");
        for (int j = 0; j < v.length; j++) {
            System.out.print(v[j] + " ");
        }
        
        System.out.println("\n\nQual posicao deseja alterar ");
        int pos;
        do {
            System.out.print("Digite a posicao: ");
            pos = scanner.nextInt();
        } while (pos < 0 || pos >= v.length);

        System.out.print("Digite o novo valor: ");
        int novo = scanner.nextInt();
        v[pos] = novo;
        System.out.println("Veja como ficou sua lista: ");

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

        scanner.close();
    }
}
