package psc.A1;

import java.util.Locale;
import java.util.Scanner;

public class Lucro {
	private int numeroClientes;
	private double valorTotalGasto;

	public void calcularMediaGastoPorCliente() {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite o número de clientes: ");
		numeroClientes = leitor.nextInt();
		System.out.println();

		if (numeroClientes == 0 || numeroClientes < 0) {
			System.err.println("Desculpe, mas o número mínimo de clientes é 1.");
		} else {
			double mediaDoCliente = 0;
			for (int i = 1; i <= numeroClientes; i++) {
				System.out.printf("Cliente %d. Digite o valor gasto em bebidas: R$ ", i);
				double valorBebida = leitor.nextDouble();

				System.out.printf("Cliente %d. Digite o valor gasto em comidas: R$ ", i);
				double valorComida = leitor.nextDouble();

				double valorGasto = valorBebida + valorComida;
				valorTotalGasto = valorTotalGasto + valorGasto;
				mediaDoCliente = valorGasto / 2;
				System.out.printf("Média de gasta pelo cliente: R$ %.2f%n", mediaDoCliente);
				System.out.println();
			}

		}
		leitor.close();
	}

	public void calcularMediaGeral() {
		if (numeroClientes > 0) {
			double mediaGastoPorCliente = valorTotalGasto / numeroClientes;
			System.out.printf("Média geral de gastos por cliente: R$ %.2f%n", mediaGastoPorCliente);
		}
	}

	public static void main(String[] args) {
		Locale.setDefault(new Locale("pt", "BR"));

		System.out.println("Atenção! Forneça os dados separando os valores decimais por uma vírgula.");

		Lucro sistema = new Lucro();
		sistema.calcularMediaGastoPorCliente();
		sistema.calcularMediaGeral();
	}
}
