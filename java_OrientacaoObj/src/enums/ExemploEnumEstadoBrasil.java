package enums;

public class ExemploEnumEstadoBrasil {
    public static void main(String[] args) {
        // Acessando informações sobre o estado de São Paulo
//        EstadoDoBrasil eBr = EstadoDoBrasil.SAO_PAULO;
//        System.out.println("Estado: " + eBr.getNome());
//        System.out.println("Sigla: " + eBr.getSigla());
//        System.out.println("DDD: " + eBr.getDDD());
//        
        
        //Usando o for para acessar todos os Enuns:
        for(EstadoDoBrasil e: EstadoDoBrasil.values()) {
        	System.out.println(e.getSigla() + " - " 
        			+ e.getNome() + " - " 
        			+ e.getDDD());
        }
          
        
    }
}
