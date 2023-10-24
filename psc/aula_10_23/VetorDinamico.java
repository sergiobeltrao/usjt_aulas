package psc.aula_10_23;

public class VetorDinamico {
    private int [] dados;
    private int capacidade;
    private int quantidade;

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
        if(cheio()) {
            this.aumentoCapacidade();
        }
        this.dados[this.quantidade] = dado;
        this.quantidade++;
    }
    public void aumentoCapacidade () {
        int[] aux = new int[this.capacidade *2];
        for (int i=0; i < this.quantidade; i++)
            aux[i] = this.dados[i];
        this.dados = aux;
        this.capacidade = this.capacidade *2;

    }
    public void exibeVetor() {
        System.out.printf("Capacidade do vetor: %d\nQuantidade de elementos: %d\n", this.capacidade, this.quantidade);
        for (int i=0; i<this.capacidade; i++)
        System.out.println(this.dados[i] + " ");
    }
}
