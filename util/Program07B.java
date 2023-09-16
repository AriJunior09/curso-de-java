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
	
/*Para calcular quanto você precisa pagar em IOF ao comprar 200 dólares 
  com uma taxa de câmbio de 5 reais por dólar e uma taxa de IOF de 6%,
  você pode seguir os seguintes passos:

Passo 1: Calcule o valor total em reais da compra dos 200 dólares.

Valor em reais = Valor em dólares x Taxa de câmbio
Valor em reais = 200 dólares x 5 reais/dólar
Valor em reais = 1000 reais

Passo 2: Calcule o valor do IOF.

Valor do IOF = Valor em reais x Taxa de IOF
Valor do IOF = 1000 reais x 6%
Valor do IOF = 1000 reais x 0,06
Valor do IOF = 60 reais

Portanto, você precisará pagar 60 reais em IOF ao comprar 200 dólares com
 uma taxa de câmbio de 5 reais por dólar e uma taxa de IOF de 6%. 
 O valor total da compra será de 1000 reais mais os 60 reais de IOF, 
 totalizando 1060 reais.*/
	

