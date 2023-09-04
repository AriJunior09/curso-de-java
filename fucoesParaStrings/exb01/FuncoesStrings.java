package exb01;

public class FuncoesStrings {
   
    /**
     * @param args
     */
    public static void main(String[] args) {

        String original = "abcd EFGH abcd EFGH ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        final String s04 = original.substring(2);
        final String s05 = original.substring(2, 9);
        String s06 = original.replace("a", "x");
        String s07 = original.replace("abc", "xyz");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");
        
        System.out.println("String Original:       >>>" + original + "<<<");
        System.out.println("Usando o toLowerCase:  >>>" + s01 + "<<<");  /// Coloca tudo em minúsculo.
        System.out.println("Usando o toUpperCase:  >>>" + s02 + "<<<");  /// Coloca tudo em maiúsculo.
        System.out.println("Usando o trim:         >>>" + s03 + "<<<");  /// Remove os espaços no começo e fim da String.
        System.out.println("Usando substring(2):   >>>" + s04 + "<<<"); /// Cria uma nova string a partir da posição 2.
        System.out.println("Usando substring(2,9): >>>" + s05 + "<<<"); /// Cria uma nova string a partir da posição 2 até a 9.
        System.out.println("Usando replace(a,x):   >>>" + s06 + "<<<");  /// Troca onde tiver "a" por "x".
        System.out.println("Usando replace(abc,xy):>>>" + s07 + "<<<");  /// Troca onde tiver "abc" por "xy".
        System.out.println("Primeira vez que bc aparece é na posição: " + i);
        System.out.println("Última vez que bc aparece  é na posição: " + j );


    }
     
}
	

