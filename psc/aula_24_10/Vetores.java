import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int t = leitor.nextInt();

        int[] v = new int[t];
        System.out.println("Digite " + t + " valores: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println("Posição " + i + ": ");
            v[i] = leitor.nextInt();
        }
        System.out.println("Sua lista de valores é: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i] + " ");
        }

        System.out.println("Qual a posição que quer alterar?");
        int pos;
        do {
            System.out.println("Digite o novo valor: ");
            pos = leitor.nextInt();

        } while (pos < 0 || pos >= v.length);

        System.out.println("Digite o novo valor");

        System.out.println("Veja sua nova lista: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i] + " ");
        }
        leitor.close();
    }

}