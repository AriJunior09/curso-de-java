package aplication;

public class Program11 {

	public static void main(String[] args) {
    int x = 20;              // Criando uma variável "x" do tipo int;
    Object obj = x;          // Criando um objeto e adicionando o valor de "x" nele, isso é chamado de "Boxing";
    System.out.println(obj); // Ao imprimir o "obj" o valor mostrado será "20" o valor do "x";
    int y = (int) obj;       // Criando a variável "y" e add o valor de "obj" nele, isso é chamado de "Unboxing";
    System.out.println(y);   // Ao imprimir o "y" o valor mostrado é o "20" o mesmo valor de "x".

    /* Resumo:
     * Criamos uma variável tipo int "x" e colocamos o valor dele de 20;
     * Criamos um objeto e dentro dele encaixamos(Boxing) o valor de x;
     * Imprimimos o objeto;
     * Criamos outra variável tipo int "y" e nela desencaixamos(Unboxing) o valor o objeto;
     * Imprimimos o valor de y;
     */
  
    
    
	}

}
