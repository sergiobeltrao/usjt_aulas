public class Personagem {
    String nome;
    int energia, fome, sono;

    void cacar () {
        if (energia >= 2) {
            System.out.println(nome +" esta cacando");
            energia = energia - 2;
            if (fome < 10) {
             fome = fome++;
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
            fome--;
            energia = Math.min(10, energia++);
        }
        else {
            System.out.println(nome +" esta sem fome...");
        }
    }
    void dormir () {
       if(sono>=1) {
            System.out.println(nome +" esta dormindo...");
            sono--;
            energia = energia < 10? energia++: 10;
        }
       else {
            System.out.println(nome + "esta sem sono...");
        }
    }
}