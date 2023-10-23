package psc.aula_10_23;

public class VetorDinamico {
    private int [] dados, capacidade, quantidade;

    public VetorDinamico() {
        this.capacidade = 4;
        this.dados = new int[this.capacidade];
    }
    public boolean cheio () {
    if(this.quantidade == this.capacidade)
        return true;
    else
        return false;
    }
    public void add (int dado) {
        if(!cheio()) {
            this.dados[this.quantidade] = dado;
            this.quantidade++;
        }
    }
}
