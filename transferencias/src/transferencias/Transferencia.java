package transferencias;

class Transferencia {
    private int numeroArquivo;
    private String lojaOrigem;
    private String lojaDestino;

    public Transferencia(int numeroArquivo, String lojaOrigem, String lojaDestino) {
        this.numeroArquivo = numeroArquivo;
        this.lojaOrigem = lojaOrigem;
        this.lojaDestino = lojaDestino;
    }

    public int getNumeroArquivo() {
        return numeroArquivo;
    }

    public String getLojaOrigem() {
        return lojaOrigem;
    }

    public String getLojaDestino() {
        return lojaDestino;
    }

    @Override
    public String toString() {
        return "Arquivo: " + numeroArquivo + ", Origem: " + lojaOrigem + ", Destino: " + lojaDestino;
    }
}