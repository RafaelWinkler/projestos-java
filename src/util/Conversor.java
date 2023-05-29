package util;

public class Conversor {
	public static double dolar;
	public static double quantidade;

	public static double pagar() {

		double compra = dolar * quantidade;
		double imposto = compra * 6 / 100;
		double pagar = compra + imposto;
		return pagar;
	}

}
