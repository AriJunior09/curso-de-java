package apps;

public abstract class ServicoMensagem {
	
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	public abstract void salvarHistoricoMensagem();
	
	// Somente os Filhos conhecem esse método:
	protected void validarConectadoInternet() {
		System.out.println("Validando se esta conectado na Internet");
	}
}


