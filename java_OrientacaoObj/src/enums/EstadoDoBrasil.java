package enums;

public enum EstadoDoBrasil {
    ACRE("Acre", "AC", 68),
    ALAGOAS("Alagoas", "AL", 82),
    AMAPA("Amapá", "AP", 96),
    AMAZONAS("Amazonas", "AM", 92),
    BAHIA("Bahia", "BA", 71),
    CEARA("Ceará", "CE", 85),
    DISTRITO_FEDERAL("Distrito Federal", "DF", 61),
    ESPIRITO_SANTO("Espírito Santo", "ES", 27),
    GOIAS("Goiás", "GO", 62),
    MARANHAO("Maranhão", "MA", 98),
    MATO_GROSSO("Mato Grosso", "MT", 65),
    MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "MS", 67),
    MINAS_GERAIS("Minas Gerais", "MG", 31),
    PARA("Pará", "PA", 91),
    PARAIBA("Paraíba", "PB", 83),
    PARANA("Paraná", "PR", 41),
    PERNAMBUCO("Pernambuco", "PE", 81),
    PIAUI("Piauí", "PI", 86),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ", 21),
    RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "RN", 84),
    RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS", 51),
    RONDONIA("Rondônia", "RO", 69),
    RORAIMA("Roraima", "RR", 95),
    SANTA_CATARINA("Santa Catarina", "SC", 48),
    SAO_PAULO("São Paulo", "SP", 11),
    SERGIPE("Sergipe", "SE", 79),
    TOCANTINS("Tocantins", "TO", 63);

    private final String nome;
    private final String sigla;
    private final int ddd;

    // Construtor privado para inicialização
    private EstadoDoBrasil(String nome, String sigla, int ddd) {
        this.nome = nome;
        this.sigla = sigla;
        this.ddd = ddd;
    }

    // Método getter para o nome do estado
    public String getNome() {
        return nome;
    }

    // Método getter para a sigla do estado
    public String getSigla() {
        return sigla;
    }

    // Método getter para o DDD do estado
    public int getDDD() {
        return ddd;
    }
}
