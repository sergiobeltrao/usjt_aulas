import java.util.Scanner;

public class CalculoMediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2;
        int contador = 1;
        
        while (contador <= 3) {
            System.out.print("Digite a nota 1: ");
            nota1 = scanner.nextDouble();
            
            System.out.print("Digite a nota 2: ");
            nota2 = scanner.nextDouble();
            
            double media = (nota1 + nota2) / 2;
            System.out.println("Média: " + media);
            
            contador++;
        }
        
        scanner.close();
    }
}