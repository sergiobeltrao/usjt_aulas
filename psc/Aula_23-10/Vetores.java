import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int t = leitor.nextInt();

        int[] v = new int[t];
        System.out.println("Digite " + t + " valores: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print("Posição " + i + ": ");
            v[i] = leitor.nextInt(i);
        }
        System.out.println("Sua lista de valores é: ");

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        leitor.close();
    }

}