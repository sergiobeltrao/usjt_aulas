public class Jogo2 {
    public static void main(String[] args) throws InterruptedException {
        Personagem cacador = new Personagem();
        cacador.nome = "Bruno";
        while (true) {
            cacador.cacar();
            cacador.comer();
            cacador.dormir();
            cacador.cacar();
            cacador.comer();
            cacador.dormir();
            System.out.println("==================");
            Thread.sleep(2000);
        }
    }
}
