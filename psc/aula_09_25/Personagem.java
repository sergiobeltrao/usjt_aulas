import java.security.PublicKey;

public class Personagem {
    private String nome;
    private int energia;
    private int fome;
    private int sono;
    private int vida;

    public Personagem (String nome) {
        this.nome = nome;
    }

    public Personagem (String nome, int energia, int fome, int sono, int vida) {
        this(nome);
        if (energia >= 0 && energia <= 10) {
            this.energia = energia;
        }
         if (fome >= 0 && fome <= 10) {
            this.fome = fome;
        }
            else {
                this.energia = 10;
            }
        if (sono >= 0 && sono <= 10) {
            this.sono = sono;
        }
         if (vida >= 0 && vida <= 10) {
            this.vida = vida;
        }
    }

    void cacar() {
        if (energia >= 2) {
            System.out.println(nome + " cacando...");
            energia = energia - 2;
            
            if (fome < 10) {
                fome = fome + 1;
            }
            
            sono = Math.min(sono + 1, 10);
        } else {
            System.out.println(nome + " sem energia para cacar...");
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
    void vida() {
        if (vida <= 0) {
            System.out.println(nome + " morreu...");
            vida--;
        } else {
            System.out.println(nome + " esta vivo...");
        }
    }
    void exibirAtributos() {
        System.out.println(nome + ":\nenergia: " + energia + "\nfome: " + fome + "\nsono: " + sono);
    }
}