package mesageria;

public class Facebook {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook");
	}
	
	private void validarConectadoInternet() {
		System.out.println("Validando se esta conectado");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o historico de mensagens");
	}
}

