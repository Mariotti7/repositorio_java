package util;

public class CurrencyConverter {
	
	public static double dollarPrice;
	
	public static double converter(double real) {
		return real * dollarPrice + (dollarPrice * real * 0.06);//Calculo do parentese calcula o IOF e soma com a conversão
	}
	
}

/* OU
 
 * public static double IOF = 0.06;
 
	public static double dollarToReal(double amount, double dollarPrice) {
	return amount * dollarPrice * (1.0 + IOF);
}
 * 
 * */
 