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
    public void aumentoCapacidade () {
        int[] aux = new int[this.capacidade *2];
        for (int i=0; i < this.quantidade; i++)
            aux[i] = this.dados[i];
            
        }
    }
}
