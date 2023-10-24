public class VetorDinamico {
    private int[] dados;
    private int capacidade;
    private int quantidade;

    public VetorDinamico() {
        this.capacidade = 4;
        this.dados = new int[this.capacidade];
    }

    public boolean estaCheio() {
        if (this.quantidade == this.capacidade) {
            return true;
        } else {
            return false;
        }
    }

    public void add(int dado) {
        if (estaCheio()) {
            this.aumentaCapacidade();
        }
        this.dados[this.quantidade] = dado;
        this.quantidade++;
    }

    public void aumentaCapacidade() {
        int[] aux = new int[this.capacidade * 2];
        for (int i = 0; i < quantidade; i++) {
            aux[i] = this.dados[i];
        }

        this.dados = aux;
        this.capacidade = this.capacidade * 2;

    }

    public void exibeVetor() {
        System.out.printf("\nCapacidade do vetor: %d\nQuantidade de elementos: %d\nLista:\n", this.capacidade,
                this.quantidade);
        for (int i = 0; i < this.quantidade; i++) {
            System.out.print(this.dados[i] + " ");
        }
    }

    public boolean estaVazio() {
        if (this.quantidade == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int remove() {
        this.quantidade--;
        return this.dados[this.quantidade];
    }

}
