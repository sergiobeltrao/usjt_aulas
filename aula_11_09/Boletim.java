import java.util.Scanner;

public class Boletim {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a nota 1:");
		double nota1 = scan.nextDouble();

		System.out.println("Digite a nota 2:");
		double nota2 = scan.nextDouble();

		double media = (nota1 + nota2) / 2;

		if (media >= 7) {
			System.out.println("Aprovado: " + media);
		} else {
			System.out.println("Reprovado: " + media);
			scan.close();
		}
	}
}