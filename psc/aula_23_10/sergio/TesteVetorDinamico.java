public class TesteVetorDinamico {
    public static void main(String[] args) {
        VetorDinamico v = new VetorDinamico();
        for (int i = 10; i <= 100; i = i + 10) {
            v.add(i);
            v.exibeVetor();
        }

        for (int i = 1; i <= 8; i++) {
            System.out.println(v.remove() + " saiu");
            v.exibeVetor();
        }

    }
}
