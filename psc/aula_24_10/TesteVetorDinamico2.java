import java.util.Random;

public class TesteVetorDinamico2 {
    public static void main(String[] args) throws InterruptedException {
        VetorDinamico v = new VetorDinamico();
        Random random = new Random();
        while (true) {
            int op = random.nextInt(2);
            switch (op) {
                case 0:
                    v.add(random.nextInt(6) + 1);
                    break;

                case 1:
                    v.remove();
                    break;

            }
            v.exibeVetor();
            Thread.sleep(500);
            System.out.println("------------------------");
        }
    }
}
