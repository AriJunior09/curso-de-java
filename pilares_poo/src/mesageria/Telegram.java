package mesageria;

public class Telegram {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
	
	private void validarConectadoInternet() {
		System.out.println("Validando se esta conectado");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o historico de mensagens");
	}
}