import java.util.Random;

public class Jogo2 {
    public static void main(String[] args) throws InterruptedException {
        Personagem cacador = new Personagem();
        cacador.nome = "Bruno";
        Random random = new Random();
        while (true) {
            int sorteio = random.nextInt(3);
            if (sorteio == 0) {
                cacador.cacar();
            }
            else if (sorteio == 1) {
                cacador.comer();  
            }
            else {
                cacador.dormir();
            }
            System.out.println("================================");
            Thread.sleep(1000);
        }
    }
}
