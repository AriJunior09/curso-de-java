package entidade;

public class Impostos {
	public double a;
	public double b;
	public double c;
	
	
	
	public double icms() {
		double aux;
		aux = (a * b / 100);
		return aux;
	}
	
	public double ipi() {
		double aux;
		aux = (a * c / 100);
		return aux;
	}

	public String toString() {
		return   "\nBASE DE ICMS: R$ "
				+ String.format("%.2f%n", icms())
				+ "IPI: R$ "
				+ String.format("%.2f%n", ipi())
				+ "Total com o IPI: R$ "
				+ String.format("%.2f%n", (a + ipi()));
		 
	}
}

