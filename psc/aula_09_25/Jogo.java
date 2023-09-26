public class Jogo {
    public static void main(String[] args) throws InterruptedException{
        Personagem cacador = new Personagem();
        cacador.nome = "Bruno";
//         cacador.cacar();
//         cacador.comer();

//         Personagem lenhador = new Personagem();
//         lenhador.nome = "Diego";
//         lenhador.cacar();
//         lenhador.dormir();
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
