
package psc.aula_09_18;

import java.util.Scanner;
import java.util.Random;

public class AteAcertar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int tentativas = 1;
        int sorteio = random.nextInt(10) + 1;
        System.out.println("Tente acertar um numero de 1 a 10:");
        int chute = scan.nextInt();
        while (chute != sorteio && tentativas < 3) {
            System.out.print("Tente de novo:");
            chute = scan.nextInt();
            tentativas++;
        }
        if (sorteio == chute) {
            System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
        } else {
            System.out.println("Não foi dessa vez");
        }
        scan.close();
    }
}
