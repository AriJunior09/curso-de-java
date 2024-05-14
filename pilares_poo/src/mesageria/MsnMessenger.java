package mesageria;

public class MsnMessenger {
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN");
	}
	
	private void validarConectadoInternet() {
		System.out.println("Validando se esta conectado");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o historico de mensagens");
	}
}

