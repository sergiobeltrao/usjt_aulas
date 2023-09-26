public class TesteEncapsulamento {
    public static void main(String[] args) {
        Personagem grilo = new Personagem();
        
        grilo.energia = 50;
        grilo.fome = 20;
        grilo.sono = 45;
        
        System.out.println("Energia do grilo: " + grilo.energia);
        System.out.println("Fome do grilo: " + grilo.fome);
        System.out.println("Sono do grilo: " + grilo.sono);

    }
}
