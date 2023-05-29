package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import util.Conversor;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Cotação do dólar: ");
		Conversor.dolar = sc.nextDouble();
		System.out.print("Quantos dólares vai ser comprado? ");
		Conversor.quantidade = sc.nextDouble();

		System.out.printf("Total a pagar: %.2f", Conversor.pagar() );

		sc.close();

	}

}
