package util;

public class Program07B {
	public final double IOF = 0.06;
	public double dollar;
	public double reais;	
	
	
	public double converter(double reais, double dollar) {
		double conversao = reais * dollar;
		return conversao;
	}
	
	public double taxa(double conversao, double IOF) {
		 double tax = conversao * IOF;
		 return tax;
	}
	
	public double compraFinal(double conversao, double tax) {
		return conversao + tax;
	}
	
}
	
