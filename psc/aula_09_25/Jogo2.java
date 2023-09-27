public class Jogo2 {
    public static void main(String[] args) throws InterruptedException {
        Personagem cacador = new Personagem("Bruno");
        while (true) {
            cacador.cacar();
            cacador.comer();
            cacador.dormir();
            cacador.vida();
            cacador.cacar();
            cacador.comer();
            cacador.dormir();
            cacador.vida();
            System.out.println("==================");
            Thread.sleep(2000);
        }
    }
}
