public class Jogo1 {
    public static void main(String[] args) {
        Personagem cacador = new Personagem();
        cacador.nome = "Bruno";
        cacador.cacar();
        cacador.comer();

        Personagem lenhador = new Personagem();
        lenhador.nome = "Diego";
        lenhador.cacar();
        lenhador.dormir();

    }
}
