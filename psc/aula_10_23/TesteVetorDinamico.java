package psc.aula_10_23;

public class TesteVetorDinamico {
    public static void main(String[] args) {
        VetorDinamico v = new VetorDinamico();

        for (int i = 10; i<=100; i = i + 10){
            v.add(i);
            v.exibeVetor();
        }
    }
}
