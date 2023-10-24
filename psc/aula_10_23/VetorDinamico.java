package psc.aula_10_23;

public class VetorDinamico {
    private int[] dados;
    private int capacidade;
    private int quantidade;

    public VetorDinamico() {
        this.capacidade = 4;
        this.dados = new int[this.capacidade];
    }

    public boolean cheio() {
        if (this.quantidade == this.capacidade)
            return true;
        else
            return false;
    }

    public void add(int dado) {
        if (cheio()) {
            this.redimensionaVetor(2.0);
        }
        this.dados[this.quantidade] = dado;
        this.quantidade++;

    }

    public void redimensionaVetor(double multiplicador) {
        int[] aux = new int[(int) (this.capacidade * multiplicador)];
        for (int i = 0; i < this.quantidade; i++)
            aux[i] = this.dados[i];
        this.dados = aux;
        this.capacidade = (int) (this.capacidade * multiplicador);
    }

    public void exibeVetor() {
        System.out.printf(" Capacidade do vetor: %d\n Quantidade de elementos: %d\n Lista: \n", this.capacidade,
                this.quantidade);
        if (this.vazio())
            System.out.println("Vazia");
        else
            for (int i = 0; i < this.quantidade; i++)
                System.out.print(this.dados[i] + " ");
    }

    public boolean vazio() {
        if (this.quantidade == 0)
            return true;
        else
            return false;
    }

    public void remove() {
        if (!vazio()) {
            this.quantidade--;
            if (this.capacidade >= 4 && this.quantidade <= 1.0 / 4.0 * this.capacidade) {
                this.redimensionaVetor(0.5);
            }

        }

    }
}