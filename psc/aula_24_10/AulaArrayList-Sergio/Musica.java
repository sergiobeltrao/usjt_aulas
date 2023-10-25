public class Musica {
    private String nome;
    private int avaliacao;

    public Musica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getAvaliacao() {
        return this.avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
}
