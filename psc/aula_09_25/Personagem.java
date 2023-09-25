public class Personagem {
    String nome;
    int energia, fome, sono;

    void cacar () {
        System.out.println(nome +" esta cacando...");
    }
    void comer () {
        System.out.println(nome +" esta comendo...");
    }
    void dormir () {
        System.out.println(nome +" esta dormindo");
    }
}