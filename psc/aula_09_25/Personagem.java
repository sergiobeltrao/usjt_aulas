public class Personagem {
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;

    void cacar() {
        if (energia >= 2) {
            System.out.println(nome + " cacando...");
            energia = energia - 2;
            
            if (fome < 10) {
                fome = fome + 1;
            }
            
            sono = Math.min(sono + 1, 10);
        } else {
            System.out.println("sem energia para cacar...");
        }
    }

    void comer() {
        if (fome >= 1) {
            System.out.println(nome + " comendo...");
            fome--;
            energia = Math.min(10, energia + 1);
        } else {
            System.out.println(nome + " sem fome...");
        }
    }

    void dormir() {
        if (sono >= 1) {
            System.out.println(nome + " dormindo...");
            sono--;
            energia = energia < 10 ? energia + 1 : 10;
        } else {
            System.out.println(nome + " sem sono...");
        }
    }
}