package psc.aula_09_18;

public class Pares50a500 {
    public static void main(String[] args) {
        System.out.println("Pares de 50 a 500");
        for (int i=50; i<=500; i=i+2) {
        System.out.print(i + " ");
        }
        System.out.println("\n\nDe Novo...");
        int i=50;
        while (i<=500) {
            System.out.print(i + " ");
            i= i+2;
        }
    }
}
