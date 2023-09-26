public class Personagem {
    String nome;
    int energia = 10, fome = 0, sono = 0;

    void cacar () {
        if (energia >= 2) {
            System.out.println(nome +" esta cacando");
            energia = energia - 2;
            if (fome < 10) {
             fome = fome + 1;
            }
            sono = Math.min(sono + 1, 10);
        } 
        else {
            System.out.println(nome +" esta sem energia para cacar");
        }
    }
    void comer () {
        if (fome>= 1) {
            System.out.println(nome +" esta comendo...");
            fome = fome - 1;
            energia = Math.min(10, energia + 1);
        }
        else {
            System.out.println(nome +" esta sem fome...");
        }
    }
    void dormir () {
       if(sono>=1) {
            System.out.println(nome +" esta dormindo...");
            sono = sono - 1;
            energia = energia < 10? energia + 1: 10;
        }
       else {
            System.out.println(nome + "esta sem sono...");
        }
    }
}