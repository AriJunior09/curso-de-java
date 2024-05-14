package mesageria;

public abstract class ServicoMensagem {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	private void validarConectadoInternet() {
		System.out.println("Validando se esta conectado");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o historico de mensagens");
	}
}


