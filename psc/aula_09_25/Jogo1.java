public class Jogo1 {
    public static void main(String[] args) {
        Personagem cacador = new Personagem("Bruno", 10, 0, 0, 0);
        cacador.cacar();
        cacador.comer();
        cacador.vida();

        Personagem lenhador = new Personagem("Diego");
        lenhador.cacar();
        lenhador.dormir();

    }
}
