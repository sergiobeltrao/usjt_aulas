import java.util.Scanner;

public class OlaMundo {
	public static void main(String[] args) {
		System.out.println("Olá mundo!");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira um numero");
		int numero = scanner.nextInt();
		if (numero % 2 == 0) {
			System.out.println("O numero " + numero + " eh par");
		} else {
			System.out.println("O numero " + numero + " eh impar");
		}
		scanner.close();
	}

}