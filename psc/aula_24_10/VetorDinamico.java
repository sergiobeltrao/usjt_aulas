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
            this.redimensionaVetor(2.0);
        }
        this.dados[this.quantidade] = dado;
        this.quantidade++;
    }

    public void redimensionaVetor(double multiplicador) {
        int[] aux = new int[(int) (this.capacidade * multiplicador)];
        for (int i = 0; i < quantidade; i++) {
            aux[i] = this.dados[i];
        }
        this.dados = aux;
        this.capacidade = (int) (this.capacidade * multiplicador);

    }

    public void exibeVetor() {
        System.out.printf("\nCapacidade do vetor: %d\nQuantidade de elementos: %d\nLista:\n", this.capacidade,
                this.quantidade);

        if (this.estaVazio()) {
            System.out.println("Vazio");
        } else {

            for (int i = 0; i < this.quantidade; i++) {
                System.out.print(this.dados[i] + " ");

            }
        }

    }

    public boolean estaVazio() {
        if (this.quantidade == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void remove() {
        if (!estaVazio()) {
            this.quantidade--;

            if (this.capacidade >= 4 && this.quantidade <= 1.0 / 4.0 * this.capacidade) {
                this.redimensionaVetor(0.5);
            }
        }
    }

}
