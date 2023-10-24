package psc.aula_10_23;

import java.util.Random;

public class TesteVetorDinanmico2 {
    public static void main(String[] args) throws InterruptedException{
        VetorDinamico v = new VetorDinamico();
        Random random = new Random();
        while (true) {
            int op = random.nextInt(2);
            switch (op) {
                case 0:
                    v.add((random.nextInt(6) + 1));
                break;
                case 1:
                    v.remove();
                break;
            }
            v.exibeVetor();
            Thread.sleep(500);
            System.out.println("--------------------------------");
        }
    }
}
