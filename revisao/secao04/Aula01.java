package revisao.secao04;

public class Aula01 {
    public static void main(String[] args) {

    // Tema Principal: Processamento de dados, Casting.
    System.out.println("Exemplo: 01");
    int x, y;
    x = 5;
    y = 2 * x;
    System.out.println(x);
    System.out.println(y);
    System.out.println();


     System.out.println("Exemplo: 02");
    
     int x2;
     double y2;                // Mudamos para o tipo double
     x2 = 5;
     y2 = 2 * x;
     System.out.println(x2);
     System.out.println(y2);   // Saída do tipo double
     System.out.println();


     System.out.println("Exemplo: 03");
    
     double b, B, h, area;       // Usando o double
     b = 6.0;
     B = 8.0;
     h = 5.0;
     area = (b + B) / 2.0 * h;
     System.out.println(area);   // Saída do tipo double


     System.out.println("Exemplo: 04");
    
     float b2, B2, h2, area2;      // Usando o float
     b2 = 6f;
     B2 = 8f;
     h2 = 5f;
     area2 = (b2 + B2) / 2f * h2;
     System.out.println(area2);    // Saída do tipo float           

    }
}
